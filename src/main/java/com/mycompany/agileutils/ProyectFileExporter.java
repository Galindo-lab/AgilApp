/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agileutils;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Task;
import net.sf.mpxj.TaskContainer;
import net.sf.mpxj.mpx.MPXWriter;
import net.sf.mpxj.writer.ProjectWriter;
import org.apache.commons.io.FilenameUtils;

/**
 * Clase para exportar el proyect a un archivo MPXJ
 *
 * @author Eduar
 */
public class ProyectFileExporter {

    private ProjectFile projectFile; // arhivo MPXJ
    private Proyect project; // parte de la bibloteca para AGIL

    /**
     * @param project Proyecto de AGIL-UTILS
     * @param projectFile Proyecto de MPXJ
     */
    public ProyectFileExporter(Proyect project, ProjectFile projectFile) {
        this.project = project;
        this.projectFile = projectFile;
    }

    /**
     * exportar tareas
     */
    private void exportTaskboard() {
        project.taskboard.export(projectFile);
    }

    /**
     * exportar miembros y equipos
     */
    private void exportTeams() {
        for (Team team : project.teams) {
            team.export(projectFile);
        }
    }

    /**
     * gregar las relaciones entre las tareas y los miembros
     */
    private void exportAssignations() {
        for (var task : project.taskboard.activities) {
            Task foo = projectFile.getTaskByID(task.getId());
            TeamMember member = task.getTeamMember();

            if (member != null) {
                var a = projectFile.getResourceByID(member.getId());
                foo.addResourceAssignment(a);
            }
        }
    }
    
    private void exportUserHistories()
    {
        
    }

    /**
     * Escribe el archivo MPX
     *
     * @throws IOException
     */
    public void write() throws IOException {
        
        this.exportTaskboard();
        this.exportTeams();
        this.exportAssignations();

        ProjectWriter writer = new MPXWriter();

        //File a = project.getPath().toFile();
        File a = project.getFile().getPath().toFile();
        
        if (FilenameUtils.getExtension(a.toString()).equals("")) {
            a = new File(a.toString() + ".mpx");
        }
        
        writer.write(projectFile, a);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProyectFileExporter{");
        sb.append("projectFile=").append(projectFile);
        sb.append(", project=").append(project);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}

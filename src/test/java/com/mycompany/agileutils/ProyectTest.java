/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.agileutils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ERICK
 */
public class ProyectTest {

    @Test
    public void testCreateTeam() {
        // Crear una instancia de Proyect
        Proyect project = new Proyect("Proyecto", "Objetivo");

        // Crear un nuevo equipo
        Team team = project.createTeam("EquipoA");

        // Verificar que el equipo se haya creado correctamente
        assertNotNull(team);
        assertEquals("EquipoA", team.getName());
        assertEquals(0, team.size());
    }

    @Test
    public void testRemoveTeam() {
        // Crear una instancia de Proyect
        Proyect project = new Proyect("Proyecto", "Objetivo");

        // Crear y agregar un equipo
        Team team = new Team("EquipoA");
        project.teams.add(team);

        // Eliminar el equipo
        project.removeTeam("EquipoA");

        // Verificar que el equipo se haya eliminado correctamente
        assertEquals(0, project.teams.size());
    }

    @Test
    public void testGetTeam() {
        // Crear una instancia de Proyect
        Proyect project = new Proyect("Proyecto", "Objetivo");

        // Crear y agregar un equipo
        Team team = new Team("EquipoA");
        project.teams.add(team);

        // Obtener el equipo por nombre
        Team retrievedTeam = project.getTeam("EquipoA");

        // Verificar que el equipo se haya obtenido correctamente
        assertNotNull(retrievedTeam);
        assertEquals("EquipoA", retrievedTeam.getName());
    }
}
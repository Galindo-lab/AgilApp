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
public class ArtifactTest {

    @Test
    public void testDisplay() {
        Artifact artifact = new ArtifactImpl();
        artifact.display();
    }

    @Test
    public void testSave() {
        Artifact artifact = new ArtifactImpl();
        artifact.save();
    }

    private static class ArtifactImpl implements Artifact {
        // Implementación de la interfaz Artifact

        @Override
        public void display() {
            // Lógica para mostrar el artefacto
        }

        @Override
        public void save() {
            // Lógica para guardar el artefacto
        }
    }
}
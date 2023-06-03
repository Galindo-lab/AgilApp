/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.agileutils;

import net.sf.mpxj.Resource;
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
public class TeamMemberTest {

    @Test
    public void testConstructorAndGetters() {
        String name = "John Doe";
        String email = "john@example.com";
        int id = 0;

        TeamMember teamMember = new TeamMember(name, email);

        // Verificar que los valores se asignen correctamente en el constructor
        assertEquals(name, teamMember.getName());
        assertEquals(email, teamMember.getEmail());
        assertEquals(id, teamMember.getId());
    }

    @Test
    public void testToString() {
        String name = "John Doe";
        String email = "john@example.com";
        int id = 5;

        TeamMember teamMember = new TeamMember(name, email);
        teamMember.setId(id);

        // Verificar que el método toString devuelva el formato de cadena esperado
        String expectedToString = "TeamMember{name=John Doe, email=john@example.com, id=5}";
        assertEquals(expectedToString, teamMember.toString());
    }
}
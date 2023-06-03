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
public class RequirementTest {

    @Test
    public void testGetDescription() {
        Requirement requirement = new Requirement("Description");
        assertEquals("Description", requirement.getDescription());
    }

    @Test
    public void testSetDescription() {
        Requirement requirement = new Requirement("Description");
        requirement.setDescription("New Description");
        assertEquals("New Description", requirement.getDescription());
    }

    @Test
    public void testToString() {
        Requirement requirement = new Requirement("Description");
        assertEquals("Requirement{description=Description}", requirement.toString());
    }
}
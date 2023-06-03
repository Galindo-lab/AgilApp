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
public class UserHistoryTest {

    @Test
    public void testConstructorAndGetters() {
        String title = "User History Title";
        String description = "User History Description";
        String acceptanceCriteria = "User History Acceptance Criteria";

        UserHistory userHistory = new UserHistory(title, description, acceptanceCriteria);

        // Verificar que los valores se asignen correctamente en el constructor
        assertEquals(title, userHistory.getTitle());
        assertEquals(description, userHistory.getDescription());
        assertEquals(acceptanceCriteria, userHistory.getAceptationCriteria());
    }

    @Test
    public void testSetters() {
        String title = "User History Title";
        String description = "User History Description";
        String acceptanceCriteria = "User History Acceptance Criteria";

        UserHistory userHistory = new UserHistory("", "", "");

        // Verificar que los setters asignen correctamente los valores
        userHistory.setTitle(title);
        userHistory.setDescription(description);
        userHistory.setAceptationCriteria(acceptanceCriteria);

        assertEquals(title, userHistory.getTitle());
        assertEquals(description, userHistory.getDescription());
        assertEquals(acceptanceCriteria, userHistory.getAceptationCriteria());
    }

    @Test
    public void testToString() {
        String title = "User History Title";
        String description = "User History Description";
        String acceptanceCriteria = "User History Acceptance Criteria";

        UserHistory userHistory = new UserHistory(title, description, acceptanceCriteria);

        // Verificar que el método toString devuelva el formato esperado
        String expectedToString = "UserHistory{title=User History Title, description=User History Description, aceptationCriteria=User History Acceptance Criteria}";
        assertEquals(expectedToString, userHistory.toString());
    }
}

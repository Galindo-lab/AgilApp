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
public class BacklogTest {

    @Test
    public void testAddItem() {
        Backlog backlog = new BacklogImpl();
        Object item = new Object();
        backlog.addItem(item);
    }

    @Test
    public void testRemoveItem() {
        Backlog backlog = new BacklogImpl();
        Object item = new Object();
        backlog.addItem(item);
        backlog.removeItem(1); 
    }

    private static class BacklogImpl implements Backlog {
       

        @Override
        public void addItem(Object o) {
            
        }

        @Override
        public void removeItem(int id) {
          
        }
    }
}
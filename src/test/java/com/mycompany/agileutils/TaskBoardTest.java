/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.agileutils;

import java.util.Date;
import net.sf.mpxj.ProjectFile;
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
public class TaskBoardTest {

    @Test
    public void testAdd() {
        TaskBoard taskBoard = new TaskBoard();

        Task task1 = new Task("Task 1", "Description 1", new Date(), new Date());
        taskBoard.add(task1);
        assertEquals(1, taskBoard.size());
        assertEquals(task1, taskBoard.get(0));

        Task task2 = new Task("Task 2", "Description 2", new Date(), new Date());
        taskBoard.add(task2);
        assertEquals(2, taskBoard.size());
        assertEquals(task2, taskBoard.get(1));
    }

    @Test
    public void testRemove() {
        TaskBoard taskBoard = new TaskBoard();

        Task task1 = new Task("Task 1", "Description 1", new Date(), new Date());
        Task task2 = new Task("Task 2", "Description 2", new Date(), new Date());
        taskBoard.add(task1);
        taskBoard.add(task2);

        taskBoard.remove(0);
        assertEquals(1, taskBoard.size());
        assertEquals(task2, taskBoard.get(0));
    }

    @Test
    public void testGetByID() {
        TaskBoard taskBoard = new TaskBoard();

        Task task1 = new Task("Task 1", "Description 1", new Date(), new Date());
        task1.setId(1);
        Task task2 = new Task("Task 2", "Description 2", new Date(), new Date());
        task2.setId(2);
        taskBoard.add(task1);
        taskBoard.add(task2);

        assertEquals(task1, taskBoard.getByID(1));
        assertEquals(task2, taskBoard.getByID(2));
        assertNull(taskBoard.getByID(3));
    }

    @Test
    public void testUpdateTask() {
        TaskBoard taskBoard = new TaskBoard();

        Task task1 = new Task("Task 1", "Description 1", new Date(), new Date());
        Task task2 = new Task("Task 2", "Description 2", new Date(), new Date());
        taskBoard.add(task1);
        taskBoard.add(task2);

        Task updatedTask = new Task("Updated Task", "Updated Description", new Date(), new Date());
        updatedTask.setId(task1.getId());

        taskBoard.updateTask(updatedTask);
        assertEquals("Updated Task", taskBoard.get(0).getName());
        assertEquals("Updated Description", taskBoard.get(0).getDescription());
    }
}
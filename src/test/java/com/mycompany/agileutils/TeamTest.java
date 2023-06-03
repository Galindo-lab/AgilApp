/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.agileutils;

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
public class TeamTest {

    @Test
    public void testSize() {
        Team team = new Team("Team A");
        assertEquals(0, team.size());

        TeamMember member1 = new TeamMember("John Doe", "john@example.com");
        team.addMember(member1);
        assertEquals(1, team.size());

        TeamMember member2 = new TeamMember("Jane Smith", "jane@example.com");
        team.addMember(member2);
        assertEquals(2, team.size());

        team.removeMember("John Doe");
        assertEquals(1, team.size());
    }

    @Test
    public void testGetMember() {
        Team team = new Team("Team A");

        TeamMember member1 = new TeamMember("John Doe", "john@example.com");
        TeamMember member2 = new TeamMember("Jane Smith", "jane@example.com");
        team.addMember(member1);
        team.addMember(member2);

        assertEquals(member1, team.getMember("John Doe"));
        assertEquals(member2, team.getMember("Jane Smith"));
        assertNull(team.getMember("Invalid Member"));
    }

    @Test
    public void testRemoveMember() {
        Team team = new Team("Team A");

        TeamMember member1 = new TeamMember("John Doe", "john@example.com");
        TeamMember member2 = new TeamMember("Jane Smith", "jane@example.com");
        team.addMember(member1);
        team.addMember(member2);

        team.removeMember("John Doe");
        assertEquals(1, team.size());
        assertNull(team.getMember("John Doe"));
        assertEquals(member2, team.getMember("Jane Smith"));
    }

    @Test
    public void testUpdateMember() {
        Team team = new Team("Team A");

        TeamMember member1 = new TeamMember("John Doe", "john@example.com");
        team.addMember(member1);

        team.updateMember(Integer.toString(member1.getId()), "John Smith", "john.smith@example.com");
        assertEquals("John Smith", member1.getName());
        assertEquals("john.smith@example.com", member1.getEmail());
    }
}
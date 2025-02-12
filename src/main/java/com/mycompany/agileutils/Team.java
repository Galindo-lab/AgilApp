package com.mycompany.agileutils;

import java.util.Vector;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Resource;

public class Team {

    private String name;
    Vector<TeamMember> members = new Vector<>();
    private String scrumMaster;

    public Team(String name) {
        this.name = name;
    }
    
    public int size(){
        return members.size();
    }

    void export(ProjectFile projectFile) {
        for (TeamMember member : this.members) {
            Resource resource = projectFile.addResource();
     
            resource.setGroup(this.name);
            member.export(resource);
        }
    }
    
    public TeamMember getMemberByIndex(int index)
    {
        return members.get(index);
    }
    
    public TeamMember getMemberByID(int id)
    {
        int index = this.getMemberIndexByName(name);
        
        if (index != -1) {
            return this.members.get(index);
        }
        
        return null;
    }
    
    public int getMemberIndexByID(int id)
    {
        for (int i = 0; i < this.members.size(); i++) {
            if (this.members.get(i).getId() == id) {
                return i;
            }
        }
        
        return -1;
    }
    
    public int getMemberIndexByName(String name)
    {
        for (int i = 0; i < this.members.size(); i++) {
            if (this.members.get(i).getName().equals(name)) {
                return i;
            }
        }
        
        return -1;
    }
    
    public TeamMember getMember(String name)
    {
        int index = this.getMemberIndexByName(name);
        
        if (index != -1) {
            return this.members.get(index);
        }
        
        return null;
    }
    
    public void addMember(TeamMember teamMember)
    {
        this.members.add(teamMember);
    }
    
    public void removeMember(String name){
        int index = this.getMemberIndexByName(name);
        
        if (index == -1){
            return;
        }
        
        this.members.remove(index);
    }
    public void updateMember(String memberId, String name, String email) {
        int updatedID = Integer.parseInt(memberId);
        for (TeamMember member : members) {
            if (member.getId() == updatedID) {
                member.setName(name);
                member.setEmail(email);
                break;
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team{");
        sb.append("name=").append(name);
        sb.append(", members=").append(members);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(String scrumMaster) {
        this.scrumMaster = scrumMaster;
    }
    
    

}

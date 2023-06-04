package com.mycompany.agileutils;

import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Resource;
import net.sf.mpxj.ResourceAssignment;

public class TeamMember {

    private static int id_key = 0;
    
    private String name;
    private String email;
    private int id;

    /**
     * @param email
     * @deprecated 
     * @param ID
     * @param name 
     */
    @Deprecated
    public TeamMember(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = 0;
    }
//    
//    public TeamMember(String name) {
//        this.name = name;
//        this.id = id_key;
//        
//        id_key++;
//    }

    void export(Resource resource) {
        resource.setName(this.name);
        resource.setID(this.id);
        resource.setEmailAddress(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getTeam() {
        return email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TeamMember{");
        sb.append("name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }

}

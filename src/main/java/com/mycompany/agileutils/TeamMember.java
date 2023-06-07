package com.mycompany.agileutils;

import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Resource;
import net.sf.mpxj.ResourceAssignment;

public class TeamMember {

    private static int id_key = 0;

    private int id;
    private String name;
    private String email;
    private String details;

    /**
     * @param email
     * @deprecated
     * @param name
     */
    @Deprecated
    public TeamMember(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = 0;
        this.details = "";
    }

    void export(Resource resource) {

        resource.setName(name);

        resource.setID(id);
        resource.setEmailAddress(email);
        resource.setDescription(details);
    }

    public void setScrumMaster(boolean state) {
        this.details = state ? "Scrum Master" : "";
    }

    public boolean isScrumMaster() {
        return this.details.equals("Scrum Master");
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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
        sb.append(", details=").append(details);
        sb.append('}');
        return sb.toString();
    }

}

package io.jobset.jobapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Faculty")
public class Faculty {

    @Id
    private String facId;
    
    private String name;
    //private int currStu;
    private int currStu;
    private int prevStu;
    private String password;

    public Faculty(){

    }

    public Faculty(String facId, String name, int curr, int prev, String password){
        this.facId = facId;
        this.name = name;
        this.currStu = curr;
        this.prevStu = prev;
    }

    public String getFacId() {
        return facId;
    }

    public void setFacId(String facId) {
        this.facId = facId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrStudents() {
        return currStu;
    }

    public void setCurrStudents(int currStu) {
        this.currStu = currStu;
    }

    public int getPrevStu() {
        return prevStu;
    }

    public void setPrevStu(int prevStu) {
        this.prevStu = prevStu;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    
    
}

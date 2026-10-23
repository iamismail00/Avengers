package Ismail.DemoSpring.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AvengersModel {


    @Id
    private int no;
    private String name;
    private String power;
    private char team;

    public AvengersModel(int no, String name, String power, char team) {
        this.no = no;
        this.name = name;
        this.power = power;
        this.team = team;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public char getTeam() {
        return team;
    }

    public void setTeam(char team) {
        this.team = team;
    }

    public AvengersModel(){

    }




}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class SpecUser extends User {

    private String address;

    public SpecUser() {
    }

    public SpecUser(String name, int status, String address) {
        super(name, status);
        this.address = address;
    }

    @Override
    public String toString() {
        return name + ", " + address + ", " + status;
    }

    public void setData() {
        String newName = name + address;
        this.name = newName;
    }
    public String getValue(){
        String value = "";
        if (status == 1){
            value = name + "admin";
        }
        else{
            value = name + "user";
        }
        return value;
    }
}

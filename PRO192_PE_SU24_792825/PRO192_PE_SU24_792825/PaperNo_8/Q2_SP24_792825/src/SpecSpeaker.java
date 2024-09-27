/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class SpecSpeaker extends Speaker {
    private String sound;

    public SpecSpeaker() {
    }

    public SpecSpeaker(String name,  int power, String sound) {
        super(name, power);
        this.sound = sound;
    }

    @Override
    public String toString() {
        return name + " " + sound + " " + power;
    }
    public void setData(){
        StringBuilder finalName = new StringBuilder();
        for (int i = 1; i < name.length(); i++){
            finalName.append(name.charAt(i));
        }
        this.name = finalName.toString();
    }
    public String getValue(){
        if (power > 10){
            return sound+power;
        }
        else{
            return sound;
        }
    }  
}

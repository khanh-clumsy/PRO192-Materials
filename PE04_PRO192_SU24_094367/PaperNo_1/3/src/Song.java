/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Song implements Comparable<Song> {

    private String name;
    private int duration;

    public Song() {
    }

    public Song(String name, int duration) {
        this.name = name.toUpperCase();
        if (duration < 1){
            this.duration = 1;
        }else{
            this.duration = duration;
        }
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return name + ", " + duration;
    }

    @Override
    public int compareTo(Song o) {
        return this.getName().compareTo(o.getName());
    }
    
}

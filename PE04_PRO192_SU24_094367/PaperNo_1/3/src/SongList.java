
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class SongList extends TreeSet<Song>{
    public void addSong(Song song){
        this.add(song);
    }
    public Song getSongMaxDuration(){
        return Collections.max(this, Comparator.comparingInt(Song::getDuration));
    }
    public void printSongList(){
        for (Song song : this){
            System.out.println(song);
        }
    }
}

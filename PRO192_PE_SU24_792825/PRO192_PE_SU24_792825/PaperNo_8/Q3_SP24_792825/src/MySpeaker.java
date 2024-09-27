
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class MySpeaker implements ISpeaker{

    @Override
    public int f1(List<Speaker> t) {
        int count = 0;
        for (Speaker s : t){
            if (s.getPower() > 10){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Speaker> t) {
        List<Speaker> newList = t.subList(0, 5);
        Collections.sort(newList, new Comparator<Speaker>(){
            @Override
            public int compare(Speaker s1, Speaker s2){
                return s1
            }
        }
    }

    @Override
    public void f3(List<Speaker> t) {
    }
    
}

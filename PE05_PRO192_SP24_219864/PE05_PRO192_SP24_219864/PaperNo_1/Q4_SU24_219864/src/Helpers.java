/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Helpers implements Actionable{

    @Override
    public int countWords(String string) {
        String words[] = string.trim().split("\\s+");
        return words.length;
    }

    @Override
    public String getFirstWord(String string) {
        String words[] = string.split("\\s+");
        String newStr = words[0];
        return newStr.substring(0,1).toUpperCase() + newStr.substring(1);
    }
    
}

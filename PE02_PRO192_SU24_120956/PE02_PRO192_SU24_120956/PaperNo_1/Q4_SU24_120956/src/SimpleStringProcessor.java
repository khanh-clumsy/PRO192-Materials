/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class SimpleStringProcessor implements StringProcessor {

    @Override
    public int countCharacters(String string, char c) {
        int count = 0;
        char lowerC = Character.toLowerCase(c);
        for (char c1 : string.toLowerCase().toCharArray()) {
            if (lowerC == c1) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int countWordBeginByString(String s1, String s2) {
        String newS1 = s1.toLowerCase();
        String newS2 = s2.toLowerCase();
        int count = 0;
        for (String word : newS1.split("\\s+")) {
            if (word.startsWith(newS2)) {
                count++;
            }
        }
        return count;
    }
}

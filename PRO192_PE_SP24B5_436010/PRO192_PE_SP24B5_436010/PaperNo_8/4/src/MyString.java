/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class MyString implements IString {

    @Override
    public int f1(String string) {
        int countWord = 0;
        for (String word : string.split("\\s+")) {
            boolean hasLetter = false;
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    hasLetter = true;
                    break;
                }
            }
            if (hasLetter){
                countWord++;
            }
        }
        return countWord;
    }

    @Override
    public String f2(String string) {
        String words[] = string.split("\\s+");
        StringBuilder finalStr = new StringBuilder();
        for (int i = 0; i < words.length-1; i++) {
            finalStr.append(words[i]);
            finalStr.append(" ");
            
        }
        return finalStr.toString().trim();
    }
}

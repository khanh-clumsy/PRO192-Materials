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
        String words[] = string.split("\\s+");
        int count = 0;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    if (Character.getNumericValue(c) % 2 == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String string) {
        String words[] = string.split("\\s+");
        StringBuilder finalStr = new StringBuilder();
        boolean replaced = false;

        for (String word : words) {
            if (!replaced) {
                StringBuilder newWord = new StringBuilder();
                String reversedWord = newWord.reverse().toString();
                if (word.equals(reversedWord)) {
                    replaced = true;
                    finalStr.append("YY");
                } else {
                    finalStr.append(word);
                }
            } else {
                finalStr.append(word);
            }
            finalStr.append(" ");
        }
        return finalStr.toString();
    }
}

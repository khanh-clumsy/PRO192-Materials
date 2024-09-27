/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class TextProcessorImpl implements TextProcessor {

    @Override
    public String removeWhitespace(String input) {
        StringBuilder finalStr = new StringBuilder();
        for (String word : input.split("\\s+")) {
            finalStr.append(word);
        }
        return finalStr.toString().trim();
    }

    @Override
    public int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

}

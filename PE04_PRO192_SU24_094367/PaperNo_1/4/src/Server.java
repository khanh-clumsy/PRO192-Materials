/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Server implements Protocol{

    @Override
    public String sendMessage(String string) {
        int length = string.length();
        String finalStr = String.format("65535:%d:%s", length, string);
        return finalStr.trim();
    }

    @Override
    public String receivePacket(String string) {
        String words[] = string.split(":");
        String finalStr = words[words.length-1];
        return finalStr.trim();
    }
}

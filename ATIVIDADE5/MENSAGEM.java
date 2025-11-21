package com.exemplo;

public class MessageCounter {
    public static int countLines(int limit, String msg) {
        int linhas = 0;
        int i = 0;
        
        while (i < msg.length()) {
            while (i < msg.length() && msg.charAt(i) == ' ') i++;
            if (i >= msg.length()) break;
            
            linhas++;           
            i += limit;         
        }
        return linhas;
    }
}
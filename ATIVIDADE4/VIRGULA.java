
package com.exemplo;

public class VIRGULA {
    public static String[] split(String line) {
        int idx = line.indexOf(',');
        return new String[]{ line.substring(0, idx), line.substring(idx + 1).trim() };
    }
}

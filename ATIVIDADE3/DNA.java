package com.exemplo;

import java.util.Scanner;

public class DNA {
    public static boolean isResistente(String d, String s) {
        return d.contains(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String dna = sc.nextLine();
            String pedaco = sc.nextLine();
            
            if (dna.contains(pedaco)) {
                System.out.println("Resistente");
            } else {
                System.out.println("Nao resistente");
            }
        }
    }
}
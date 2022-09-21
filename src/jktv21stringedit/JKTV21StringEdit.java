/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21stringedit;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV21StringEdit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String imput;
        String repeat = "y";
        do {
            System.out.println("Select: ");
            System.out.println("0. Exit");
            System.out.println("1. Symbols count");
            System.out.println("2. Words count");
            System.out.println("3. Find word");
            System.out.println("4. Change word");
            imput = scanner.nextLine();
            
            switch (imput) {
                case "0":
                    repeat = "n";
                    break;
                case "1":
                    System.out.println("Symbols = " + str.length());
                    break;
                case "2":
                    String[] words = str.split(" ");
                    System.out.println("Words = " + words.length);
                    break;
                default:
                    break;
            }
        
        } while(repeat == "y");
    }
    
}

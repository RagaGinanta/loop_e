/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class EDoWhile {
    public static void main(String[] args) {
        int p=1;
        do {
            int j=1;
             do {
         System.out.print(p == j ? "0" : "*");
         j++;
     }while (j<=5);
            System.out.println();
            p++;
        }while (p<=5);
    }
} 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class EWhile {
    public static void main(String[] args) {
        int p = 1;
            while (p<=5){
        int j=1;
            while (j<=5){
                System.out.print(p == j ? "0" : "*");
            j++;
        }
                System.out.println("");
            p++;
        }
    }
}

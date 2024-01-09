/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author LAPTOP ACER
 */
public class Validation {

    public int getIntInput(String msg) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.println(msg);
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input a number, not characters please!!");
            }
        }
        return n;
    }
    
}

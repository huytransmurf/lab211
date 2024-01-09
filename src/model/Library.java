/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author LAPTOP ACER
 */
public class Library {
    public int[] generateRandomNumber(int n){
        Random r = new Random();
        int arr[] = new int[n];
        for (int i = 0; i< n; i++){
            arr[i] = r.nextInt(n);
        }
        return arr;
    }
    public void displayArray(String title, int[] arr){
        System.out.println(title+": ");
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

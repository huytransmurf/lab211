/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Algorithm;
import model.Library;
import model.Validation;
import view.Menu;

/**
 *
 * @author LAPTOP ACER
 */
public class App extends Menu<String> {

    private static String mc[] = {"Sort", "Search", "Exit"};
    Validation v = new Validation();
    Library l = new Library();
    Algorithm al = new Algorithm();

    public App() {
        super("Sort and search menu", mc);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                doSort();
                break;
            }
            case 2: {
                doSearch();
                break;
            }
            case 3:
                System.out.println("Exitting...");
                System.exit(0);
        }
    }

    public void doSort() {
        String mc[] = {"Bubble sort", "Quick sort"};
        Menu sortMenu = new Menu("Sort menu", mc) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1: {
                        int number = v.getIntInput("Enter number of elements of array");
                        int arr[] = l.generateRandomNumber(number);
                        l.displayArray("The array before bubble sort", arr);
                        al.bubbleSort(arr, number);
                        l.displayArray("The array after bubble sort", arr);
                        break;
                    }
                    case 2: {
                        int number = v.getIntInput("Enter the number of elements of array");
                        int arr[] = l.generateRandomNumber(number);
                        l.displayArray("The array before quick sort", arr);
                        al.quickSort(arr, 0, number - 1);
                        l.displayArray("The array after quick sort", arr);
                        break;
                    }
                }
            }

        };
        sortMenu.run();
    }

    public void doSearch() {
        String mc[] = {"Linear search", "Binary search"};
        Menu searchMenu = new Menu("Search menu", mc) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1: {
                        int number = v.getIntInput("Enter the number of elements of array");
                        int arr[] = l.generateRandomNumber(number);
                        l.displayArray("The array", arr);
                        number = v.getIntInput("Enter search value");
                        if (al.linearSearch(number, arr) == -1) {
                            System.out.println("There is no such number in array!");
                        } else {
                            System.out.println("Found " + number + " at index " + al.linearSearch(number, arr));
                        }
                        break;
                    }
                    case 2: {
                        int number = v.getIntInput("Enter the number of elements of array");
                        int arr[] = l.generateRandomNumber(number);
                        al.quickSort(arr, 0, arr.length - 1);
                        l.displayArray("The sorted array", arr);
                        number = v.getIntInput("Enter search value");
                        if (al.binarySearch(arr, number) == -1) {
                            System.out.println("There is no such number in array!");
                        } else {
                            System.out.println("Found " + number + " at index " + al.binarySearch(arr, number));
                        }
                        break;
                    }
                }
            }

        };
        searchMenu.run();
    }
}

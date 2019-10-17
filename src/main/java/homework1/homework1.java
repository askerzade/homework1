package homework1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class homework1 {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner std = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = std.nextLine();
        System.out.println("Your Name Is: " + name);
        System.out.println("Let the Game Begins!");
        int[] a = new int[100];
        int r = a.length;

        int rnd1 = random.nextInt(r);
        System.out.println("Write your number: ");
        Scanner x = new Scanner(System.in);
        int pn = x.nextInt();

        if (rnd1 == pn){
            System.out.println("Congratulations! You WON!");
        }
        if (rnd1<= pn){
            System.out.println("Your number is bigger. Please try again");
        }



    }}






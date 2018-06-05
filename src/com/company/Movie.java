package com.company;

import java.util.Scanner;


public class Movie {


    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        boolean quit = false;

        String[] movies = new String[50];

        do {
            System.out.println("Enter the Name of your Favorite moive?  ");
            String usermovies = input.next();

            for (int i = 0; i < movies.length; i++) {
                if (usermovies.equalsIgnoreCase(movies[i])) {
                    System.out.println("Movie already exists");
                    break;
                } else if (movies[i] == null) {
                    movies[i] = usermovies;
                    break;

                } else {
                    continue;
                }
            }
            System.out.println("Do you want to quit? ( Q to quit)");
            String quiteInput = input.next();

            if (quiteInput.equalsIgnoreCase("q")) {
                quit = true;
            }

        } while (quit == false);



        System.out.println(" Current moives list: ");
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] != null)
                System.out.println(movies[i]);
        }
        input.close();


    }
}
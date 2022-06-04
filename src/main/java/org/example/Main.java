package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner console = new Scanner(System.in);
        System.out.print("Input a race of creature: ");
        String race = console.nextLine();
        System.out.print("Input a map: ");
        String area = console.nextLine();

        Solution.getResult(race, area);

    }

}




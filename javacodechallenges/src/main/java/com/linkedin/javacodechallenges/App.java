package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        boolean hasUpper=false;
        boolean hasLower=false;
        boolean hasDigit=false;
        if (password.length() >= 6) {
            for (int i=0; i<(password.length()); i++) {
                if (Character.isUpperCase(password.charAt(i))== true) {
                    hasUpper = true;
                    break;
                }
            }
            for (int i=0; i<(password.length()); i++) {
                if (Character.isLowerCase(password.charAt(i))== true) {
                    hasLower = true;
                    break;
                }
            }
            for (int i=0; i<(password.length()); i++) {
                if (Character.isDigit(password.charAt(i))== true) {
                    hasDigit = true;
                    break;
                }
            }
        }  
        return hasUpper && hasLower && hasDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}

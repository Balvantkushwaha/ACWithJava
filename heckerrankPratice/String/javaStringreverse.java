package heckerrankPratice.String;

import java.util.Scanner;

class javaStringreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            B = B + A.charAt(i);

        }
        System.out.println(B);
        if (A.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
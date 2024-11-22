package com.datacom.misc;

import java.util.Scanner;

public class DummyTriangleTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Triangle Side Length:");
        int iSideA = scanner.nextInt();

        System.out.println("Enter Second Triangle Side Length:");
        int iSideB = scanner.nextInt();

        System.out.println("Enter Third Triangle Side Length:");
        int iSideC = scanner.nextInt();

        System.out.println("Result: " + verifyTriangle(iSideA, iSideB, iSideC));

        scanner.close();
    }

    public static String verifyTriangle(int pSideA, int pSideB, int pSideC){

        if (pSideA == pSideB && pSideA == pSideC) {
            return "Equilateral Triangle";
        }

        else if (pSideA == pSideB || pSideA == pSideC || pSideB == pSideC) {
            return "Isosceles Triangle";
        }

        else {
            return "Scalene Triangle";
        }
    }
}

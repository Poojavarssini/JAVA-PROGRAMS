package test;

import java.util.Scanner;

public class Perfects{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int perfectSquaresCount = 0;
        for (int i = 0; i < size; i++) {
            if (isPerfectSquare(array[i])) {
                perfectSquaresCount++;
            }
        }

        System.out.println("The count of perfect squares in the array is: " + perfectSquaresCount);
    }

    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}

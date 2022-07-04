package task_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите число 1");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Введите число 2");
        int m = new Scanner(System.in).nextInt();
        int[][] array = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                int random = new Random().nextInt(101);
                if (random%2==0) {
                    continue;
                } else {
                    array[i][j] = random;
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}

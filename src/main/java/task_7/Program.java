package task_7;

import java.util.Scanner;

public class Program {
    static int n = new Scanner(System.in).nextInt();

    public static void main(String[] args) {
         numbers();
    }

    public static void numbers(){
        while (n>0) {
            System.out.println(n +" ");
            n--;
            numbers();
        }
    }
}

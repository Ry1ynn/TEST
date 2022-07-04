package task_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        newAWord();
    }

    public static void newAWord() {
        System.out.println("Здравствуйте!\nПожалуйста, введите слово, начинающееся на букву A");
        String letter = new Scanner(System.in).nextLine();
        String newLetter = letter.substring(0,1).toUpperCase() + letter.substring(1,letter.length());
        if (newLetter.startsWith("А")) {
            System.out.println("Спасибо, до свидания!");
        } else {
            System.out.println("Некорректный ввод, введите снова");
            newAWord();
        }
    }
}

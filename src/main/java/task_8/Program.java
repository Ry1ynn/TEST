package task_8;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String fileInput = new Scanner(System.in).nextLine();
        String fileOutput = new Scanner(System.in).nextLine();
        try (InputStream is = new FileInputStream(fileInput)) {
            OutputStream os = new FileOutputStream(fileOutput);
            while (is.available() != 0) {
                int x = is.read();
                os.write(x);
            }
        }  catch(FileNotFoundException e) {
            System.out.println("Не найден файл");
        } catch (IOException e) {
            System.out.println("Ошибка при считывании");
        }
    }
}

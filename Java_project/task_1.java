package Java_project;


import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = input.nextInt();
            int tn = n * (n + 1) / 2;
            System.out.println("Треугольное число для n=" + n + " равно " + tn);
        }
    }
}
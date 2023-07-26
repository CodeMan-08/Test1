import javax.swing.*;
import java.util.Scanner;

public class Worker {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String name;
        int age = 4;

        JOptionPane.showInputDialog(null, "Enter your name", age = entry.nextInt());
        System.out.println("Your age is:" + age);
    }
}
package basicsTests;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insert your height: ");
        double height = scanner.nextDouble();

        System.out.println("Your Name: ");
        String name = scanner.next();

        System.out.println("Your second name: ");
        String secondName = scanner.next();

        System.out.println("Type your age: ");
        int ageUser = scanner.nextInt();

        System.out.println("Your infos:\n\n");
        System.out.println("Name: " + name + " " + secondName + "\nHeight: " + height + "\nAge: " + ageUser);
    }
}

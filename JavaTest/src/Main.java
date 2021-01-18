import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Git example!");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String hello = "Hello World";
        System.out.println(hello + " " + name);
    }
}

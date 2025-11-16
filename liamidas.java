import java.util.Scanner;
public class liamidas {
    public static String username;
    public static boolean setup;
    public static Scanner input = new Scanner(System.in);
    public static boolean leave = false;
    public static String log = "";
    public static void main(String[] args) {
        setup();
        System.out.print("what is your will, " + username + "? >>> ");
        String message = input.nextLine();
        log = log + message + "\n";
        functions(message);
        if (!leave) {
            main(args);
        }
    }
    public static void setup() {
        if (!setup) {
            System.out.print("welcome user. what should i call you? >>> ");
            username = input.nextLine();
            setup = true;
        }
    }
    public static void functions(String message) {
        if (message.equals("exit")) {
            System.out.print("\n"+ username + " logging out.\n*********************\n");
            leave = true;
            return;
        } else if (message.equals("log")) {
            System.out.print("\n*********************\n" + username + ": log\n" + log + "\n*********************\n");
            return;
        }
        
        return;
    }
}
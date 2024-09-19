import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input start account: ");
        int account = in.nextInt();
        System.out.print("Input replenishment amount: ");
        int repl = in.nextInt();    // replenishment amount

        int bonus;
        if (repl > 1000) {
            bonus = repl / 100;
        } else {
            bonus = 0;
        }

        account += repl + bonus;
        System.out.println("Cash on your account: " + account);

        in.close();
    }
}

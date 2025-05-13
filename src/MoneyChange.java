import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원화를 입력하세요(단위 원) >> ");
        int won = scanner.nextInt();
        double dollar = (double)won / 1200;
        System.out.printf("%d원은 $%.2f입니다.\n", won, dollar);
        scanner.close();
    }
}

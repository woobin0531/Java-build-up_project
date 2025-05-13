import java.util.Scanner;

public class ThreeAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개를 입력하세요>> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 삼각형 조건: 두 변의 합이 다른 한 변보다 커야 함
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("삼각형이 됩니다.");
        } else {
            System.out.println("삼각형이 안됩니다.");
        }

        scanner.close();
    }
}


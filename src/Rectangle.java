import java.util.Scanner;
public class Rectangle {
    int width;   // 사각형의 가로 길이
    int height;  // 사각형의 세로 길이

    public int getArea() { // 사각형의 면적을 계산하는 메소드
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(); // Rectangle 객체 생성
        Scanner scanner = new Scanner(System.in); // 입력을 위한 Scanner 생성
        System.out.print(">> "); // 입력 안내

        rectangle.width = scanner.nextInt();  // 가로 입력
        rectangle.height = scanner.nextInt(); // 세로 입력

        System.out.println("사각형의 면적은 " + rectangle.getArea()); // 면적 출력

        scanner.close(); // Scanner 닫기
    }
}

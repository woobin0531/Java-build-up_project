import java.util.Scanner;

class Book2 {
    String title, author;
    public Book2(String title, String author) { // 생성자
        this.title = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Book2[] book2 = new Book2[2]; // Book 배열 선언

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < book2.length; i++) {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            book2[i] = new Book2(title, author); // 배열 원소 객체 생성
        }

        for (int i = 0; i < book2.length; i++)
            System.out.print("(" + book2[i].title + ", " + book2[i].author + ") ");

        scanner.close();
    }
}

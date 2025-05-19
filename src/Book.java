public class Book {
    String title;
    String author;
    void show() {System.out.println(title + "" + author);}

    public Book() { // 생성자: 제목만 받음
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public Book(String title) { // 생성자: 제목과 저자 모두 받음
        this(title, "작자미상");
    }
    public Book(String title, String author) {
        this.title = title; this.author = author;
    }
    public static void main(String [] args){
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();
        loveStory.show();
        }
}

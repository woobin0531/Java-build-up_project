class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class CircleArray {
    public static void main(String[] args) {
        CircleArea[] c = new CircleArea[5]; // Circle 객체 배열 선언

        for (int i = 0; i < c.length; i++) {
            c[i] = new CircleArea(i); // 각 배열 요소에 Circle 객체 생성
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print((int)(c[i].getArea()) + " ");
        }
    }
}

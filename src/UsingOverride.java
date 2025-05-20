// Shape, Line, Rect, Circle 클래스 정의 예시
class Shape {
    Shape next;
    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class UsingOverride {
    public static void main(String[] args) {
        Shape start, last, obj;

        start = new Line();
        last = start;
        obj = new Rect();
        last.next = obj;
        last = obj;
        obj = new Line();
        last.next = obj;
        last = obj;
        obj = new Circle();
        last.next = obj;
        last = obj;

        Shape p = start;
        while (p != null) {
            p.draw();
            p = p.next;
        }
    }
}

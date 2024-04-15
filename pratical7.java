class Rectangle {
    int height;
    int width;

    Rectangle(int h, int w) {
        height = h;
        width = w;
    }

    void display() {
        System.out.println("Height:" + height);
        System.out.println("Width:" + width);
    }
}

public class pratical7 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        r.display();
    }
}

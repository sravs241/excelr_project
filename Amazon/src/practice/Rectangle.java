package practice;

public class Rectangle {
    private static int width;
    private int height;

    // Parameterized constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Default constructor
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    // Other methods of the class...

public static void main(String[] args) {
	
// Creating objects using different constructors
Rectangle rect1 = new Rectangle(5, 10);
System.out.println(width);
Rectangle rect2 = new Rectangle();
System.out.println(width);
}
}
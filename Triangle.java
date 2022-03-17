public class Triangle extends Shape {
    private int height;
    private int base;

    @Override
    public int getArea() {

        return (height * base) / 2;
    }

    @Override
    public String toString() {

        return "Base:" + base + "\nHeight:" + height;
    }
}
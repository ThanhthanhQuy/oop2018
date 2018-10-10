package week4.task2;
/**
 * Class Rectangle kế thừa Class Shape và có đầy đủ các thuộc tín và phương thức lớp Shape có
 * @see week4.task2.Shape
 * @author Nguyen Thi Thanh Quy

 */
public class Rectangle extends Shape {
    double Width;
    double Length;
    public Rectangle() {}
    public Rectangle(double width, double length) {
        Width = width;
        Length=length;
    }

    public Rectangle(String _color, Boolean _Filled, double width, double length) {
        super(_color, _Filled);
        Width = width;
        Length=length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getLength() {
        return Length;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getWidth() {
        return Width;
    }
    /**
     * Tính diện tích của hình chữ nhật
     * @return giá trị diện tích
     */
    public double getArea() {
        return Length*Width;
    }
    /**
     * Tính chu vi hình chữ nhật
     * @return giá trị chu vi
     */
    public double getPerimeter() {
        return 2*(Length+Width);
    }
    /**
     * dùng để trả về đối tượng dạng chuõi
     * @return chuỗi tương ứng
     */
    @Override
    public String toString() {
        return super.toString();
    }
}

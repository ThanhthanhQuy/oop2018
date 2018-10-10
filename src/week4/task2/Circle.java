package week4.task2;
/**
 * Class Circle kế thừa Class Shape và có đầy đủ các thuộc tín và phương thức lớp Shape có
 * @see week4.task2.Shape
 * @author Nguyen Thi Thanh Quy

 */
public class Circle extends Shape {
    double radius;
    final double PI=Math.PI;
    Circle() {}
    Circle(double _radius) {
        radius= _radius;
    }
    public Circle(String _color, Boolean _Filled, double radius) {
        super(_color, _Filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * Tính diện tích của hình tròn
     * @return giá trị diện tích
     */
    public double getArea() {
        return radius*radius*PI;
    }
    /**
     * Tính chu vi của hình tròn
     * @return giá trị chu vi
     */
    public double getPerimeter() { return 2*PI*radius; }

    /**
     * dùng để trả về đối tượng dạng chuõi
     * @return chuỗi tương ứng
     */
    @Override
    public String toString() {
        return super.toString();
    }
    public  static void main(String[] argvs) {
        Circle circle= new Circle("Đỏ", true, 3);
        System.out.println("Diện tích hình tròn "+circle.getArea()+"\n");
        System.out.println("Chu vi hình tròn "+circle.getPerimeter());
    }
}

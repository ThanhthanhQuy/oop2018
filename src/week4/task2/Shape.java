package week4.task2;

/**
 * Class Shape là class cha ban đầu về hình khối chứa các thuộc tính mà các class con khác kế thừa(màu sắc, rỗng hay không....)
 * @author Nguyen Thi Thanh Quy
 */
public class Shape {
    String color;
    Boolean Filled;
    Shape() {};
    Shape (String _color, Boolean _Filled) {
        color= _color;
        Filled= _Filled;
    }
    public void setFilled(Boolean filled) {
        Filled = filled;
    }
    public Boolean getFilled() {
        return Filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
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

package week4.task1;

/**
 * Class Cam Sành kế thừa Class Cam và có đầy đủ các thuộc tín và phương thức lớp Cam có
 * @see week4.task1.Cam
 * @author Nguyen Thi Thanh Quy

 */
public class CamSanh extends Cam {
    String name;// tên khách hàng
    String out; // nơi xuất đi

    public CamSanh(int _weight, String _sour, int _num, int _Cost, String _kindOra, String _Vocam, String name) {
        super(_weight, _sour, _num, _Cost, _kindOra, _Vocam);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    /**
     * phương thức này để in ra định nghĩa của đối tượng
     */
    public void prinnt() {
        System.out.println("đây là cam sành");
    }

    /**
     * phương thức này để kiểm tra xem các quả cam có cùng địa chỉ giao hàng hay khách hàng không
     * @param t một đối tượng khác để só sánh
     */
    public void same(CamSanh t) {
        if (t.out.equals(this.out)) {
            System.out.println("Cam có cùng địa chỉ giao hàng");
        } else {
            System.out.println("không cùng địa chỉ giao hàng");
        }
        if (t.name.equals(this.name)) {
            System.out.println("Cam có cùng khách hàng " + this.name + " đặt mua");
        } else {
            System.out.println("không cùng khách hàng đặt mua");
        }
    }
}

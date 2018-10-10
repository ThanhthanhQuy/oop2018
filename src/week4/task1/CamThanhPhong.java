package week4.task1;
/**
 * Class Cam Cao Phong kế thừa Class Cam và có đầy đủ các thuộc tín và phương thức lớp Cam có
 * @see week4.task1.Cam
 * @author Nguyen Thi Thanh Quy

 */
public class CamThanhPhong extends Cam {
    private int time; // thời gian từ khi hái lượm
    private boolean Ripen;//quaả chinín

    public CamThanhPhong(int _weight, String _sour, int _num, int _Cost, String _kindOra, String _Vocam, int time) {
        super(_weight, _sour, _num, _Cost, _kindOra, _Vocam);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    /**
     * Hàm kiểm tra quả chín
     * @return giá trị đúng/sai tùy thuộc đối tượng
     */
    public boolean isRipen() {
        return Ripen;
    }

    public void setRipen(boolean ripen) {
        Ripen = ripen;
    }

    /**
     * in ra định nghĩa về đối tượng
     */
    public void show() {
        System.out.println("Dây là cam cao phong");
    }

    /**
     * Hàm để kiểm tra hạn sử dụng của quả cam, nếu không còn tươi ngon sẽ được giảm giá
     */
    public void sale() {
        if(this.time<=1) { return;}
        else if(this.time >=2 && this.time<4) this.setCost((this.getCost()*2)/3);
        else if(this.time>4 && this.time<7) this.setCost(this.getCost()/2);
        else System.out.println("CAM QUÁ HẠN SỬ DỤNG");
    }
}

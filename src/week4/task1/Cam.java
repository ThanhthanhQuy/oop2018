package week4.task1;

/**
 * class Cam kế thừa class Hoa qua, có đầy đủ các thuộc tín và phương thức lớp Hoaqua có
 * @see week4.task1.HoaQua
 * @author Nguyen Thi Thanh Quy
 */
public class Cam extends HoaQua {
    private String KindOra;
    private String Vocam;

    public Cam(int _weight, String _sour, int _num, int _Cost, String _kindOra, String _Vocam) {
        super(_weight, _sour, _num, _Cost);
        KindOra = _kindOra;
        Vocam= _Vocam;
    }

    public void setKindOra(String kindOra) {
        KindOra = kindOra;
    }

    public String getKindOra() {
        return KindOra;
    }

    public void setVocam(String vocam) {
        Vocam = vocam;
    }

    public String getVocam() {
        return Vocam;
    }

    /**
     * Hàm Money dùng để tính tổng thu nhập của 1 vụ mùa
     * @return số tiền thu được
     */
    public int Money() {
        return this.yield()*this.getCost();
    }

    /**
     * Hàm để so sánh giá trị của quả cam theo hình thức
     * @param c1 một đối tượng mang ra để so sánh
     */
    public void Compare(Cam c1) {
        if(this.getCost()> c1.getCost()) System.out.println("cam có vỏ "+ this.Vocam+" đắt hơn cam có vỏ "+ c1.Vocam);
        else System.out.println("cam có vỏ "+ this.Vocam+" rẻ hơn cam có vỏ "+ c1.Vocam);
    }
}

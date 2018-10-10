package week4.task1;
/**
 * class Tao kế thừa class Hoa qua, có đầy đủ các thuộc tín và phương thức lớp Hoaqua có
 * @see week4.task1.HoaQua
 * @author Nguyen Thi Thanh Quy
 */
public class Tao extends HoaQua {
    private String KindApp; // loại táo
    private String Votao;

    public Tao(int _weight, String _sour, int _num, int _Cost, String _kindApp, String _Votao) {
        super(_weight, _sour, _num, _Cost);
        KindApp = _kindApp;
        Votao= _Votao;
    }

    public String getKindApp() {
        return KindApp;
    }

    public void setKindApp(String kindApp) {
        KindApp = kindApp;
    }

    public void setVotao(String votao) {
        Votao = votao;
    }

    public String getVotao() {
        return Votao;
    }

    /**
     * kiểm ra xem quả táo có tên giống như đang tìm không
     * @param Name_kind tên loại táo đang muốn tìm
     * @return giá trị bool tương ứng
     */
    public boolean find(String Name_kind) {
        return this.KindApp.equals(Name_kind);
    }

    /**
     * kiểm tra đk xuất khẩu qua khối lượng và hình thức
     */
    public void check() {
        if(this.getWeight() < 3 || this.Votao!="Đỏ") System.out.println("Chưa đủ điều kiện xuất khẩu");
        else System.out.println("Đủ điều kiện xuất khẩu");
    }
    public  static void main(String[] argvs) {
        Tao tao= new Tao(2,"Nam Đinh", 2500, 5,"táo mèo", "Đỏ");
        System.out.println(tao.find("táo mèo")+"\n");
        tao.check();
    }

}

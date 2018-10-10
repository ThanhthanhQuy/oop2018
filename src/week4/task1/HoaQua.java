package week4.task1;

/**
 * Class HoaQua là class ban đầu, chứa tất cả thuộc tính mà các lớp con khác dùng để kế thừa(cân nặng, giá cả, số lượng,...)
 * @author Nguyen Thi Thanh Quy
 */
public class HoaQua {
    private int weight;
    private String sour;
    private int num; // khối lượng 1 đối tượng
    private int Cost;
    HoaQua(int _weight, String _sour, int _num, int _Cost) {
        weight= _weight;
        sour= _sour;
        num= _num;
        Cost=_Cost;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSour() {
        return sour;
    }

    public void setSour(String sour) {
        this.sour = sour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() { return Cost; }

    public void setCost(int cost) {Cost = cost; }
    public int yield() {
        return num*weight;
    }

    /**
     * phương thức dùng để đánh giá kết quả vụ mùa qua sản lượng(thất thu, hoàn vốn và bội thu)
     */
    void result() {
        int product= yield() ;
        if(product < 2000) {
            System.out.println("Vụ mùa thất thu");
         }
        else if(num>=2000 && num<=50000 ) {
            System.out.println("Vụ mùa hoàn vốn");
        }
        else System.out.println("Vụ mùa bội thu");
    }

    /**
     * SO sánh 2 đối tượng có cùng nơi sản xuất không
     * @param d1 đối tượng đưa ra để so sánh
     * @return đúng nếu 2 đt cùng nơi sx và sai nếu không
     */
    boolean samesour(HoaQua d1) {
        return (this.sour.equals(d1.sour));
    }
    public  static void main(String[] argvs) {
        HoaQua d1= new HoaQua(2,"Ha Noi", 6000,2000);
        HoaQua d2= new HoaQua(5,"Ha Noi", 7000,50000);
        d1.result();
        System.out.println(d2.samesour(d1));
    }
}


package week2.task2;
import  week2.task1.Task1;
public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;
    public Fraction(int _numerator, int _denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = _numerator;
        this.denominator = _denominator;
    }

    public void simplify() {
        int m = Task1.gcd(numerator, denominator);
        if(m!=0) {
            numerator /= m;
            denominator /= m;
        }
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f1 = new Fraction(0, 0);
        f1.numerator = this.numerator * other.denominator + this.denominator * other.numerator;
        f1.denominator = this.denominator * other.denominator;
        f1.simplify();

        return f1;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f1 = new Fraction(0, 0);
        f1.numerator = this.numerator * other.denominator - this.denominator * other.numerator;
        f1.denominator = this.denominator * other.denominator;
        f1.simplify();

        return f1;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f1 = new Fraction(0, 0);
        f1.numerator = this.numerator * other.numerator;
        f1.denominator = this.denominator * other.denominator;
        f1.simplify();
        return f1;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f1 = new Fraction(0, 0);
        f1.numerator = this.numerator / other.numerator;
        f1.denominator = this.denominator / other.denominator;
        f1.simplify();
        return f1;

    }

    public boolean equals(Object obj) {
        Fraction f2 = new Fraction(1,1);
        f2=this.subtract((Fraction)obj); // ep kiểu
        if (f2.numerator * f2.denominator == 0) return true;
        else return false;
    }

    public void show() {
        if(denominator!=0)  System.out.println(numerator + " " + denominator);
        else System.out.println("phan so khong hop le");
    }

    public void show1(Fraction f2) {
        if (denominator != 0 && f2.denominator != 0) {
                boolean t1 = this.equals(f2);
                if (t1) System.out.println("Phan so thu nhat bang ps thu 2");
                else System.out.println("Phan so thu nhat khong bang ps thu 2");
            }
         else System.out.println("phan so khong hop le");

    }

    public static void main(String[] argvs) {
        Fraction f1 = new Fraction(23, 24);
        Fraction f2 = new Fraction(72, 24);
      //  System.out.println(f1.t+" "+ f2.t);
         Fraction  f3= f1.subtract(f2);
       // System.out.println(f3.t+" ");
        f3.show();
        f1.show1(f2);

    }
};

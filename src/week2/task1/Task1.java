package week2.task1;

public class Task1 {
    public int c;
    Task1() {};
    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        a= Math.abs(a);
        b=Math.abs(b);
        if(a==0 || b==0) return a+b;
        else if (a==b) return a;
        else {
            while(a!=b) {
                if(a>b) a-=b;
                else b-=a;
            }
            return a;
        }
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0)  return 0;
        else if(n==1) return 1;
        else return fibonacci(n-1)+ fibonacci(n-2);
    }
    public static  void main(String[] argv) {
        int k=Task1.gcd(3,0);
        System.out.println(k+ "\n");
        int k1=fibonacci(0);
        System.out.println(k1);



    }
}

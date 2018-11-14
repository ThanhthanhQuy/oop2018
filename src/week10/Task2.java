package week10;

import java.util.Random;

public class Task2 {
    public void sort(double[] a) {
        for(int i=0;i<1000;i++) {
            for(int j=0;j<1000;j++) {
                if(a[i]<a[j]) {
                    double tempt=a[i];
                    a[i]=a[j];
                    a[j]=tempt;
                }
            }
        }
    }
    public static void main(String[] argvs) {
        double[] a= new double[1000];
        Random sd= new Random();
        for(int i=0;i<1000;i++) {
            a[i]= sd.nextInt(1000);

        }
        Task2 t= new Task2();
        t.sort(a);
        for(int i=0;i<1000;i++) {
            System.out.println(a[i]);
             }
        }
    }

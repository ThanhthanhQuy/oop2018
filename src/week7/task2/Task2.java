package week7.task2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.NullPointerException ;
import java.lang.ArrayIndexOutOfBoundsException ;
import java.lang.ArithmeticException ;
import java.lang.ClassCastException;
import java.io.IOException;

public class Task2 {
    BufferedReader a;
    public void nullPoiter() throws NullPointerException {
        String string=null;
        System.out.println(string.length());
    }
    public void arrayIndex() throws ArrayIndexOutOfBoundsException {
        int a[]= new int[5];
        a[8]=4;
        System.out.println(a[8]);
    }
    public void arithmetic()throws ArithmeticException {
        int re= 50/0;
        System.out.println(re);
    }
    public void classCast() throws ClassCastException {
        class dad {}
        class kid extends dad {};
        dad  d= new dad();
        kid k=(kid) d;
    }
    public void ioEx() throws IOException {
         a= new BufferedReader(new FileReader("file.txt"));
        StringBuilder sb= new StringBuilder();
        String line= a.readLine();
        while(line!=null) {
            sb.append(line+"\n");
            line=a.readLine();
        }
        String result= sb.toString();
        System.out.println(result);
    }


    public static void main(String[] argvs) {
        Task2 t= new Task2();
        try {
            t.nullPoiter();
        }
      catch (NullPointerException e) {
            System.out.println("null poiter");
        }
        try {
            t.arithmetic();
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic");
        }
        try {
            t.classCast();
        }
        catch (ClassCastException e) {
            System.out.println("Class cast");
        }
        try {
            t.ioEx();
        }
        catch (FileNotFoundException e)  {
            System.out.println("file not found");
        }
        catch (IOException e) {
            System.out.println("IO");
        }
    }
}


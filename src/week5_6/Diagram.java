package week5_6;

import com.sun.org.apache.bcel.internal.generic.LADD;
import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;

public class Diagram {
    ArrayList<Layer> listLayer;
   public Diagram(ArrayList<Layer> layers) {
       listLayer=layers;
   }
    public void removeCircle() {
       for(Layer layer: listLayer) {
           layer.removeCicle();
       }

   }
    public static void main(String args[]) {
       ArrayList<Shape> list = new ArrayList<>();
       list.add(new Circle(10,20,30));
       list.add(new Rectangle(10,20,30,40));
        ArrayList<Shape> list1 = new ArrayList<>();
        list.add(new Circle(30,20,30));
        list.add(new Rectangle(50,80,30,40));

       Layer b= new Layer(list);
       Layer c= new Layer(list1);
       ArrayList<Layer> list3= new ArrayList<>();
       list3.add(b);
       list3.add(c);

       Diagram a= new Diagram(list3);
       for(Layer layer:list3) {
           for(Shape shape: layer.listShape) {
               System.out.println(shape);
           }
       }
       a.removeCircle();
        System.out.println("then"+"\n");
        for(Layer layer:list3) {
            for(Shape shape: layer.listShape) {
                System.out.println(shape);
            }
        }
    }
}







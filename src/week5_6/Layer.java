package week5_6;

import java.util.ArrayList;
import java.util.Iterator;

public class Layer  {
    ArrayList <Shape> listShape;
    Layer() {
        listShape= new ArrayList<>();
    };
    Layer(ArrayList<Shape> shapes) {
        listShape=shapes;
    }
    public void removeCicle() {
       Iterator<Shape> iter= listShape.iterator();
       while (((Iterator) iter).hasNext()) {
           Shape item= (Shape) ((Iterator) iter).next();
           if(item instanceof Circle) {
               ((Iterator) iter).remove();
           }
       }
    }
    public void removeTriangle() {
        Iterator<Shape> iter= listShape.iterator();
        while (((Iterator) iter).hasNext()) {
            Shape item=(iter).next();
            if(item instanceof Triangle) {
                ((Iterator) iter).remove();
            }
        }
    }
}

package week10;
import week9.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    int t;
    List<String> getAllFunctions(String path) {
        List<String> list= new ArrayList<>();
        InputStream is = null;
        int i;
        char c; String t="";
        try {
            is = new FileInputStream(path);
            while ((i = is.read()) != -1) {
                c = (char) i;
                t+=c;
            }

             String t1= t.substring(t.indexOf("public static"), t.indexOf("//f"));
            list.add(t1);
            t= t.substring(t.indexOf("//f")+13);
            String t2= t.substring(t.indexOf("public static"), t.indexOf("//f"));
            list.add(t2);
            t= t.substring(t.indexOf("//f")+9);
            String t3= t.substring(t.indexOf("public static"), t.indexOf("//f"));
            list.add(t3);
            return list;
        } catch (IOException e) {
            System.out.println("fail");
            return null;
        }
    }
    public String findFunctionByName(String name) {
        List<String> list= new ArrayList<>(); String result="";
        list=getAllFunctions("C:\\BT lon UET diction\\oop2018\\src\\week9\\Utils.java");
        for(String a:list) {
            String re= a.substring(a.indexOf("("), a.indexOf(")"));
           // re= re.substring(a.indexOf("("), a.indexOf("g"));
            System.out.println(re);
            if(a.contains(name) ) {
                result= a;
            }
        }
        return result;
    }
     public static void main(String[] argvs) {
         Task1 t= new Task1();
         t.getAllFunctions("C:\\BT lon UET diction\\oop2018\\src\\week9\\Utils.java");
         System.out.println(t.findFunctionByName("findFileByName"));
     }
    }


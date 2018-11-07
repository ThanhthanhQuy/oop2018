package week9;

import java.io.*;

public class Utils {
    static File d;
    public static String readContentFromFile(String path) {
        String t="",result="";
        try {
            BufferedReader read = new BufferedReader(new FileReader(path));

            while ( (t = read.readLine()) != null){
                System.out.println(t);
                result += t;
            }
        } catch (IOException e) {
            System.out.println("fail file");
        }
        return result;
    }
    public static void writeContentToFile(String path) {
        try {
        BufferedWriter write = new BufferedWriter(new FileWriter(path));
        write.write("a");
        write.close();
        }
        catch (IOException e) {
            System.out.println("fail write");
        }

    }
    public static void writeContentToFile1(String path) {
        try {
           FileOutputStream write= new FileOutputStream(path, true);
           String a=" Thanh quy";
            write.write(a.getBytes());
            write.close();
        }
        catch (IOException e) {
            System.out.println("fail write");
        }

    }
    public static File findFileByName(String folderPath, String fileName) {
        try {
            String t =  folderPath + "\\" + fileName;
            d = new File(t);
            System.out.println(d.exists());
        }
        catch (Exception e) {
            System.out.println("fail find");
        }
        return d;
    }
    public static void main(String[] argvs) {
        Utils.readContentFromFile("src\\week9\\data.txt");
        Utils.writeContentToFile("src\\week9\\data.txt");
        Utils.readContentFromFile("src\\week9\\data.txt");
        Utils.writeContentToFile1("src\\week9\\data.txt");
        Utils.readContentFromFile("src\\week9\\data.txt");
        File t= Utils.findFileByName("src\\week9", "data.txt");

        }
}

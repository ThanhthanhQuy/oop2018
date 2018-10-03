package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        double m1= (double)m;
        double result=(((m1+n)/2)+ Math.abs((m1-n)/2));
        return (int)result ;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        if (array.length > 100 || array.length<=0 ) {
            return 0;
        }
        else {
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }
    }

        /**
         * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
         * @param weight cân nặng
         * @param height chiều cao
         * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
         */
        public static String calculateBMI ( double weight, double height){
            // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
            if (height <= 0 || weight < 0) {
                return null;
            } else {
                double BMI = weight / (height*height);
              //  System.out.println(BMI);
                String BMI1="";
                if (BMI < 18.5) BMI1 = "Thiếu cân";
                else if (BMI >= 18.5 && BMI < 23) BMI1 = "Bình thường";
                else if (BMI >= 23 && BMI <= 24.99) BMI1 = "Thừa cân";
                else if (BMI > 25) BMI1 = "Béo phì";
                return BMI1;
            }
        }
        public static void main(String[] argvs) {
            System.out.println(Week3.max(-4,-5));
            System.out.println(calculateBMI(49, 1.54));
            int[]arr={1,3,2,5,4};
            System.out.println(minOfArray(arr));
        }
    }

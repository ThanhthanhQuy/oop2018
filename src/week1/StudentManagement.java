package week1;


public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private Student[] students= new Student[100];
    int count=0;



    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        String gr1= s1.getGroup();
        String gr2= s2.getGroup();
       return gr1.equals(gr2);
        // xóa dòng này sau khi cài đặt
    }
     public void list(Student stu) {
        if(count>100) System.out.println("Vuot qua so luong sinh vien cho phep");
        else {
            students[count] = stu;
            count++;
        }
    }

    public void Showlist() {
        for(int i=0;i<count;i++) {
            System.out.println(students[i].getName()+ " ");
        }

    }
    void studentsByGroup() {
        // TODO:
        boolean A[] = new boolean[count];
        for (int i = 0; i < count; i++) {
            A[i] = true;
        }
        for (int i = 0; i < count; i++) {
            if (A[i] == true) {
                String t = students[i].getGroup();
                System.out.print("Sinh vien thuoc lop " + t + " bao gom: ");
                for (int j = 0; j < count; j++) {
                    if (students[j].getGroup().equals(t)) {
                        System.out.print(students[j].getName()+ " ");
                        A[j] = false;
                    }
                }
            }
            System.out.print("\n");
        }
    }


    void removeStudent(String id){
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < count-1 ; j++) {
                    students[j] = students[j + 1];
                }
                count--;
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
        StudentManagement list1= new StudentManagement();
        Student studen1= new Student();
        studen1.setName("Thanh Quy");
        studen1.setEmail("thanhquysakura2911@gmail.com");
        studen1.setGroup("INT22042");
        studen1.setId("17020991");
        String myname= studen1.getName();
        System.out.println(myname);
        studen1.getInfo();

        Student studen11= new Student();
        studen11.setName("Thanh ly");
        studen11.setEmail("thanhquysakura2911@gmail.com");
        studen11.setGroup("INT22044");
        studen11.setId("17020991");
        String myname1= studen11.getName();



        Student student2= new Student("Huyen Thanh","17020889","anhTho@gmail.com");
        Student student3= new Student("Nguyen Duong","17020879","batbat@gmail.com");
         Student student4 = new Student(studen1);
        student2.getInfo();
        student3.getInfo();
        student4.getInfo();
        System.out.println(list1.sameGroup(student2, student3));
        System.out.println(list1.sameGroup(student2, student4));

       list1.list(student2); list1.list(student3); list1.list(student4); list1.list(studen11);
       System.out.println("Danh sach sv trc khi xoa: ");
        list1. Showlist();

       list1.removeStudent("17020879");
        System.out.println("Danh sach sv sau khi xoa: ");
       list1. Showlist();

       list1.studentsByGroup();




    }
}

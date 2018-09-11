package week1;

class Student {

    // TODO: khai báo các thuộc tính cho Student

    private String name;
    private String group;
    private String id;
    private String email;

    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName() { return name;}
    public void setName(String _name) { name =_name ;}

    public String getGroup() { return group;}
    public void setGroup(String _group) { group = _group ;}

    public String getId() { return id;}
    public void setId(String _Id) { id = _Id ;}

    public String getEmail() { return email;}
    public void setEmail(String _email) { email = _email ;}

    /**
     * Constructor 1
     */
    Student() {
        name="Student";
        group="INT22041";
        id="000";
        email="uet@vnu.edu.vn";
    } //

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name=n;
        id=sid;
        email=em;
        group="INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        name= s.name;
        id=s.id;
        group=s.group;
        email=s.email;
        // TODO:
    }

    String getInfo() {
        System.out.println("Sinh vien "+ name+ " hoc lop "+ group+" co id va email "+ id+","+ email);
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}

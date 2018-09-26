package week2.task3;

 class Task3 {
}

    //TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
    // RÚT TIỀN
    class Money {
        private String name; // chủ tai khoan
        private int id; // số tài khản
        private int my; // tiền trong tài khoản
        Money(String _name, int _id, int _my) {
            name=_name;
            id= _id;
            my=_my;
        }
        public String getName() {
            return name;
        }

        public int getMy() {
            return my;
        }

        public int getId() {
            return id;
        }

        public void  setName(String name) {
            this.name = name;
        }

        public void setMy(int my) {
            this.my = my;
        }

        public void  setId(int id) {
            this.id = id;
        }
        // rút tiền
        public void moneyout( int t) {
            if(my<t) System.out.println("tiền của bạn không đủ để rút");
            else if(t<0) System.out.println("số tiền không hợp lệ");
            else {
                my-= t;System.out.println("bạn đã rút "+ t+"đồng khỏi tai khoan\"");
            }
        }
        // nạp tiền
        public void moneyin(int t) {
            if(t>10000000) System.out.println("số tiền không hợp lệ in vui lòng thử lại");
            else if(t<0) System.out.println("số tiền không hợp lệ");
            else { my+= t; System.out.println("bạn đã nạp "+ t+"đồng vao tai khoan");}
        }
        // chuyển tiền
        public void send(Money f1, int t) {
            if (t > 5000000) System.out.println("số tiền không hợp lệ in vui lòng thử lại");
            else if (t < 0) System.out.println("số tiền không hợp lệ");
            else {
                my -= t;
                f1.my += t;
                System.out.println("số tiền "+ t+ "từ số tài khoản "+ id+" đã được chuyển sang só tài khoản "+ f1.id+" thành công");
            }
        }
        public static void main(String[] argvs) {
            Money mo1= new Money("Quy", 17020991,0);
            Money mo2= new Money("Thanh", 17020992,0);
            mo1.moneyin(-1);
            mo1.moneyin(1000000);
            mo1.moneyout(500000);
            System.out.println(mo1.my);
            mo1.moneyout(1000000);
            mo1.moneyin(20000000);
            mo1.send(mo2,500000);
            System.out.println(mo1.my+ " "+mo2.my);



        }
    }
//  CLASS VỀ ĐỘNG VẬT
 class animal {
    private String name; // tên đọng vật
    private boolean play;
    private boolean eat;
    private int age;
    animal Animals[] = new animal[100];
    int count = 0;

    animal(String _name, int _age) {
        name = _name;
        age = _age;
        play = false;
        eat = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public boolean isEat() {
        return eat;
    }
    public boolean isPlay() {
        return play;
    }

   // chơi
    public void isPlay1() {
        if (play) System.out.println(name + " đang chơi ngoài sân");
        else System.out.println(name + " đang không chơi ngoài sân");
    }
    // cùng ăn
    public boolean eattogether(animal f2) {
        if (eat == true && f2.eat == true) return true;
        else return false;
    }

    // add vào list
    public void add(animal f1) {
        Animals[count++] = f1;
    }

    // sắp xếp theo tuổi
    public void sort() {
        for (int i = 0; i < count; i++) {
            for (int j = i; j < count; j++) {
                if (Animals[i].age < Animals[j].age) {
                    int temp = Animals[i].age;
                    Animals[i].age = Animals[j].age;
                    Animals[j].age = temp;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(Animals[i].name + " " + Animals[i].age);
        }
    }
    public static void main(String[] argvs) {
        animal a1= new animal("cho", 1);
        animal a2= new animal("meo", 4);
        animal a3= new animal("tho", 3);
        a1.isPlay1();
        boolean t1=a1.eattogether(a2);
        System.out.println(t1);
        a1.add(a2); a1.add(a3); a1.add(a1);
        a1.sort();


    }
}
//CLASS VỀ ĐỐI TƯỢNG GÓI HÀNG ĐI SHIP
 class goods {
    private String name; // tên sản phẩm
    private String customer; // tên khách hàng
    private String address; // nơi giao ha?ng
    private int weigh; // cân nặng
    private boolean done; // đã giao hàng chưa

    // constructor
    goods(String _name, String _customer, String _address, int _weigh) {
        name = _name;
        customer = _customer;
        address = _address;
        weigh = _weigh;
        done = false;
    }

    // getter setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean getDone() {
        return done;
    }

    // ha?m kt xem 2 go?i ha?ng co? cu?ng ?i?a chi? không
    public boolean sameaddress(goods f1) {
        return (f1.address.equals(address));
    }

    // tính giá tiền ship
    public int costgoods() {
        if (weigh >= 0 && weigh <= 5) return weigh * 14000;
        else if (weigh > 5 && weigh <= 20) return weigh * 11000;
        else return weigh * 10000;
    }
    // xem gói hàng đã chuyển chưa
    public void check() {
        if (done) System.out.println("chuyển hàng thành công");
        else System.out.println("Hàng chưa được chuyển");
    }

    public static void main(String[] argv) {
        goods f1 = new goods("ao", "Nguyen Quy", "Cau Giay", 12);
        goods f2 = new goods("cap sach", "Nguyen Thanh", "Bach Khoa", 10);
        goods f3 = new goods("giay", "Nguyen Quy", "Cau Giay", 9);
        f1.check();
        System.out.println(f1.sameaddress(f2));
        System.out.println(f1.sameaddress(f3));
        int t=f1.costgoods();
        System.out.println(t);
        f1.setDone(true);
        f1.check();

    }

}

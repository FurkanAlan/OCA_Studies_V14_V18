package OCA_Hepsi.V14.Q_85_127;

public class Q86 {
}


class Vehicle {
    int x;

    Vehicle() {
        this(10);// line n1
    }

    Vehicle(int x) {
        this.x = x;
    }
}

class Car extends Vehicle {
    int y;

    Car() {
        super(10); // line n2
    }

    Car(int y) {
        super(y); //verilen degeri alir
//        super(); //sonuc olarak yukaridaki degeri alir
        this.y = y;
    }

    public String toString() {
        return super.x + ":" + this.y;
    }

    public static void main(String[] args) {
        Vehicle y = new Car(20);
//        Vehicle z = new Car();
        System.out.println(y);
//        System.out.println(z);
    }
}

//What is the result?
//A. Compilation fails at line n2.
// B. Compilation fails at line n1.
// C. 20:20
//D. 10:20
//Answer: C


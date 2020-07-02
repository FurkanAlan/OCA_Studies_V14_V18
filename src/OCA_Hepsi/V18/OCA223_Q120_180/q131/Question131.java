package OCA_Hepsi.V18.OCA223_Q120_180.q131;

public class Question131 {
    public static void main(String[] args) {
        Vehicle y = new Car(20);
        System.out.println(y);
    }
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
        super(y);
        this.y = y;
    }

    public String toString() {
        return super.x + ":" + this.y;
    }

}

//Eger bu skilde soru verilseydi cevap C olurdu
//What is the result?
//A. Compilation fails at line n2.
// B. Compilation fails at line n1.
// C. 20:20
//D. 10:20
//Answer: C


//, lakin soru da Compilation hatasi veren line 2 var
//        super(y);
//        this(20);
//iki tane constructor cagirici bu sekilde olamiyor, sadece super(), yada this() olabilir
package OCA_Hepsi.V18.OCA223_Q1_60.q018;

class Vehicle {
    String type = "4W";
    int maxSpeed = 100;

    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    Vehicle() {
    }  //eger buradaki bos constructor olmazsa sistem hata veriyor cunku buradaki ifade bizi Car(String trans){this
    // .trans = trans;} ifadesine goturuyor sanirim extend oldugu icin balanti kuruyor
}

public class Car extends Vehicle {
    String trans;

    Car(String trans) {                // line n1
//		super();  //
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);    // line n2
        this.trans = trans;
    }


    public static void main(String[] args) {
        Car c1 = new Car("Auto");
        Car c2 = new Car("4W", 150, "Manual");
        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
    }
}

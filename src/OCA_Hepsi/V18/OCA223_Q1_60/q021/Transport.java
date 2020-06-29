package OCA_Hepsi.V18.OCA223_Q1_60.q021;

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle");
    }
}

class Bus extends Vehicle {
    Bus() {
        System.out.println("Bus");
    }
}

public class Transport {
    public static void main(String[] args) {
        Vehicle v = new Bus();
    }
}

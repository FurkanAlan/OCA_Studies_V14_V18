package OCA_Hepsi.V18.OCA223_Q120_180.q173;

public class Q173 {

}

//A //

abstract class Vehicle {
    public void start() {
    }

    public void stop() {
    }

    public abstract void ride();
}

class Bus extends Vehicle {
    //    Vehicle xa = new Bus();
//    public void start() { //overriding, farkli class, active polymorh
//    }
//
//    public void start(int x){ //overloading, ayni class, passive polymorh
//
//    }
//    public void stop() {
//    }

    @Override
    public void ride() {
//        int x = 5;
//        int y;
//        Bus xc = new Bus();
//        xc.start();
//        xa.ride();
    }
}

class Boat extends Vehicle {

    @Override
    public void ride() {

    }
}


//B //abstract interface beraber olmadi, B hatali
//interface Vehicle {
//    public void start();
//
//    public void stop();
//
//    public abstract ride(); //abstract interface de olmadi,
//}
//
//class Boat implements Vehicle{
//
//    @Override
//    public void start() {
//
//    }
//
//    @Override
//    public void stop() {
//
//    }
//}
//
//class Bus implements Vehicle{
//
//    @Override
//    public void start() {
//
//    }
//
//    @Override
//    public void stop() {
//
//    }
//}


//C //Bu secenekde olmaz cunku ride() metodu ozel birsey yapmiyor, digerleride aynisini yapabilir

//abstract class Vehicle {
//    abstract void start();
//
//    abstract void stop();
//
//    abstract void ride();
//}
//
//class Bus extends Vehicle {
//
//    @Override
//    void start() {
//
//    }
//
//    @Override
//    void stop() {
//
//    }
//
//    @Override
//    void ride() {
//
//    }
//}
//
//class Boat extends Vehicle {
//
//    @Override
//    void start() {
//
//    }
//
//    @Override
//    void stop() {
//
//    }
//
//    @Override
//    void ride() {
//
//    }
//}


//D, sadece bir kismini implement yapip digerlerini yapmamak olmaz, buda hata verir
//interface Vehicle{
//    void stop();
//    void start();
//    void ride();
//}
//class Bus implements Vehicle{
//
////    @Override
////    public void stop() {
////
////    }
////
////    @Override
////    public void start() {
////
////    }
//
//    @Override
//    public void ride() {
//
//    }
//}
//class Boat implements Vehicle{
//
////    @Override
////    public void stop() {
////
////    }
////
////    @Override
////    public void start() {
////
////    }
//
//    @Override
//    public void ride() {
//
//    }
//}

/*
 173. Given these requirements:   
Bus and Boat are Vehicle type classes.
The start() and stop() methods perform common operations across the Vehicle class type. The ride() method performs a unique operations for each type of Vehicle. 
Which set of actions meets the requirements with optimized code?
A. * 1. Create an abstract class Vehicle by defining start() and stop() methods, and declaring the ride() abstract method.
* 2. Create Bus and Boat classes by inheriting the Vehicle class and overriding the ride() method.
B. * 1. Create an interface Vehicle by defining start() and stop() methods, and declaring the ride() abstract method.
* 2. Create Bus and Boat classes by implementing the Vehicle class.
C. * 1. Create an abstract class Vehicle by declaring stop(), start(), and ride() abstract methods.
* 2. Create Bus and Boat classes by inheriting the Vehicle class and overriding all the methods.
D. * 1. Create an interface Vehicle by defining default stop(), start(), and ride() methods.
* 2. Create Bus and Boat classes by implementing the Vehicle interface and overriding the ride() method. Answer: A (I Think)

 * 
 */

package OCA_Hepsi.V18.OCA223_Q204_223.Q213;

abstract class Toy {
    int price;
    //line n1;

    public static void insertToy(){ //abstract da static metod yazilabilir
        /*  code goes here  */
    }


//    final Toy getToy(){
//        return new Toy();  //'Toy' is abstract; cannot be instantiated, bu secenek yanlis
//    }

//    public void printToy();  //Missing method body, or declare abstract, yanlis

    public int calculatePrice() { // bu bir public ,metod oldugu icin body si var ve return olabilir
        return price;
    }

    public abstract int computeDiscount(); //abstract class da abstract metod yazilabilir ve metod body olmamali, dogru

}

//which code fragments are valid at line n1?
//A.  public static void insertToy(){
//        /*  code goes here  */
//    }
//B.  f
// final Toy getToy(){
//        return new Toy();  //'Toy' is abstract; cannot be instantiated
//    }
//C.  public void printToy();
//D.
// public int calculatePrice(){
//        return price;
//    }
//E. public abstract int computeDiscount();
//    A. Option A
//    B. Option B
//    C. Option C
//    D. Option D
//    E. Option E
//Answer: A D E

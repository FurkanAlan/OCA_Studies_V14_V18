package OCA_Hepsi.V18.OCA223_Q120_180.q169.clothing.pants;

//line n1
import OCA_Hepsi.V18.OCA223_Q120_180.q169.clothing.Shirt;

//import static OCA_Hepsi.V18.OCA223_Q120_180.q169.clothing.Shirt.getColor;


public class Jeans {

    public void matchShirt() {
        //line n2
        //String color= Shirt.getColor();

//		String color = getColor();



//        if (color.equals("Green")) {
//            System.out.println("FIT");
//        }
    }

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();

    }

}
//Answer
//A). At line n1 insert: import clothing.Shirt;At line n2 insert: String color = Shirt.getColor();
//C). At line n1 insert: import static clothing.Shirt.getColor;At line n2 insert: String color = getColor();

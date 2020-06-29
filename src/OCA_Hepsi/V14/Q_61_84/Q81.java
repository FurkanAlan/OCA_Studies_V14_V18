package OCA_Hepsi.V14.Q_61_84;

public class Q81 {
}
class Product {
    int id;
    String name;
    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Pen");
        System.out.println(p1);
        System.out.println(p1.name);
        System.out.println(p1.id);
        Product p2 = new Product(101, "Pen");
        System.out.println(p2);
        System.out.println(p1.name);
        System.out.println(p1.id);

                boolean isim = p1.name == p2.name;
        boolean isim1 = p1.equals(p2);

        System.out.println();
        System.out.println(isim+" : boolean olarak isim degerleri birbirine " +
                "esit ancak memory de farkli yerler acildigi " +
                "icin p1 == p2 diyemeyiz lakin p1.name == p2.name birbirine esittir, bir diger yolu da .equals() " +
                "metodu");
        System.out.println();
        p1.toString();
        System.out.println(p1.toString());
//        System.out.println(p1.getClass());
        System.out.println();



        Product p3 = p1;
        boolean ans1 =  p1 == p2;
        boolean ans2 = p1.name.equals(p2.name);
        System.out.print(ans1 + ":" + ans2);
    }
}

//Answer C => false:true

package OCA_Hepsi.V18.OCA223_Q61_71;

public class Q_70 {
    public static void main(String[] args) {
        int x = 10;
        int y = ++x; // bu ifadeden sonra artik x in degeri 11
        System.out.println("x in degeri y = ++x den sonraki: " + x);
        int z = 0;

        if (y >= 10 | y <= ++x) {
            System.out.println("x in yeni degeri yani y <= ++x isleminden sonraki ve z ye esit olan: " + x);
            z = x;
        } else {
            System.out.println("x in sondan onceki degeri yani else deki z ye esit olan: " + x);
            z = x++;
            System.out.println("x in son degeri: " + x);
        }
        System.out.println(z);
    }

}
/*
What is the result?
A. 11
B. 10
C. 12
D. A compile time error occurs.
 */
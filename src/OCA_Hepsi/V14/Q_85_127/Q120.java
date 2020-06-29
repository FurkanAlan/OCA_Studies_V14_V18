package OCA_Hepsi.V14.Q_85_127;

public class Q120 {
}
class Triangle {
    static double area;
    int b=2, h=3;
//    static int h =3;
//    static double p =3;
    public static void main(String[] args) {
        //buradaki degerler if in icersinde kullaniliyor
//        double p = 0, b = 0, h = 0; //line n1
        double p, b, h; //line n1
        //burada da initizlize olmmadigi icin hata veriyor
//        System.out.println(b);

//        System.out.println(Triangle.area);

//        Triangle triangle = new Triangle();
//        System.out.println(triangle.h);

        if (area==0){
            b=3;
            h=4;
            p=0.5;
            area=p*b*h; //line n2
        }
        //buradaki sout(b) hata veriyor cunku bunun if in icerisindeki degerle bir alakasi yok 
//        System.out.println(""+b);
        System.out.println("Area is "+area);
    }
}
/*
What is the result?
A.Area is 6.0
B.Area is 3.0
C.Compilation fails at line n1
D.Compilation fails at line n2
Answer:A
 */

//SECOND VERSION

//class Triangle {
//    static double area;
//    int b=2, h =3;
//
//    public static void main(String[] args) {
//        double p, b, h; //line n1
//        if (area==0){
//            b=3;
//            h=4;
//            p=0.5;
//
//        }
////         area=p*b*h; //line n2 ===============>IF IN DISINDA
////        System.out.println("Area is "+area);
//    }
//}
/*
What is the result?
A.Area is 6.0
B.Area is 3.0
C.Compilation fails at line n1
D.Compilation fails at line n2
Answer:D
 */

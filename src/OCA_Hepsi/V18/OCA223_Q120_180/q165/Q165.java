package OCA_Hepsi.V18.OCA223_Q120_180.q165;

public class Q165 {
}
class OraString {
    String s;
    public boolean equals(OraString str) {
//        System.out.println(str.getClass());
        return this.s.equalsIgnoreCase(str.toString());
    }
    OraString(String s) {
        this.s = s;
    }
    public static void main(String[] args) {

        String s1 = "Moon";
        OraString s2 = new OraString("Moon"); //Burada dikkat edilmesi gereken husus, bu ifade constructor a gider ve
        // oradaki String s ifadesi => Moon olur, this.s = s, s Moon oldugu icin global olan s degiskeni de Moon olur

        //ancak s2.equals("Moon") bu ifade cok daha farkli bir yaklasimi var ve soyle bir hataya sebep oluyor
        //equals()' between objects of inconvertible types 'OraString' and 'String cunku s2 bir obje olmasina karsin
        //.equals ile bir String ifadesi olan "Moon" a esitlenmistir, boyle oldugu icin false olur lakin
        //s2.s.equals("Moon") olsaydi true olurdu ve iki tarafda dogru oldugu icin sout(), A yi verirdi

        if ((s1 == "Moon") && (s2.equals("Moon"))) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        if (s1.equalsIgnoreCase(s2.s)) { //s2.s burasi Moon a esitlendi bu OraString s2 = new OraString("Moon"); ve
            // OraString(String s)  this.s = s; } sayesinde
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
} //Ans B C


package OCA_Hepsi.V18.OCA223_Q120_180.q180;

public class CCMask {
    public static String maskCC(String creditCard) {
        String x = "XXXX-XXXX-XXXX-";
//line n1
//        A
//        StringBuilder sb = new StringBuilder(creditCard);
//        sb.substring(15, 19);
////        String s = sb.substring(15, 19);
////        return x + s;
//        return x + sb;

        return x + creditCard.substring(15, 19);  //-->Answer B3

//        StringBuilder sb = new StringBuilder(x); //--> Answer C
//        sb.append(creditCard, 15, 19);
//
//     //   StringBuilder sv = sb.append(creditCard, 15, 19);
//      //  System.out.println(sv);

//        return sb.toString();

        //    D
//        StringBuilder sb = new StringBuilder(creditCard);
//        StringBuilder s = sb.insert(0,x);
//
//        StringBuilder sb = new StringBuilder(x);
//        StringBuilder s = sb.insert(15,creditCard.substring(15,19));
//        return s.toString();
    }



    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121"));


    }

}

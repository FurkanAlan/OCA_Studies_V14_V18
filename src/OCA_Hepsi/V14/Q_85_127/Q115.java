package OCA_Hepsi.V14.Q_85_127;

public class Q115 {
}
//soru buradan basliyor
class Equal {
    public static void main(String[] args) {
        String str1 = "Java";
      String[] str2 = {"J", "a", "v", "a"};
//        String str4 = "Java";
//        String str3 = "Java";
        String str3 = "";
        for (String str : str2) {
            str3 = str3 + str;
        }
       // str3 = str1; Boyle yaptigimizda ayni yere point yapar.
        boolean b1 = (str1.equals(str3));
        boolean b2 = (str1 == str3);

//        boolean b3 = (str1.equals(str4));
//        boolean b4 = (str1 == str4);

       System.out.println(b1 + ", " + b2);
//       System.out.println(b3 + ", " + b4);
        /*
        What is the result?
        A.false,false
        B.false,true
        C.true,false
        D.true,true
        Answer:C
         */
        //Berat note:just changes lines
        //boolean b1=(str1==str3); //false, true
        //boolean b2=(str1.equals(str3));
        //System.out.print(b1+", "+b2);

    }
}

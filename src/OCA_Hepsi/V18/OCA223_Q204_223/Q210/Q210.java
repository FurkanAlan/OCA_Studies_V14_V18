package OCA_Hepsi.V18.OCA223_Q204_223.Q210;

import java.util.function.Predicate;

public class Q210 {
    public static void main(String[] args) {
        Predicate<Integer> p = (Integer n) -> { return n % 2 == 0; };
        //insert code here
        Boolean s=p.test(100);
        System.out.println(s);


    }
}

/*which code snippet at line 9 prints true?
   A. Boolean s=p.apply(101);
      System.out.println(s);
   B. Boolean s=p.test(100);
      System.out.println(s);
   C  Integer s=p.test(100);
      if(s==1){
           System.out.println("false");
      }else{
           System.out.println("true");
      }
   D.  System.out.println(p.apply(100));

   A.Option A
   B. Option B
   C. Option C
   D. Option D
   answer B
*/

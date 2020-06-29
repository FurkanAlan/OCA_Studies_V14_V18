package OCA_Hepsi.V14.Q_61_84;

public class Q62 {
 //   What is the result?
           public static void main(String[] args) {
               //eger bu skilde olsaydi
               //int num, div, ans; ve try in icersindeki sadece intleri silseydik, bu durum Aritmetik exception
               // olacagi icin
               //bize catch deki sonucu verecek ve oraya System.out.println("Atirmetik istisnasi") yazmis olsak onu
               // cikaracakti ve ans = 0 oldugundan dolayi bize cikti olarak  ==> Atirmetik istisnasi ve Answer = 0
               // verecekti.
               //mesela biz burada ac.printStackTrace(); metodu yazmi olsaydik bize aritmetik hata oldugunu yazdiracak
//            try{
//                int num = 10;
//                int div = 0;
//                int ans = num / div;
//            }catch (ArithmeticException ae){
//                ans = 0;                   //line n1
//            }catch (Exception e){
//                System.out.println("invalid calculation");
//            }
//            System.out.println("Ansver = " + ans);      //line n2

//ANSWER IS : E. Compilation fails at line n1 and line2
/*
              int num = 10;
//            int div = 0;
//            int ans = num / div;
these are local variables, we cannot use out of block them so ans gives error

 */
//second way



//               int num =0, div = 0, ans;
//               try{
//                   num = 10;
//                   div = 0;
//                   ans = num / div;
//               }catch (ArithmeticException ae){
//                   System.out.println("This line gives error");
//                   ae.printStackTrace();
//                   ans = 0;                         //line n1
//               }catch (Exception e){
//                   System.out.println("invalid calculation");
//               }
//               //    System.out.println("Ansver = " + ans);      //line n2

               Soru62_2Versiyon();
    }
    public static void Soru62_2Versiyon(){

        int num =0, div = 0, ans;
        try{
            num = 10;
            div = 0;
            ans = num / div;
        }catch (ArithmeticException ae){
            System.out.println("This line gives error");
            ae.printStackTrace();
            ans = 0;                         //line n1
        }catch (Exception e){
            System.out.println("invalid calculation");
        }
        //    System.out.println("Ansver = " + ans);      //line n2
    }
}

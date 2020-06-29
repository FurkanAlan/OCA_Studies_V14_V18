package OCA_Hepsi.V14.Q_128_156;

public class Q144{

 public static void main(String[] args) {
//            String s= "         Java SE 8 1                 ";
//            int len= s.trim().length();
//            String sonuc = s.trim();
//            System.out.println(len);
//            System.out.print(sonuc);

     //Cikmis soru
     String str1 = "Sweet Sweat";//
     String str2 = str1.trim().charAt(6) + "" + str1.indexOf("Sw",1);
     System.out.println(str2);

     String str = "the quick brown fox jumps over the lazy dog.";
     System.out.println();
     System.out.println(str);
     System.out.println("indexOf(the, 40) = " + str.indexOf("the", 0));
     System.out.println();

        }
    }
/*
What is the result?
A. Compilation fails.
B. 11
C. 8
D. 9
E. 10

Answer: B

Third version
*/
//public static void main(String[] args) {
//            String str= " ";
//            str.trim();
//            System.out.print(str.equals("")+" " +str.isEmpty());
//   }
//           }

//             What is the result?
//             A True true
//             B. true false
//             C. false false
//             D. false true
//
//             Answer?




package OCA_Hepsi.V18.OCA223_Q120_180.q141;

public class Question141 {
    //second version

    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;
        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);
                System.out.println(pwd[idx]);
                idx++;
//                System.out.println(pwd[idx]);

            }
        } catch (Exception e) {
            System.out.println("Invalid Name");
        }
//        System.out.println(pwd[idx]);

    }


    // Answer
    //     Invalid Name
    //     omas


//    public static void main(String[] args) {
//        String names[] = {"Thomas", "Peter", "Joseph"};
//        String pwd[] = new String[3];
//        int idx = 0;
//        try {
//            for (String n : names) {
//                pwd[idx] = n.substring(2, 6);  //ilk yazilan deger include ama son yazilan deger include olmaz substring de
//                idx++;
//            }
//        } catch (Exception e) {
//            System.out.println("Invalid Name");
//            e.printStackTrace(); //con
//        }
//        for (String p : pwd) {   //pwd[] = {omas, null, null}
//            System.out.println(p);
//        }
//    }
    //What is result?

//A
// Invalid Name

//B
// Invalid Name
// omas

//C
// Invalid Name
// omas
// null
// null

//D
// omas
// ter
// seph

//A.	Option A
//B.	Option B
//C.	Option C
//D.	Option D
//Answer: C

}




	



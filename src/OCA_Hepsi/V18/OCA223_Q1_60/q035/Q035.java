package OCA_Hepsi.V18.OCA223_Q1_60.q035;

public class Q035 {
    public static void main(String[] args) {
		String opt = "true";
		switch (opt) { // switch does not work with  long, double, float and boolean
		case "true":
			System.out.println("True");
			break;
		default:
			System.out.println("***");
		}
		System.out.println("Done");


//        Integer x = 1; //wrapper class da oluyor
//        switch (x) {
//            case 1:
//                System.out.println(4);
//                break;
//            case 2:
//                System.out.println(1);
//                break;
//        }
    }
}

//Which modification enables the code fragment to print TrueDone?
//A.	Replace line 5 With String opt = "true";Replace line 7 with case "true":
//B.	Replace line 5 with boolean opt = l;Replace line 7 with case 1:
//C.	At line 9, remove the break statement.
//D.	Remove the default section.

//CIBS prensibi switch-case icin uygulanir, c = character, i = integer, b = byte, s = string

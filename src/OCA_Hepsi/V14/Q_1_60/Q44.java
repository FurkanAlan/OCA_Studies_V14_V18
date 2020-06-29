package OCA_Hepsi.V14.Q_1_60;

public class Q44 {
}
class MyFile{
    public static void main(String[] args) {
        String arg1 = args[0];
        String arg2 = args[1];
        String arg3 = args[2];
        System.out.println("Arg is "+ arg3);
    }
}
// and this output:
//              Arg is 2

//Which command should you run to obtain this output?
//A.	java MyFile 2
//B.	java MyFile 1 2 3 4
//C.	java MyFile 1 2 2
//D.	java MyFile 2 2
//Answer: C
//3. indeks deki deger 2 olmali

//second version

//public static void main(String[] args) {
//    String arg1 = args[1];
//    String arg2 = args[2];
//    String arg3 = args[3];
//    System.out.println("Arg is "+ arg3);
//}

//burada birde yazilmamis olan String arg0 = args[0];
//vardir bundan dolayi uzunluk 4 olur, yani 4 elemani var toplanda
//Answer javaMyFile 1 3 2 2
package OCA_Hepsi.V14.Q_1_60;

public class Q32 {
    public static void main(String[] args) {
        int aVar = 9;
        //avar hala 9 dur if in icerisinde lakin bundan sonraki addimlarda 10 olur, post increment
        if (aVar++ < 10) {
            System.out.println(aVar + " Hello Universe!");
        } else {
            System.out.println(aVar + " Hello World!");

            //what is the result if the integer aVar is 9?
        }
    }
}
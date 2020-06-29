package OCA_Hepsi.V18.OCA223_Q120_180.q179;

public class TTest {

    int count = 0;
    int i = 0;

    public void changeCount() {
        while (i < 5) {
            i++;  //i++ ile count++ yerleri degissede ayni sonuc 10:10 verir
            count++; //bunun degeri 0 dan 5 e gelir ve orada sabitlenir cunku static daha sonra birdaha dongu olur ve
            // 10 olur, ancak i static olmadigi icin her metod uygulandiginda degeri 0 olur
            //ikisi de static olsa sonuc 5:5 olur cunku dongu 5<5 false oldugu icin ikinci defa donmeyecek ve cikacak
            // lakin son kalan deger 5 oldugu icin ikisi icinde 5 : 5 yazdirir, static olsaydi ikisi de, benzer durum
            // ikisi de sadece int olsaydi yine aynisi olurdu cunku herseferinde dongu bastan basliyor ve static
            // olmadiklari icinde deger sabitlenmiyor.
        }
    }

    public static void main(String[] args) {
        TTest check1 = new TTest();
        TTest check2 = new TTest();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + " : " + check2.count);

        //Answer--> 10 : 10
    }
}

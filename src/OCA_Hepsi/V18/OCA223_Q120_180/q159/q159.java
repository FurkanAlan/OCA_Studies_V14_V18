package OCA_Hepsi.V18.OCA223_Q120_180.q159;

//bu soru baya yaniltmacali
class Book {
    int pages; //global instance egeri 0
}

public class q159 {
    int count;

    public void method(Book x, int k) {
        x.pages = 100;
        k = 200;
    }

    //        public void method(Book x, q159 k) {
//        x.pages = 100;
//        k.count = 200;
//    }

    public static void main(String[] args) {
        q159 obj = new q159();
        Book objBook = new Book();

        System.out.println(objBook.pages + ":" + obj.count); //buradaki objBook, Book class turunden degisken, ve
        // Book class ina referans yapiyor ve biz objBook kullanarak o class in icersinde bulunan pages e
        // ulasabiliriz yalniz herhangi bir deger atanmadigi icin ve global(fields) degisken oldugu icin herhangi bir
        // deger verilmese de otomatik olarak 0 degerini alir primitive oldugu icin

        obj.method(objBook, obj.count); //burada ise q159 class indaki method() u uyguluyoruz ve x.pages = 100;
        // degeri objBook a deger olarak ataniyor objBook.pages sayesinde, lakin obj.count degeri yine 0 olacaktir
        // cunku herhangi alabilecegi bir deger yok k ile herhangi bir baglanti yok anca this.count = 100 olsaydi bir
        // deger alabilirdi
        System.out.println(objBook.pages + ":" + obj.count);
    }
}







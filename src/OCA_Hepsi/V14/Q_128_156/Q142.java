package OCA_Hepsi.V14.Q_128_156;

public class Q142 {
}


interface Readable2 {
    public void readBook();

    public void setBookMark();
}

abstract class Book2 implements Readable2 {    //line n1
    public void readBook() {
        System.out.println("Reading 1");

    }

//     line n2
//    public void setBookMark() {
//
//    }
}

class EBook2 extends Book2 {    //line n3
    public void readBook() {
        System.out.println("Reading 2");
    }

    //line n4

    public void setBookMark() {

    }

    public static void main(String[] args) {
        Book2 book2 = new EBook2();
        EBook2 book3 = new EBook2();
        Readable2 book4 = new EBook2();

//        book2.readBook();
//        book3.readBook();
//        book3.readBook();
        book4.readBook();
    }
}

//bu ornekte goruldugu gibi buarada interface in metodlarini implemnt yapmak zorunda degilim cunku bir onceki sinifta
// zaten implement yapilmis
//ve burada implment yapilmasi sorunu cozmuyor illa ki interface i yada abstracti ilk hangi class baglanti kurduysa
// metodlar onun icerisinde yazilmali

//eger abstract class dan implemnt yapildiysa yine durum bir onceki senaryo gibi olur
//class Ebook3 extends EBook2{
//        public void setBookMark() {
//
//    }
//
//}


/*
A-Replace the code fragment at line n1 with; class Book implements Readable{}
B- At line n2 insert; public abstract void setBookMark();
C- Replace the code fragment at line n3 with; abstract class EBook extends Book{
D- At line n4 insert; public void setBookmark(){

A. Option A
B. Option B
C. Option C
D. Option D

Answer: D

Second version :same question

Third version: question same but options are different
 */
interface Readable {
    public void readBook();

    public void setBookMark();
}

abstract class Book implements Readable {    //line n1
    public void readBook() {
    } // line n2


}

class EBook extends Book {    //line n3
//    public void readBook() {
//    }

    //line 4
    public void setBookMark() {
    }
}


/*
A-Replace the code fragment at line n3 with; abstract class EBook extends Book{
B- Replace the code fragment at line n1 with; class Book implements Readable{
C-  At line n2 insert; public abstract void setBookMark();
D- At line n4 insert; public void setBookmark(){}

A. Option A
B. Option B
C. Option C
D. Option D

Answer A

*/
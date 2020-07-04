package OCA_Hepsi.V18.OCA223_Q1_60.q060;

interface Readable { //interface ave abstract bircok ortak ozelligi var, buradaki metodlar abstract, her nekadar
    //abstract anahtari ile belirtilmis olmasa da
    public void readBook();

    public void setBookMark();
}

abstract class Book implements Readable {        // line n1
    public void readBook() { // burada implement yapilmak zorunda degildi, yapilmasaydi class da mutlaka yapilmaliydi
    }
//	public abstract void setBookMark();																	// line n2
    // abstract class oldugu icin setBookMark();'i implement etmesine gerek yok.
}

class EBook extends Book {                                // line n3
    public void readBook() {
    }

    public void setBookMark() {
    }
    // line n4
}

class Test {
    public static void main(String[] args) {
        Book book1 = new Book() //buradaki durum Book ile alakali oldugu icin herhalukarda Book implment edilmeli
                //ancak Ebook olsaydi implement edilmesine gerek yok
        {
            public void setBookMark() {
            }
        };
        book1.readBook();
    }
}

/*
 * Which option enables the code to compile?
 *
A. Replace the code fragment at line n1 with:
	class Book implements Readable{

B. At line ne insert:
	public abtract void setBookMark();

B. Replace the code fragment at line n3 with:
	abstract class EBook extensd Book{

D. At line n4 insert:
	public void setBookMark(){}

*/
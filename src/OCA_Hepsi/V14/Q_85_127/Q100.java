package OCA_Hepsi.V14.Q_85_127;


class CD{
    int r;
    CD(int r){
        this.r=r;
    }
    CD(){

    }
}
class DVD extends CD {
    //buradaki ifade global seviyede ve eger degeri baslatilmazsa 0 olacak
    int c;
    DVD(int r, int c){
        super.r = r;
//        super(r);
        this.c = c;

        //line n1
//       super(r);
//       this.c=c;
    }
    public String toString(){
        return super.r + ":" + this.c;
    }
}


    //And given  the code fragment:
    public class Q100 {
        public static void main(String[] args) {
            DVD dvd = new DVD(10, 20);
            System.out.println(dvd);

        }
    }
 /*
A. super.r +r;
    this.c=c;
B. super(r);
    this(c);
C. super(r);
    this.c=c;
D. this.c=r;
    super(c);
 */
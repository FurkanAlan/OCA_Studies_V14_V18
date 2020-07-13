package OCA_Hepsi.V18.OCA223_Q108_119.Q113;

//bu sorudaki hassas nokta statik olan bir ifade ve olmayan arasindaki baglanti, statik olan bir metod olmayan qty,
// yada stok u cagiramaz ondan dolayi eger bu iki ifade statik olmazsa hata sebep olur birde printStock olmasi yeterli
public class StockRoom {
    private static int stock = 10;
    private static int qty;

    public void purchase(int qty) {
        stock += qty;
    }

    public void sell(int qty) {
        stock -= qty;
    }

    public static void printStock(String action) {
        System.out.println(action + ":" + qty + "items.stock in Hand: " + stock);
    }

    public static void main(String[] args) {
        StockRoom k1 = new StockRoom();
        k1.sell(5);
        k1.printStock("Sold");
        StockRoom k2 = new StockRoom();
        k2.purchase(5);
        k2.printStock("Purchased");
    }
}



//public class StockRoom {
//    private  int stock = 10;
//    private  int qty;
//
//    public void purchase(int qty) {
//        stock += qty;
//    }
//
//    public void sell(int qty) {
//        stock -= qty;
//    }
//
//    public  void printStock(String action) {
//        System.out.println(action + ":" + qty + "items.stock in Hand: " + stock);
//    }
//
//    public static void main(String[] args) {
//        StockRoom k1 = new StockRoom();
//        k1.sell(5);
//        k1.printStock("Sold");
//        StockRoom k2 = new StockRoom();
//        k2.purchase(5);
//        k2.printStock("Purchased");
//    }
//}
/*You want the code to print:
Sold: 5 items. Stock in Hand: 5 Purchased: 5 items.
 Stock in Hand: 10? Which action enables the code to print this?
  A. Declare the stock variable and the purchase(), sell(), and printStock() methods static.

  B. Declare the stock variable and the printStock() method static.


  C. Declare the stock and qty variables and the printStock() method static.

  D. Declare the stock variable static.
Answer: C

 */

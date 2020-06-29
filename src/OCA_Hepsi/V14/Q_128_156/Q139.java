package OCA_Hepsi.V14.Q_128_156;

public class Q139{

}

class Product{
    //price en son haliyle guncellendi ve 400 oldu daha sonra bunu
    //prt.price ila yazdirdik
        double price;
    }
 class Test8{
        public void updatePrice(Product product, double p) {
            p = p * 2;
            product.price = product.price + p;

        }

        public static void main(String[] args) {
            Product prt = new Product();
            prt.price=200;
            double newPrice = 100;

            Test8 t = new Test8();
            t.updatePrice(prt, newPrice);
            System.out.println(prt.price + "  :  " + newPrice);

        }
    }

/*
What is the result?
 A. 200.0 : 100.0
B. 400.0 : 200.0
C. 400.0 : 100.0
D. Compilation fails.

Answer: C

2. kaynakta ayni sekilde sorulmus
 */
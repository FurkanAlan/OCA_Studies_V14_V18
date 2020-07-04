package OCA_Hepsi.V18.OCA223_Q1_60.q013;

class Vehicle{
	int x;
	Vehicle(){
		this(10);			// line n1 //buradaki this(10) ifadesi, tek parametreli constructor u cagirir
	}
	Vehicle(int x){
		this.x= x;
	}
}
public class Car extends Vehicle{
	int y;
//	Car(){
//		super();
//	}
	Car(){
		super(10);		// line n2
	}

	Car(int y){
		super(y);
		this.y =y;
	}
	public String toString() {
		return super.x + ":" + this.y;
	}
	public static void main(String[] args) {
		Vehicle y = new Car(20);
//		System.out.println(" " +y.x);
		System.out.println(y);


//		Vehicle vhc = new Car();
//		System.out.println(vhc);

//		Car car = new Car();
//		System.out.println(car.x+":"+car.y);  //10:0, burada 10 cikmasinin sebebi, ilk once Car classinda bulunan
		// parametresiz contructor a gider, ve eger Car(){ super(); } olsaydi, burada bulunan super(); parent deki
		// ici bos olan contructor u cagirir(aktiflestitir), parentdeki ici bos olan contructor da
		// Vehicle(){ this(10);} oldugu icin, this(10); , bu ifade parent deki tek parametreli construcor u
		// aktiflestirecek oda field, global degisken olan (class in hemen altinda), int x degerini guncelleyecek ve
		// bu degeri 10 olarak guncelleyecek.
		//car.y ise bize 0 sonucunu verecek cunku global int y degerini alacak, fields lerin degeri atanmamis olsa
		// bile defualt olarak 0 (int ise, primitive class), 0.0 (double, float ise), false (boolean ise), bos, (char
		// ise alacaktir), lakin durum Wrapper class icinn farklilik gosterir ve eger hergangi bir deger atanmamis
		// ise default olarak null degerini alacak, tabi buarada int cinsinden belitrilmis, Car(int y) bundan dolayi
		//Error:(23, 25) java: incompatible types: int cannot be converted to java.lang.Double, oluyor
	}
}

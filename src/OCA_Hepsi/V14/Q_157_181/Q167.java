package OCA_Hepsi.V14.Q_157_181;

public class Q167 {
public static void main(String[] args) {
	
//	LocalDateTime dt =LocalDateTime.of(2014,7,31,1,1);
//	dt.plusDays(30);
//	dt.plusMonths(1);
//	System.out.println(dt.format(DateTimeFormatter.ISO_DATE));

//	LocalDateTime mi LocalDate mi dikkat edelim
	//2. versiyon
//	LocalDate dt =LocalDate.of(2014,7,13);
//	dt.plusDays(30);
//	dt.plusMonths(1);
//	System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));


	//3. versiyon, hata veriyor plusDays ve
//	String  dt = String.valueOf(LocalDateTime.of(2014,7,31,1,1));
//	dt.plusDays(30);
//	dt.plusMonths(1);
//	System.out.println(dt.format(DateTimeFormatter.ISO_DATE));


	/*
	 */
	/*
	 What is the result?  ( Answer C --> 2014-07-31 )
	 
		A. An exception is thrown at runtime.
		B. 07-31-2014
		C. 2014-07-31
		D. 2014-09-30


	dt= dt.plusDays(30); bu sekilde tekrar dt ye assign etmedigi icin tarih degismez
	dt= dt.plusMonths(1);
	 
	 */
	
}
}

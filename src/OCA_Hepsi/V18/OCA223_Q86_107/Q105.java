package OCA_Hepsi.V18.OCA223_Q86_107;

import java.time.LocalDate;

public class Q105 {


//Given the code fragment:

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 01, 32); //onemli bir husus, burada Compile hatasi verecek bir durum yok lakin
        // program calsitinda exception verecek cunku maksimum gun 31 olabilir, java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 32
        date.plusDays(10);
        System.out.println(date);
    }

		/* What is
		the result?
		A . 2012-02-10
		B . 2012-02-11
		C.Compilation fails
		D.A DateTimeException is thrown at runtime.

Answer:D

*/

/*
Q_144

Given the code fragment:
public static void main (String [] args) {
LocalDate date = LocalDate.of (2012, 01, 32);
 date.plusDays (10);
 System.out.println (date);
		  What is the result?
		  A. 2012-02-10
		  B. 2012-02-11
		  C. Compilation fails
		  D. A DateTimeException is thrown at runtime.

*/
}

package OCA_Hepsi.V18.OCA223_Q1_60.q003;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q003 {
	public static void main(String[] args) {
		String date = LocalDate
										.parse("2014-05-04") // time is not assigned here
										.format(DateTimeFormatter.ISO_DATE_TIME);  //_TIME should be removed
		System.out.println(date);
	}
}

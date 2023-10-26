package core3;

import java.time.LocalDate;
import java.util.Date;

public class DateUtils {
	public static void main(String[] args) {
//		index
		Date date = new Date(47, 7, 15);

		System.out.println(date);
		LocalDate now = LocalDate.of(1947, 8, 15);
		System.out.println(now);

	}
}

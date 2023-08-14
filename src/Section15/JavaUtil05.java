package Section15;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JavaUtil05 {
	public static void main(String[] args) {
		
	}
	public static String dateCalc(
			String strDate,
			String format,
			int addYear,
			int addMonth.
			int addDate,
			int addHour,
			int addMinite,
			int addSecond
			
			) {
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(strDate);
		
		Calender cal = Calendar.getInstance();
		cal.setTime(date); //Date 객체 > Calendar 호환
		
		cal.Add(Calendar.YEAR,+addYear);
		cal.Add(Calendar.MONTH,+addYear);
		cal.Add(Calendar.DATE,+addYear);
		cal.Add(Calendar.HOUR_OD_DAY,+addYear);
		cal.Add(Calendar.MINUTE,+addYear);
		cal.Add(Calendar.SECOND,+addYear);
		
		return sdf.format(cal.getTime())
	}

}

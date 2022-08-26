/*
 * Calendar를 이용하여 현재 날짜와 시간을 알아내는 방법과 개발자가 저장하고자 하는 날짜와 시간을 기억하는 방법을 알아본다
 */

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar (String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; //Calendar.MONTH는 1~12가 아닌 0~11
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR); //0~11시
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); //0~23시
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int milliSecond = cal.get(Calendar.MILLISECOND);
		System.out.println(msg + year + "/" + month + "/" + day + "/");
		
		switch (dayOfWeek) { //dayOfWeek의 정수 값에 해당하는 요일 값이 같으면 한국말로 출력
		case Calendar.SUNDAY :
			System.out.println("일요일"); break;
		case Calendar.MONDAY :
			System.out.println("월요일"); break;
		case Calendar.TUESDAY :
			System.out.println("화요일"); break;
		case Calendar.WEDNESDAY :
			System.out.println("수요일"); break;
		case Calendar.THURSDAY :
			System.out.println("목요일"); break;
		case Calendar.FRIDAY :
			System.out.println("금요일"); break;
		case Calendar.SATURDAY :
			System.out.println("토요일"); break;
		}
		
		System.out.println("(" + hourOfDay + "시)");
		
		if (ampm == Calendar.AM)
			System.out.println("오전");
		else
			System.out.println("오후");
		
		System.out.println(hour + "시" + minute + "분" + second + "초" + milliSecond + "밀리초");
	}
	
	public static void main (String[] args) {
		Calendar now = Calendar.getInstance(); //Calendar는 추상 클래스 이므로 객체 생성 메소드를 따로 사용
		printCalendar("현재", now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2016, 11, 25); //2016년 11월 25일
		firstDate.set(Calendar.HOUR_OF_DAY, 20); //저녁 8시
		firstDate.set(Calendar.MINUTE, 30); //30분
		printCalendar("처음 데이트한 날은 ", firstDate);
	}
}

package Day11.Ex01_Time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeOperationEx {

	public static void main(String[] args) {
		
		LocalDateTime now =LocalDateTime.now();
		
		System.out.println("현재시간 : " + now);
		
		// +1년 +1개월 +1일 -3시간 -15분 -25초
		LocalDateTime targetTime = now.plusYears(1)
									.plusMonths(1)
									.plusDays(1)
									.minusHours(3)
									.minusMinutes(15)
									.minusSeconds(50);
		
		System.out.println("변경시간 : " + targetTime);
		
		targetTime = now.withYear(2000)
						.withMinute(5)
						.withDayOfMonth(27)
						.withHour(18)
						.withMinute(50)
						.withSecond(0);
		
		System.out.println("태어날 시간 : " + targetTime);
		
		//년도
		targetTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("올해의 첫날 : " + targetTime);

		targetTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올해의 마지막날 : " + targetTime);
		
		targetTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음해의 첫 날 : " + targetTime);
		
		//월
		targetTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번달의 첫 날 : " + targetTime);

		targetTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번달의 마지막날 : " + targetTime);
		
		
		//요일
		targetTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번달의 첫번째 월요일 : " + targetTime);
		
		targetTime = now.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("다음 토요일 : " + targetTime);
		
		targetTime = now.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
		System.out.println("지난 일요일 : " + targetTime);
		
	}
	
}

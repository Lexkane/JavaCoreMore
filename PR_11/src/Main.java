import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
			
													//1
	//	random.ints(-100,100).limit(sc.nextInt()).forEach(System.out::println);

													//2
//		random.ints(-100,100).limit(sc.nextInt()).sorted().forEach(System.out::println);
		
													//3
//		System.out.println(random.ints(-100,100).limit(sc.nextInt()).max());
		
													//4
//		System.out.println(LocalDate.now().getDayOfWeek());
		
													//5
//		System.out.println(LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
		
													//6

		ArrayList<String> list = new ArrayList<String>();
		
		list = UUID.randomUUID().toString().intern().collect(Collectors.toList());
	//	list = UUID.randomUUID().toString().intern().limit(10).boxed().collect(Collectors.toList());
	//	list = UUID.randomUUID().toString().collect(Collectors.toList());
	//	list = UUID.randomUUID().ints().limit(10).boxed().collect(Collectors.toList());
	//	list.stream().forEach(UUID.randomUUID());
	//	UUID.randomUUID().forEach();
		System.out.println(	UUID.randomUUID().toString());
		
		// https://stackoverflow.com/questions/41107/how-to-generate-a-random-alpha-numeric-string
		
		
	}

}

package ifexample;

import java.util.Scanner;

public class SwitchCaseEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		int day;
		
		switch (month) { // 
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day=31;
			break;

		case 2:
			day= 28;
			break;

		case 4: case 6: case 9: case 11:
			day=30;
			break;
		default:
			System.out.println("Error");
			day = 0;
			break;
		}
		
		System.out.println(month+" 월의 마지막 날은 "+day+" 일입니다.");
	}

}



//1-31 
//3-31
//5-31
//7-31
//8-31
//10-31
//12-31

//2-28 

//4-30 
//6-30 
//9-30 
//11-30 

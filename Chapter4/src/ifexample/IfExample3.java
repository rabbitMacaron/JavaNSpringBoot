package ifexample;

import java.util.Scanner;

public class IfExample3 {

	// 성적에 따라 학점 부여하기
	// 100-90 > A
	// 89-80  > B
	// 79-70  > C
	// 69-60  > D
	// 59 이하 > F
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해주세요:");
		
		
		int score = scan.nextInt();
		String grade = "";
		
		
		if(score<=100 && score >=90) {
			grade="A";
		} else if(score<=89 && score >=80) {
			grade="B";
		} else if(score<=79 && score >=70) {
			grade="C";
		} else if(score<=69 && score >=60) {
			grade="D";
		} else if(score<=59) {
			grade="F";
		}
		
		
		System.out.println(score + "점은 "+grade +" 학점입니다.");
	}

}

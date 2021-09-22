package hiding;

// public   	 
// : 모두 접근 가능

// private  	 
// : 클래스 내부에서만 가능. 외부에선 x

// protected	 
// : 상위 클래스의 private를 하위 클래스에서 사용할 수 있게 하려면

// 아무것도 안 쓰는경우(기본접근제어자)
// : 같은 패키지 내에서만 가능.. 서로 다른 패키지에선 x


public class MyDate {
	// 멤버변수
	private int day;	
	private int month;
	private int year;
	
	private Boolean isValid;
	
	
	// get, set을 꼭 같이 써야하는 건 아님
	// set X get O -> readOnly
	 
	
	//private 변수를 사용하고 싶다면 public 메서드 제공
	public void setDay(int day) {
		this.day = day; //this 빼면 안됨... 
		// day = day > 매개변수day에 값을 넣겠다.... 멤버변수엔 값이 안들어감..!
	}
	
	public int getDay() {
		return day;
	}
	
	
	public int getMonth() {
		return month;
	}

	// 메서드에서 유효한 데이터인지 아닌지 핸들링할 수 있음.. -> 정보보호, 오류를 막는 행위
	public void setMonth(int month) {
		if(month<1 || month > 12) {
			isValid= false;
		}
		this.month = month; //this.month<-멤버변수, month<-매개변수
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	public void showDate() {
		if(isValid) { //true일 경우
			System.out.println(year+"년 "+month+"월 "+ day+"일 입니다.");
		} else {
			System.out.println("유효하지않은 날짜입니다.");
		}
	}
	
}

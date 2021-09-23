package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		System.out.println("********");
		// 향상된 for문
		// 어떤 객체로 element를 꺼내올 것인지... 타입 타입에대한 변수선언 : 출력할 대상
		// copyLibrary 갯수만큼 돌고.. book에 넣는다.
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		//for(변수 : 배열) { 반복 실행문; }
		for(Book book:library) {
			book.showBookInfo();
		}
		System.out.println("==================");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		// 복사한 copyLibrary의 값도 바뀜.. -> 얕은 복사!
		// 얕은 복사는 주소값만 복사...
		
		// 깊은 복사 > arraycopy 사용x, 하나하나 다 복사
	}
}

package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//<> <-String을 안 써도 되지만 써주는 게 좋음.
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0; i<list.size(); i++) { // 배열은.. 배열의 길이!(element 가 없어도 길이가 출력. size는 element존재하는 갯수만!
			String str= list.get(i);
			System.out.println(str);
		}
		
		// 처음부터 끝까지 다 꺼낼거면,,, 향상된 for문이 더 좋음!
		for(String s : list) { // ArrayList선언 시 <type> 써주지않으면 Object로 받아야함.
			System.out.println(s);
		}
	}

}

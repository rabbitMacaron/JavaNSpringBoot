package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//<> <-String�� �� �ᵵ ������ ���ִ� �� ����.
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0; i<list.size(); i++) { // �迭��.. �迭�� ����!(element �� ��� ���̰� ���. size�� element�����ϴ� ������!
			String str= list.get(i);
			System.out.println(str);
		}
		
		// ó������ ������ �� �����Ÿ�,,, ���� for���� �� ����!
		for(String s : list) { // ArrayList���� �� <type> ������������ Object�� �޾ƾ���.
			System.out.println(s);
		}
	}

}

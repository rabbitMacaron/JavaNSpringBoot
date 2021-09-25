package chapter6;

import java.util.ArrayList;

public class Student {
	int studentID;
	String name;
	
	ArrayList<Book> bookList;
	
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	
		bookList = new ArrayList<Book>();
	}
	
	
	public void addBook(String name) {
		Book book = new Book(name);
		bookList.add(book);
	}
	
	
	public void showStudentInfo() {
		System.out.print(name+" 학생이 읽은 책은 : ");
		for(Book book : bookList) {
			System.out.print(book.getName()+" ");
		}
		System.out.println("입니다");
	}
	
	
	
	/*// 강사님 답
	int studentID;
	String studentName;
	ArrayList<Book> bookList;
	int index;
	
	public Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String title, String author){
		Book book = new Book();
		
		book.setAuthor(author);
		book.setBookName(title);
		bookList.add(book);
	}
	
	public void showStudentInfo()
	{
		System.out.print( studentName + " 학생이 읽은 책은 : ");
				
		for(Book book : bookList){
			System.out.print(book.getBookName() + " ");
		}
		
		System.out.println("입니다");
	}*/
}

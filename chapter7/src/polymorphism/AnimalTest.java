package polymorphism;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	// 상위 클래스에서 오바라이딩으로 해결한 수 있는 경우  -> polymorphism(다형성)하는 게 더 융통성 있음
	public void eatting() { // 먹는 건 동물들 모두 다 하니까!
		System.out.println();
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}


class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}



public class AnimalTest {
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
	
		//hAnimal. <- readBook()안뜸.. 왜냐? Animal type이기 때문에
//		Human human = (Human)hAnimal;
//		human.readBooks();
		
//		Eagle human = (Eagle)hAnimal; // 우변은, 인스턴스는 human인데 eagle로 강제 캐스팅불가다!!
//		if(hAnimal instanceof Human) {
//			Human human = (Human)hAnimal;
//			human.readBooks();
//		} //instanceof 는 true or false를 반환.
		
		
		/*AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);*/
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		/*for(Animal animal : animalList) {
			animal.move();
		}*/
	}
	
	// 다운캐스팅은 명시적으로 일어난다. 안정적으로 하기 위해선 instanceof를 쓴다.
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			} else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			} else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			} else {
				System.out.println("error");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}
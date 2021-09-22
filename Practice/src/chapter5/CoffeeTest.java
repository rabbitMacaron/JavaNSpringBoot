package chapter5;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Worker workerKim = new Worker("±Ë ¡π∑¡", 0);
		Worker workerLee = new Worker("¿Ã ««∞Ô", 0);
		
		StarCoffee starAmericano = new StarCoffee(4000);
		BeanCoffee beanlatte = new BeanCoffee(4500);
		
		workerKim.buyStarCoffee(starAmericano);
		workerLee.buyBeanCoffee(beanlatte);
		
		
		
	/*// ∞≠ªÁ¥‘ ¥‰
		Person kim = new Person("Kim", 10000);
		Person Lee = new Person("Lee", 10000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		Lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);*/
	
	}

}

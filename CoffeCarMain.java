
public class CoffeCarMain {

	public static void main(String[] args) {
		
		CoffeCar espresso = new CoffeCar();
		
		espresso.setSortOfCoffe("Mix");
		espresso.setName("Espresso");
		espresso.setRegion("Ergacefe");
		espresso.setTaste("Taste of barries and caramel");
		espresso.setWeight(120);
		espresso.totalWeight = 400;
		
		System.out.println(espresso.toString());
		espresso.printStaticSum();
		espresso.printSum();
		
		CoffeCar kenia = new CoffeCar("Niery", "Kenia", "Nacuru", "Chocolate");
	    kenia.totalWeight = 400;
        
	    System.out.println(kenia.toString());
		espresso.printStaticSum();
		espresso.printSum();
		
		CoffeCar sunrise = new CoffeCar("Mundo Novo", "Sunrise", "Serrado", "Taste of peanut, hazelnut and milk chocolate", 200, 376);
	
		System.out.println(sunrise.toString());
		espresso.printStaticSum();
		espresso.printSum();
	}

}

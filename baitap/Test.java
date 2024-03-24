package baitap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Speaker a = new Dog(); // b
		
		Speaker first, second; // c
		first = new Dog();
		second = new Philosopher();
		first.speak();
		first = second;
		
		Speaker first1 = new Dog(); // d
		Philosopher second1 = new Philosopher();
		second1.pontificate();
		first1 = second1;
		first1.announce("gqhir");
		
		Speaker first2 = new Dog(); // e
		Philosopher second2 = new Philosopher();
		first2 = second2;
		second2.pontificate();
	//	first2.pontificate(); // ((Philosopher) first2).pontificate();
	}

}

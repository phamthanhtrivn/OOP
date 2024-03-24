package bai07;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] nv = {
			new HourLyEmployee("David", "Beckam", "123456789", 30, 34),
			new SalariedEmployee("Macus", "RashFord", "123456799", 500),
			new CommissionEmployee("Cristiano", "Ronaldo", "123456709", 400, 150),
			new BasePlusCommissonEmployee("Harry", "Kane", "123456719", 300, 100, 1000)
		};
		
		
		for (Employee x : nv) {
			System.out.println(x);
			System.out.printf("Earning: %.2f\n", x.earnings());
		}
		
		
	}

}

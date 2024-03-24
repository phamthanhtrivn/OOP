package bai01;

public class Main {

	public static void main(String[] args) {
		Xe[] xe = new Xe[4];
		
		xe[0] = new XeNoiThanh("123", "Tran Van An", "234", 130000, "57", 124);
		xe[1] = new XeNgoaiThanh("124", "Nguyen Trung Truc", "467", 150000, "Cu Chi", 2);
		xe[2] = new XeNgoaiThanh("125", "Le Van Luyen", "467", 110000, "Cu Chi", 2);
		xe[3] = new XeNoiThanh("126", "Ha Xuan Phu", "234", 190000, "57", 124);
		
		double sum = 0;
		for (Xe x : xe) {
			System.out.println(x);
			sum += x.getDoanhThu();
		}
		System.out.printf("Doanh thu cua tat ca cac xe la: %.2f\n", sum);
		
		double sum2 = 0;
		for (int i = 0; i < xe.length; i++) {
			if (xe[i] instanceof XeNoiThanh) {
				sum2 += xe[i].getDoanhThu();
			}
		}
		System.out.printf("Doanh thu cua Xe Noi Thanh la: %.2f\n", sum2);
		
		double sum3 = 0;
		for (int i = 0; i < xe.length; i++) {
			if (xe[i] instanceof XeNgoaiThanh) {
				sum3 += xe[i].getDoanhThu();
			}
		}
		System.out.printf("Doanh thu cua Xe Ngoai Thanh la: %.2f\n", sum3);
	}

}

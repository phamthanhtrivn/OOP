package bai04;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiaoDich[] gd = new GiaoDich[6];
		
		gd[0] = new GiaoDichDat("D001", LocalDate.of(2023, 9, 13), 5000000, 80, "A");
		gd[1] = new GiaoDichNha("N001", LocalDate.of(2013, 9, 5), 10000000, 100, "cao cap", "Ben Tre");
		gd[2] = new GiaoDichDat("D002", LocalDate.of(2013, 10, 23), 4000000, 60, "B");
		gd[3] = new GiaoDichNha("N002", LocalDate.of(2013, 9, 5), 10000000, 90, "thuong", "Vung Tau");
		gd[4] = new GiaoDichDat("D003", LocalDate.of(2013, 9, 4), 9000000, 70, "C");
		gd[5] = new GiaoDichNha("N003", LocalDate.of(2023, 9, 7), 10000000, 110, "cao cap", "Ha Noi");
		
		int cnt = 0, cnt2 = 0;
		for (GiaoDich x : gd) {
			if (x instanceof GiaoDichNha) {
				cnt++;
			}
			if (x instanceof GiaoDichDat){
				cnt2++;
			}
		}
		System.out.printf("So luong cua Giao Dich Nha: %d\n", cnt);
		System.out.printf("So luong cua Giao Dich Dat: %d\n", cnt2);
		
		double avg = 0;
		int n = 0;
		for (GiaoDich x : gd) {
			if (x  instanceof GiaoDichDat) {
				avg += ((GiaoDichDat) x).thanhTien();
				n++;
			}
		}
		System.out.printf("Trung binh thanh tien cua Giao Dich Dat: %.2f\n", avg/n);
		
		System.out.println("\n");
		System.out.println("Cac giao dich thang 9 nam 2013");
		for (GiaoDich x : gd) {
			if (x.getNgayGD().getMonthValue() == 9 && x.getNgayGD().getYear() == 2013) {
				System.out.print(x);
			}
		}
	}

}

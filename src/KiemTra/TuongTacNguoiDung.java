package KiemTra;

import java.util.Scanner;

public class TuongTacNguoiDung {
	public static int luaChonChucNang(Scanner sc) {
		int luaChon = sc.nextInt();
		while (luaChon > 3 || luaChon < 1) {
			System.out.print("Chuc nang khong phu hop! Nhap lai: ");
			luaChon = sc.nextInt();
		}
		return luaChon;
	}

	public static char luaChonTiepTuc(Scanner sc) {
		System.out.print("Ban muon thuc hien chuc nang khac khong (y/n)?: ");
		return sc.next().charAt(0);
	}
}

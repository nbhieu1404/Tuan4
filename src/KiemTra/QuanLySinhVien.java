package KiemTra;

import java.util.Scanner;

public class QuanLySinhVien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon;
		HocSinh hs = null;

		do {
			DanhSachChucNang.danhSachChucNang();
			luaChon = TuongTacNguoiDung.luaChonChucNang(sc);

			switch (luaChon) {
			case 1:
				hs = new HocSinh();
				hs.nhapThongTin(sc);
				break;
			case 2:
				if (hs != null) {
					System.out.println("Thong tin sinh vien: " + hs.toString());
				} else {
					System.out.println("Chua nhap thong tin hoc sinh!");
				}
				break;
			case 3:
				if (hs != null) {
					System.out.println("Diem trung binh: " + hs.diemTrungBinh());
				} else {
					System.out.println("Chua nhap thong tin hoc sinh!");
				}
				break;
			}
		} while (TuongTacNguoiDung.luaChonTiepTuc(sc) == 'y');

		System.out.println("Chuong trinh ket thuc!");
		sc.close();
	}
}

package KiemTra;

import java.util.Scanner;

public class HocSinh {
	private String ten;
	private int tuoi;
	private float diemToan;
	private float diemVan;

	public HocSinh() {
		super();
	}

	public HocSinh(String ten, int tuoi, float diemToan, float diemVan) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public void nhapThongTin(Scanner sc) {
		sc.nextLine();
		System.out.print("Ten sinh vien: ");
		setTen(sc.nextLine());
		System.out.print("Tuoi: ");
		setTuoi(sc.nextInt());
		nhapDiem(sc, "Toan", diemToan);
		nhapDiem(sc, "Van", diemVan);
	}

	private void nhapDiem(Scanner sc, String monHoc, float diem) {
		do {
			System.out.print("Diem " + monHoc + ": ");
			diem = sc.nextFloat();
			if (diem > 10.0 || diem < 0.0) {
				System.out.println("Diem " + monHoc + " khong hop le! Nhap lai.");
			}
		} while (diem > 10.0 || diem < 0.0);

		if (monHoc.equals("Toan")) {
			setDiemToan(diem);
		} else if (monHoc.equals("Van")) {
			setDiemVan(diem);
		}
	}

	@Override
	public String toString() {
		return "HocSinh [Ten = " + ten + ", Tuoi = " + tuoi + ", Diem Toan = " + diemToan + ", Diem Van = " + diemVan
				+ "]";
	}

	public float diemTrungBinh() {
		return ((getDiemToan() + getDiemVan()) / 2f);
	}
}

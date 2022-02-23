package BT_QLHS;

import java.util.Scanner;

public class HocSinh {
    private String hoTen;
    private double dToan;
    private double dVan;
    private double dAnh;
    private double tbMax;

    public HocSinh(String hoTen, double dToan, double dVan, double dAnh) {
        this.hoTen = hoTen;
        this.dToan = dToan;
        this.dVan = dVan;
        this.dAnh = dAnh;
    }

    public HocSinh() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getdToan() {
        return dToan;
    }

    public void setdToan(double dToan) {
        this.dToan = dToan;
    }

    public double getdVan() {
        return dVan;
    }

    public void setdVan(double dVan) {
        this.dVan = dVan;
    }

    public double getdAnh() {
        return dAnh;
    }

    public void setdAnh(double dAnh) {
        this.dAnh = dAnh;
    }

    public void nhapTTHS(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ho ten: ");
        hoTen=scanner.nextLine();
        System.out.println("Diem Toan: ");
        dToan = scanner.nextDouble();
        System.out.println("Diem Van: ");
        dVan = scanner.nextDouble();
        System.out.println("Diem Anh: ");
        dAnh = scanner.nextDouble();
    }

    public void inTTHS(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Diem toan: "+dToan);
        System.out.println("Diem van: "+dVan);
        System.out.println("Diem anh: "+dAnh);

    }

    public double tinhDiemTB(){
        return (dToan+dVan+dAnh)/(double) 3;
    }

}

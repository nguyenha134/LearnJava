package BT_QLHS;

import java.util.Scanner;

public class Lop extends HocSinh{
    private String maLop;
    private String tenLop;
    HocSinh hocSinh1, hocSinh2;

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public Lop(String hoTen, double dToan, double dVan, double dAnh) {
        super(hoTen, dToan, dVan, dAnh);
    }

    public Lop() {
    }

    public void khoiTaoLop(String maLop, String tenLop){
        this.maLop=maLop;
        this.tenLop = tenLop;
    }

    public void nhapDSHS(HocSinh hocSinh1, HocSinh hocSinh2){
      //  super.nhapTTHS();
        this.hocSinh1=hocSinh1;
        this.hocSinh2=hocSinh2;
    }

    public void inTTlop̣̣̣(){
        System.out.println("\nThong tin cac HS lop: Lop "+ getTenLop());
        hocSinh1.inTTHS();
        System.out.println("Diem trung binh: "+ hocSinh1.tinhDiemTB());

        System.out.println("\nThong tin cac HS lop: Lop "+ getTenLop());
        hocSinh2.inTTHS();
        System.out.println("Diem trung binh: "+ hocSinh2.tinhDiemTB());
    }


}

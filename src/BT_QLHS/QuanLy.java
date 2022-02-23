package BT_QLHS;

public class QuanLy extends Lop{
    public QuanLy(String hoTen, double dToan, double dVan, double dAnh) {
        super(hoTen, dToan, dVan, dAnh);
    }

    public QuanLy() {
    }

    Lop lop1, lop2;

    public void khoiTaoDSLop(Lop lop1, Lop lop2){
        this.lop1 = lop1;
        this.lop2 = lop2;
    }

    public void inDSLop(){
       // super.inTTlop̣̣̣();

        lop1.inTTlop̣̣̣();
        lop2.inTTlop̣̣̣();
    }
}

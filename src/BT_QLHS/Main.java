package BT_QLHS;

public class Main {
    public static void main(String[] args) {
        QuanLy ql = new QuanLy();
        Lop lop1 = new Lop();
        lop1.khoiTaoLop("10_A1", "10A1");
        HocSinh hs1= new HocSinh();
        hs1.nhapTTHS();
        HocSinh hs2 = new HocSinh();
        hs2.nhapTTHS();
        lop1.nhapDSHS(hs1, hs2);
        Lop lop2 = new Lop();
        lop2.khoiTaoLop("10_A2", "10A2");
        HocSinh hs3 = new HocSinh();
        hs3.nhapTTHS();
        HocSinh hs4 = new HocSinh();
        hs4.nhapTTHS();
        lop2.nhapDSHS(hs3, hs4);
        ql.khoiTaoDSLop(lop1, lop2);
        System.out.println("Danh sach cac lop quan ly: ");
        ql.inDSLop();

    }
}

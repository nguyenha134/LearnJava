package KhaiBaoDoiTuong;

public class Student {
    private int id;
    private String name;
    private double dToan;
    private double dAnh;
    private double dVan;

    public Student() {
    }

    public Student(int id, String name, double dToan, double dAnh, double dVan) {
        this.id = id;
        this.name = name;
        this.dToan = dToan;
        this.dAnh = dAnh;
        this.dVan = dVan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getdToan() {
        return dToan;
    }

    public void setdToan(double dToan) {
        this.dToan = dToan;
    }

    public double getdAnh() {
        return dAnh;
    }

    public void setdAnh(double dAnh) {
        this.dAnh = dAnh;
    }

    public double getdVan() {
        return dVan;
    }

    public void setdVan(double dVan) {
        this.dVan = dVan;
    }

    public void InfPrint(){
        System.out.println("Id: "+ id);
        System.out.println("Name: "+name);
        System.out.println("Diem Toan: "+dToan);
        System.out.println("Diem Van: "+dVan);
        System.out.println("Diem Anh: "+dVan);
    }
}

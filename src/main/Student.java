package main;

import java.util.Scanner;

public class Student {
    private String name;
    private String id;
    private float maths;
    private float physical;
    private float chemistry;
    private float biology;

    public Student() {
    }

    public Student(String name, String id, float maths, float physical, float chemistry, float biology) {
        this.name = name;
        this.id = id;
        this.maths = maths;
        this.physical = physical;
        this.chemistry = chemistry;
        this.biology = biology;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getMaths() {
        return maths;
    }

    public void setMaths(float maths) {
        this.maths = maths;
    }

    public float getPhysical() {
        return physical;
    }

    public void setPhysical(float physical) {
        this.physical = physical;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    public float getBiology() {
        return biology;
    }

    public void setBiology(float biology) {
        this.biology = biology;
    }


    public void getStudent() {
        System.out.println("Ten sinh vien:" + name);
        System.out.println("Ma sinh vien: " + id);
        System.out.println("Diem toan: " + maths);
        System.out.println("Diem ly: " + physical);
        System.out.println("Diem hoa: " + chemistry);
        System.out.println("Diem sinh: " + biology);
        System.out.println("Diem trung binh: " + (maths + physical + chemistry + biology) / 4);
    }

    static Scanner sc = new Scanner(System.in);


    public void inputStudent() {
        System.out.println("Nhap ten sinh vien: ");
        name = sc.nextLine();
        System.out.println("Nhap ma SV: ");
        id = sc.nextLine();
        System.out.println("Nhap diem toan: ");
        maths = sc.nextFloat();
        System.out.println("Nhap diem ly: ");
        physical = sc.nextFloat();
        System.out.println("Nhap diem hoa: ");
        chemistry = sc.nextFloat();
        System.out.println("Nhap diem sinh: ");
        biology = sc.nextFloat();
    }

    public void classification() {
        if (6 < ((maths + physical + chemistry + biology) / 4) && ((maths + physical + chemistry + biology) / 4) < 8 ){
            System.out.println("Sinh vien hoc luc kha.");
        } else if (((maths + physical + chemistry + biology) / 4) < 6){
            System.out.println("Sinh vien hoc luc kem.");
        } else if (8 < ((maths + physical + chemistry + biology) / 4)) {
            System.out.println("Sinh vien hoc luc tot.");
        }
    }

}

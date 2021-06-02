package Hoa.dev;
import java.util.*;
public class MainApp {
	static void input(Student[] students) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("Sinh vien thu: " + i);
			students[i] = new Student();
			System.out.println("Ten: ");
			students[i].Ten = sc.next();
			System.out.println("Tuoi: ");
			students[i].Tuoi = sc.nextInt();
			System.out.println("Dia Chi: ");
			students[i].DiaChi = sc.next();
			System.out.println("So Dien Thoai: ");
			students[i].Sdt = sc.next();
			System.out.println("Diem Trung Binh: ");
			students[i].DTB = sc.nextDouble();
		}
	}	
	static void print(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].Ten +":"+ students[i].Tuoi);
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[10];
		input(students);
		print(students);
	}

}

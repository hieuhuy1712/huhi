import  java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chieu dai cua hinh chu nhat: ");
        long a = sc.nextLong();
        System.out.println("Nhap chieu rong cua hinh chu nhat: ");
        long b = sc.nextLong();
        System.out.println("Chu vi cua hinh chu nhat la: "+(a+b)*2);
        System.out.println("Dien tich cua hinh chu nhat la: "+a*b);
    }
}
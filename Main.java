import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap mot so: ");
         long a = sc.nextLong();
         System.out.println("Can bac hai cua so da nhap la: "+Math.sqrt(a));
         System.out.println("Sin cua so da nhap la: "+Math.sin(a));
         System.out.println("Cos cua so da nhap la: "+Math.cos(a));
    }
}
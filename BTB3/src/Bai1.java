import java.util.Scanner;

public class Bai1 {
    public static final String Square = "square";
    public static final String Triangle = "triangle";
    public static final String Circle = "circle";
    public static void vuong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap canh hinh vuong : ");
        double a = sc.nextDouble();
        System.out.println("Dien tich hinh vuong la : " + (a*a));
    }
    public static void HinhTG(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ba canh cua tam giac : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = (a+b+c)/2;
        System.out.println("Dien tich hinh tam giac la : " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }
    public static void HinhTron(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ban kinh : " );
        double a = sc.nextDouble();
        System.out.println("Dien tich hinh tron : "+ (Math.PI*a*a));
    }

    public static void main(String[] args) {
        System.out.println("Moi nhap loai hinh : ");
        Scanner sc = new Scanner(System.in);
        String Nhap = sc.nextLine().toLowerCase();
        if (Nhap.equals(Square)){
            vuong();
        } else if (Nhap.equals(Triangle)){
            HinhTG();
        } else if (Nhap.equals(Circle)){
            HinhTron();
        } else {
            System.out.println("Hình dạng không hợp lệ!");
        }
        }
}

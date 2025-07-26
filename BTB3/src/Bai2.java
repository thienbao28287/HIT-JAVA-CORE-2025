import java.util.Scanner;

public class Bai2 {
    public static String Nhap(){
        Scanner sc = new Scanner(System.in);
        String a =  sc.nextLine();
        return a;
    }
    public static boolean KiemTra(String a){
        String chuoi="";
        for (int i = a.length() - 1; i >= 0; i--) {
            chuoi = chuoi + a.charAt(i);
        }
        if (chuoi.equalsIgnoreCase(a)){
            return true;
        } else
            return false;
    }
    public static void main(String[] args) {
        System.out.println("Nhap Chuoi : ");
        String a = Nhap();
        if (KiemTra(a)){
            System.out.println(a.toUpperCase());
            System.out.println(" Chuỗi này đối xứng");
        } else {
            System.out.println(a.toLowerCase());
            System.out.println(" Chuỗi này đối xứng");
        }
    }
}

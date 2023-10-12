import java.util.Scanner;

public class Pelanggan01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nama;
        char jawab;
        int jml = 0;

        do {
            System.out.print("Masukkan nama pelanggan: ");
            nama = sc.nextLine();
            jml++;
            System.out.print("Apakah Anda ingin memasukkan nama pelanggan baru (y/t)? ");
            jawab = sc.nextLine().charAt(0);
        }while (jawab == 'y' || jawab == 'y');
        System.out.println("Jumlah pelanggan yang Anda masukkan = " + jml);
    }
}

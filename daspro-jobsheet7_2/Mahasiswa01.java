import java.util.Scanner;

public class Mahasiswa01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nama, jenisKelamin;
        int count = 0;
        String output = "";
        
        while (count < 30 ) {
            System.out.print("Masukkan nama mahasiswa: ");
            nama = sc.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa (L/P): ");
            jenisKelamin = sc.nextLine();
            
            if (jenisKelamin.equalsIgnoreCase("P")) {
                output += nama + "\n";
            }

            count++;
        }
        
        System.out.println("Nama-nama mahasiswa perempuan:");
        System.out.println(output);
    }
}

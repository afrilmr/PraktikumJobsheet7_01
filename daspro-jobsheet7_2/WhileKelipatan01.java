import java.util.Scanner;

public class WhileKelipatan01 {
    public static void main(String[] args) {

    Scanner inputscan = new Scanner(System.in);
    int kelipatan, jumlah = 0, counter = 0;
    double avr = 0;

    System.out.print("Masukkan bilangan kelipatan (1-9): ");
    kelipatan = inputscan.nextInt();

    int i = 1;
    while  (i <= 50) {
        if (i % kelipatan == 0) {
            jumlah += i;
            counter++;
        } i++;
        avr = (double) jumlah / counter;
    }
    
System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, avr);
    }
}


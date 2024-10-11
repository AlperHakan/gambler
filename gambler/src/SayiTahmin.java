import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random random = new Random();
        int rastgeleSayi = random.nextInt(100) + 1;
        int count = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tahmininizi girin. ");

        while (count > 0) {
            System.out.print(count + " Hakkınız kaldı Tahmininizi girin ");
            int tahmin = scanner.nextInt();

            if (tahmin < 1 || tahmin > 100) {
                System.out.println("Lütfen 1 ile 100 arasında bir sayı girin.");
                continue;
            }

            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler, bildiniz!");
                return;
            }

            count--;

            if (count == 0) {
                System.out.println("Hakkınız kalmadı. Doğru sayı  " + rastgeleSayi);
            }
        }
    }
}

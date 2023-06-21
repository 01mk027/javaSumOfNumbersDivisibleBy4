import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Sayi giriniz: ");
            n = scanner.nextInt();
            if((n % 2 == 0) && (n % 4 == 0))
            {
                total += n;
            }
        } while(n % 2 != 1);

        System.out.println("Toplam = " + total);
    }
}

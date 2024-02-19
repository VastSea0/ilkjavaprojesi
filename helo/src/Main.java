import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sayi1, sayi2, sonuc;
        char islem;

        while (true) {
            System.out.print("İlk sayıyı giriniz: ");
            sayi1 = scanner.nextDouble();

            System.out.print("İkinci sayıyı giriniz: ");
            sayi2 = scanner.nextDouble();

            System.out.print("İşlem seçin (+, -, *, /, !, x): ");
            islem = scanner.next().charAt(0);

            switch (islem) {
                case '+':
                    sonuc = sayi1 + sayi2;
                    System.out.println("Sonuç: " + sonuc);
                    break;
                case '-':
                    sonuc = sayi1 - sayi2;
                    System.out.println("Sonuç: " + sonuc);
                    break;
                case '*':
                    sonuc = sayi1 * sayi2;
                    System.out.println("Sonuç: " + sonuc);
                    break;
                case '/':
                    if (sayi2 != 0) {
                        sonuc = sayi1 / sayi2;
                        System.out.println("Sonuç: " + sonuc);
                    } else {
                        System.out.println("Bir sayıyı sıfıra bölemezsiniz.");
                    }
                    break;
                case '!':
                    int faktoriyel = 1;
                    for (int i = 1; i <= sayi1; i++) {
                        faktoriyel *= i;
                    }
                    System.out.println(sayi1 + " faktöriyeli: " + faktoriyel);
                    for (int i = 1; i <= sayi2; i++) {
                        faktoriyel *= i;
                    }
                    System.out.println(sayi2 + " faktöriyeli: " + faktoriyel);
                    break;
                case 'x':
                    double karekok = Math.sqrt(sayi1);
                    System.out.println(sayi1 + " sayısının karekökü: " + karekok);

                    double karekok2 = Math.sqrt(sayi2);
                    System.out.println(sayi2 + " sayısının karekökü: " + karekok2);
                    break;


                default:
                    System.out.println("Geçersiz işlem!");
            }

            System.out.print("Devam etmek istiyor musunuz? (E/H): ");
            char devam = scanner.next().charAt(0);
            if (devam != 'E' && devam != 'e') {
                break;
            }
        }

        scanner.close();
    }
}

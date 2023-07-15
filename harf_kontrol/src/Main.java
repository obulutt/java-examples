import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir karakter giriniz: ");
        char harf = input.next().charAt(0);
        switch (harf){
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Girilen harf kalın seslidir.");
                break;
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Girilen harf ince seslidir.");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");

        }

    }
}
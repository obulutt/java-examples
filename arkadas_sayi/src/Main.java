import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Arkadaş sayı olup olmadığını kontol etmek istediğiniz sayıları giriniz:");
        System.out.println("İlk sayıyı giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int sayi2 = input.nextInt();

        int bolen1 = 0;
        int bolen2 = 0;
        for(int i =1 ; i<= sayi1/2;i++){
            if(sayi1%i==0){
                bolen1+=i;
            }
        }
        for(int i =1 ; i<= sayi2/2;i++){
            if(sayi2%i==0){
                bolen2+=i;
            }
        }
        if(bolen1==sayi2 && bolen2==sayi1){
            System.out.println("Girilen sayılar arkadaş sayıdır.");
        }
        else{
            System.out.println("Girilen sayılar arkadaş sayılar değildir.");
        }
    }
}
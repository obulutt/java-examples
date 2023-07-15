import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hangi sayının mükemmel sayı olup olmadığını kontrol etmek istersiniz? ");
        int sayi = input.nextInt();
        int kontrol = 0;
        for (int i = 1;i<=(sayi/2);i++){
            if(sayi%i==0){
                kontrol+=i;
            }
        }
        if(kontrol == sayi){
            System.out.println("Girilen sayı mükemmel sayıdır.");
        }
        else{
            System.out.println("Girilen sayı mükemmel sayı değildir.");
        }
    }
}
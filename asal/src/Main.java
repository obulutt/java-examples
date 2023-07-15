import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int asal;
        System.out.println("Hangi sayının asalıığını kontrol etmek istersiniz? ");
        asal = input.nextInt();
        int c = asal/2;

        if(c<= 0){
            System.out.println("Girilen sayı asal sayı değildir.");
        }
        else{
            int kontrol = 0;
            for(int i = 2;i<=c;i++){
                if(asal%i == 0){
                    kontrol++;
                }
            }
            if(kontrol != 0){
                System.out.println("Girilen sayı asal değildir.");
            }
            else{
                System.out.println("Girilen sayı asaldır.");
            }


        }
}
}
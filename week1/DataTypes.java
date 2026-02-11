package week1;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] kasusuji = new int[100];
        System.out.print("Masukkan Jumlah Kasus Uji: ");
        int jmluji = input.nextInt();
        
        for (int i = 0; i < jmluji; i++){
            System.out.print("Masukkan Kasus Uji: ");
            kasusuji[i] = input.nextInt();
        }

        System.out.println("\nHasil Kasus Uji:");
        for (int i = 0; i < jmluji;i++){
            if(kasusuji[i] == byte.min_VALUE || kasusuji[i] == byte.max_VALUE){
                System.out.println(kasusuji[i] + " dapat disimpan dalam: \n* byte");
            }
            else if(kasusuji[i] == short.min_VALUE || kasusuji[i] == short.max_VALUE){
                System.out.println(kasusuji[i] + " dapat disimpan dalam: \n* short");
            }
            else if(kasusuji[i] == int.min_VALUE || kasusuji[i] == int.max_VALUE){
                System.out.println(kasusuji[i] + " dapat disimpan dalam: \n* int");
            }
            else if(kasusuji[i] == long.min_VALUE || kasusuji[i] == long.max_VALUE){
                System.out.println(kasusuji[i] + " dapat disimpan dalam: \n* long");
            }
            else{
                System.out.println(kasusuji[i] + " tidak dapat disimpan dalam
        }

        


    }
}

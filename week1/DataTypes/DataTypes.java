package week1;
import java.util.Scanner;
import java.math.BigInteger;

public class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger[] kasusuji = new BigInteger[100];
        System.out.print("Masukkan Jumlah Kasus Uji: ");
        int jmluji = input.nextInt();
        
        for (int i = 0; i < jmluji; i++){
            System.out.print("Masukkan Kasus Uji: ");
            kasusuji[i] = input.nextBigInteger();
        }

        System.out.println("\nHasil Kasus Uji:");
        for (int i = 0; i < jmluji;i++){
            if (kasusuji[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && kasusuji[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0){
                System.out.println(kasusuji[i] + " can be fitted in:");
                if (kasusuji[i].compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 && kasusuji[i].compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0){
                    System.out.println("* byte");
                }
                if (kasusuji[i].compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && kasusuji[i].compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0){
                    System.out.println("* short");
                }
                if (kasusuji[i].compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && kasusuji[i].compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0){
                    System.out.println("* int");
                }
                System.out.println("* long");
            } else {
                System.out.println(kasusuji[i] + " can't be fitted anywhere.");
            }
    }
    input.close();
}    
}
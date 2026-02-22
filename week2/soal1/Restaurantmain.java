package soal1;

public class Restaurantmain {
    public static void main(String[] args) {
            Restaurant restaurant = new Restaurant();
           restaurant.tambahMenuMakanan("Mie Ayam", 10000, 20);
           Restaurant.nextId();
           restaurant.tambahMenuMakanan("Nasi Goreng", 15000, 15);
           Restaurant.nextId();
           restaurant.tambahMenuMakanan("Ramen", 20000, 10);
           Restaurant.nextId();
           restaurant.tampilMenuMakanan();
           System.out.println();
           restaurant.pesanMakanan(0, 5);
           restaurant.pesanMakanan(1, 11);
           restaurant.pesanMakanan(2, 7);
           System.out.println();
           restaurant.tampilMenuMakanan();
           System.out.println();
           System.out.println("cek jika pesanan melebihi stok");
           restaurant.pesanMakanan(0, 30);
           restaurant.pesanMakanan(1, 56);
           restaurant.pesanMakanan(2, 30);
        }
    }
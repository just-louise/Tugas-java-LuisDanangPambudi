package soal1;

public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant(
        
    ) {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void setNama_Makanan(String[] nama_makanan){
        this.nama_makanan = nama_makanan;
    }
    public void setHarga_makanan(double[] harga_makanan){
        for (double harga : harga_makanan) {
            if (harga < 0) {
                System.out.println("harga tidak valid!");
            }
        }
        this.harga_makanan = harga_makanan;
    }
    public void setStok(int[] stok){
        for (int stokbarang : stok) {
            if (stokbarang < 0) {
                System.out.println("stok tidak valid! stok tidak boleh minus");
            }
        }
        this.stok = stok;
    }
    public void setId(byte id){
        id = 0;
    }
    public String[] getNama_Makanan(){
        return nama_makanan;
    }
    public double[] getHarga_Makanan(){
        return harga_makanan;
    }
    public int[] getStok(){
        return stok;
    }

public void tambahMenuMakanan(String nama, double harga, int stok) {
    this.nama_makanan[id] = nama;
    this.harga_makanan[id] = harga;
    this.stok[id] = stok;
}

public void tampilMenuMakanan() {
    for (int i = 0; i < id; i++) {
        if (!isOutOfStock(i)) {
            System.out.println(
                nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]
            );
        }
    }
}

public boolean isOutOfStock(int id) {
    if (stok[id] == 0) {
        return true;
    } else {
        return false;
    }
}

public static void nextId() {
    id++;
}
public void pesanMakanan(int id, int jumlah){
    if (id >= 0 ){
        if (stok[id] >= jumlah) {
            stok[id] -= jumlah;
            System.out.println("Pesanan " + nama_makanan[id] + " Berhasil " + "Jumlah Pesanan: " + jumlah);
        }
        else{
            System.out.println("Pesanan melebihi stok! stok: " + stok[id] + " Jumlah Pesanan: " + jumlah);
        }
    }
    else{
        System.out.println("Pesanan Tidak Valid! Pesanan tidak ada di menu");
    }
}
}

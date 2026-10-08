import java.util.Scanner;

public class StudyKasus1_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = 27;
        int hargaperCup = 18000;
        int jumlahcup,uangBayar;
        int totalHarga;
        int totalBayar;
        int diskon = 10;
        int kembalian,kurang;
        System.out.println("Masukkan jumlah cup: ");
        jumlahcup = input.nextInt();
        System.out.println("Masukkan jumlah uang anda: ");
        uangBayar = input.nextInt();
        totalHarga = jumlahcup * hargaperCup;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
            totalBayar = totalHarga - diskon;
        } else {
           totalBayar = totalHarga - diskon; 
        }
        System.out.println("total harga anda adalah: " + totalHarga);
        System.out.println("total diskon anda adalah: " + diskon);
        System.out.println("total bayar anda adalah: " + totalBayar);
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian anda adalah: " + kembalian);
            
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang anda kurang Rp " + kurang);
            
        }
    }
}

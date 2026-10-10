
import java.util.Scanner;
/**
 * Studycase2_27
 */
public class Studycase2_27 {

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumenyangdiupload;
        int peringkatJuara;
        int statusPendanaan; 
        System.out.println("Masukkan nama anda: ");
        namaMahasiswa = input.nextLine();
        System.out.println("Masukkan jenis kegiatan anda: ");
        jenisKegiatan = input.nextLine();
        System.out.println("Masukkan jumlah dokumen yang anda upload: ");
        jumlahDokumenyangdiupload = input.nextInt();
        if (jumlahDokumenyangdiupload == 4) {
            if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                    System.out.println("Status pendanaan PKM (0/1): ");
                    statusPendanaan = input.nextInt();
                    if (jumlahDokumenyangdiupload==4 && statusPendanaan == 1) {
                    System.out.println("Status lolos dana penghargaan");

            else if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA" )|| jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.println("Masukkan peringkat anda: ");
            peringkatJuara = input.nextInt();
                if (jumlahDokumenyangdiupload == 4 && peringkatJuara > 0 && peringkatJuara <4) {
                System.out.println("Status terpenuhi dana penghargaan diberikan");
                
            }
            else if (jumlahDokumenyangdiupload>=0 && jumlahDokumenyangdiupload <4) {
                System.out.println("Status dokumen tidak lengkap, kurang" + (4 - jumlahDokumenyangdiupload) + "dokumen,dana penghargaan tidak diberikan");
                
            }
            else if (peringkatJuara <=0 || peringkatJuara > 3) {
                System.out.println("Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3)");
                
            }
            else {
                    
                }
                else if (jumlahDokumenyangdiupload >=0 && jumlahDokumenyangdiupload <4 && statusPendanaan==0) {
                    System.out.println("Status tidak lolos dana penghargaan");
                    
                 
                
                    
                }
        else {
            System.out.println("Tidak ada penghargaan");

        } 
            }
    }

                
    }

            
        }
            
        
    }
}


package factory.pattern;
import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        SekolahFactory sekolahFactory = new SekolahFactory();
            for(String b = "y"; b.equals("y") || b.equals("Y");){
                System.out.println("===============================");
                System.out.println("###DATA SISWA TK GEMBIRA RIA###");
                System.out.println("===============================");
                System.out.println("1. Nama Siswa");
                System.out.println("2. Alamat");
                System.out.println("3. No. Telpon");
                System.out.println("4. Tampilkan Semua");
                System.out.println("===============================");
                Scanner scan = new Scanner(System.in);
                System.out.print("Masukkan Angka: ");
                int userName = scan.nextInt();
                System.out.println("===============================");
                Sekolah sekolah1 = sekolahFactory.getSekolah("SISWA");
                Sekolah sekolah2 = sekolahFactory.getSekolah("ALAMAT");
                Sekolah sekolah3 = sekolahFactory.getSekolah("TELPON");

                switch (userName){
                    case 1:
                        System.out.println("============SISWA============");
                        sekolah1.sekolah();
                        break;
                        
                    case 2:
                        System.out.println("============ALAMAT============");
                        sekolah2.sekolah();
                        break;

                    case 3:
                        System.out.println("============TELPON============");
                        sekolah3.sekolah();
                        break;
                        
                    case 4:
                        System.out.println("============SISWA============");
                        sekolah1.sekolah();
                        System.out.println("============ALAMAT============");
                        sekolah2.sekolah();
                        System.out.println("============TELPON============");
                        sekolah3.sekolah();
                        break;
                        
                    default:
                        System.out.println("MENU TIDAK TERSEDIA!");
                        break;
                }
                System.out.print("Mengulang? (Y/N): ");
                b = scan.next();
            }
     }
}

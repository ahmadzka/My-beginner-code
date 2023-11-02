package konversi_bilangan;
import java.util.Scanner;

public class konverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Pilih operasi konversi:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Hexa");
            System.out.println("4. Hexa ke Biner");
            System.out.println("5. Desimal ke Hexa");
            System.out.println("6. Hexa ke Desimal");
            System.out.println("9. Exit");
            System.out.print("Masukkan pilihan Anda: ");
            
            int pilihan = in.nextInt();
            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan bilangan biner: ");
                    String biner = in.next();
                    int panjang = biner.length();
                    int total = 0;
                    int urutan;
                    for (int i = panjang - 1; i >= 0; i--) {
                        char angka = biner.charAt(i);
                        if (angka == '1') {
                            urutan = (int) Math.pow(2, panjang - i - 1);
                            total += urutan;
                        }
                    }
                    System.out.println("Hasil konversi: " + total);
                }
                case 2 -> {
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimal = in.nextInt();
                    String biner = "";
                    while (desimal > 0) {
                        int sisa = desimal % 2;
                        biner = sisa + biner;
                        desimal = desimal / 2;
                    }
                    System.out.println("Hasil konversi: " + biner);
                }
                case 3 -> {
                    System.out.print("Masukkan bilangan biner: ");
                    String biner = in.next();
                    int panjang = biner.length();
                    int total = 0;
                    int urutan;
                    for (int i = panjang - 1; i >= 0; i--) {
                        char angka = biner.charAt(i);
                        if (angka == '1') {
                            urutan = (int) Math.pow(2, panjang - i - 1);
                            total += urutan;
                        }
                    }
                    int desimal = total;
                    String heksa = "";
                    while (desimal > 0) {
                        int sisa = desimal % 16;
                        char hexhuruf = (sisa < 10) ? (char) (sisa + '0') : (char) ('A' + sisa - 10);
                        heksa = hexhuruf + heksa;
                        desimal = desimal / 16;
                    }
                    System.out.println("Hasil konversi: " + heksa);
                }
                case 4 -> {
                    System.out.print("Masukkan bilangan Heksadesimal: ");
                    String heksa = in.next();
                    int panjang = heksa.length();
                    int total = 0;
                    for (int i = panjang - 1; i >= 0; i--) {
                        char angka = heksa.charAt(i);
                        int digit;
                        if (Character.isDigit(angka)) {
                            digit = angka - '0';
                        } else {
                            digit = angka - 'A' + 10;
                        }
                        int urutan = (int) Math.pow(16, panjang - i - 1);
                        total += digit * urutan;
                    }
                    int desimal = total;
                    String biner = "";
                    while (desimal > 0) {
                        int sisa = desimal % 2;
                        biner = sisa + biner;
                        desimal = desimal / 2;
                    }
                    System.out.println("Hasil konversi: " + biner);
                }
                case 5 -> {
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimal = in.nextInt();
                    String heksa = "";
                    while (desimal > 0) {
                        int sisa = desimal % 16;
                        char hexhuruf = (sisa < 10) ? (char) (sisa + '0') : (char) ('A' + sisa - 10);
                        heksa = hexhuruf + heksa;
                        desimal = desimal / 16;
                    }
                    System.out.println("Hasil konversi: " + heksa);
                }
                case 6 -> {
                    System.out.print("Masukkan bilangan Heksadesimal: ");
                    String heksa = in.next();
                    int panjang = heksa.length();
                    int total = 0;
                    for (int i = panjang - 1; i >= 0; i--) {
                        char angka = heksa.charAt(i);
                        int digit;
                        if (Character.isDigit(angka)) {
                            digit = angka - '0';
                        } else {
                            digit = angka - 'A' + 10;
                        }
                        int urutan = (int) Math.pow(16, panjang - i - 1);
                        total += digit * urutan;
                    }
                    System.out.println("Hasil konversi: " + total);
                }
                case 9 ->{
                    return;
                }
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}

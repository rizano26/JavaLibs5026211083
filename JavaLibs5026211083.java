import java.util.Scanner;

public class JavaLibs5026211083 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama, namaPanggilan, asalProvinsi, asalKota, asalInstansi;
        int umur, berat;
        double tinggi, beratBadanIdeal, goalBerat;

        System.out.println("Asisten Ahli Gizi Virtual");

        System.out.print("Namamu : ");
        nama = input.nextLine();

        System.out.print("Nama Panggilan : ");
        namaPanggilan = input.nextLine();

        System.out.print("Asal Provinsi : ");
        asalProvinsi = input.nextLine();

        System.out.print("Asal Kota : ");
        asalKota = input.nextLine();

        System.out.print("Asal Instansi : ");
        asalInstansi = input.nextLine();

        System.out.print("Umurmu : ");
        umur = input.nextInt();

        System.out.print("Berapa beratmu : ");
        berat = input.nextInt();

        System.out.print("Berapa tinggimu dalam centimeter : ");
        tinggi = input.nextDouble();

        beratBadanIdeal = (tinggi - 100) * 0.9;
        goalBerat = berat - beratBadanIdeal;

        System.out.println("Hai "+ nama + ". Kupanggil " + namaPanggilan + " aja ya biar lebih akrab hihihi. Menurut data yang kamu isi, kamu berumur " + umur + " dan berasal dari " + asalInstansi + " dan tinggal di " + asalKota + " di " + asalProvinsi + "." );
        System.out.println("Berdasarkan data TB dan BB mu, berat badan idealmu adalah " + beratBadanIdeal + ". selisih berat badanmu sekarang dan berat badan idealmu adalah "+ goalBerat + ". Jika nilainya positif, maka kamu harus mengurangi beratmu sebanyak itu. Jika nilainya negatif, maka kamu harus menambah beratmu sebanyak itu");

    }
}

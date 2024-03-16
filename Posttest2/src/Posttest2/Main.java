package Posttest2;
import java.io.*;
import java.util.*;

public class Main {
    private int batasan;
    private static InputStreamReader p = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(p);
    private static ArrayList<akun> DataAkun = new ArrayList<>();
    private static ArrayList<dataNike> Nike = new ArrayList<>();
    private static ArrayList<dataNB> NewBalance = new ArrayList<>();
    private static ArrayList<dataAdidas> Adidas = new ArrayList<>();
    // private static Console cnsl = System.console();
    private static void sleep(int sec){
        try{
            Thread.currentThread().sleep(sec*1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static boolean ulang(String tanya){
        Scanner pilihan = new Scanner(System.in);
        System.out.print("\n"+tanya+"(y/n) -> ");
        String pilUser = pilihan.next();

        while(!pilUser.equalsIgnoreCase("y") && !pilUser.equalsIgnoreCase("n")){
            System.err.println("|================================|");
            System.err.println("|      Pilihan Hanya Y & N       |");
            System.err.println("|================================|");
            System.out.print("\n"+tanya+"(y/n) -> " );
            pilUser = pilihan.next();
        }
        return pilUser.equalsIgnoreCase("y");
    }

    private static void exit(){
        System.out.println("|=============================================|");
        System.out.println("|     Terima Kasih Sudah Menggunakan Saya     |");
        System.out.println("|=============================================|");
    }

    public static void main(String[] args) throws NumberFormatException, IOException{
        Nike.add(new dataNike("Air Force 1 PLT", "Snekears", "36-45", "Blue Shark", 50,2018, "Brand New", "600k - 1.2j"));
        NewBalance.add(new dataNB("NB 550 Men", "Snekers", "38-43", "White Choco", 100,2020, "Second", "500k - 900k"));
        Adidas.add(new dataAdidas("Run 70S Shoes", "Sport", "36-47", "Blue Purple", 50,2019, "Brand New", "800k - 1.1j"));
        menu_login();
    }

    private static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static int error_int() throws IOException{
        int Masuk_integer = 0;
        while(true){
            try{
                Masuk_integer = Integer.parseInt(input.readLine());
                break;
            } catch (NumberFormatException e){
                System.err.print("\tHarus Angka!");
            }
        }
        return Masuk_integer;
    }

    private static void Login() throws NumberFormatException, IOException{
        clear();
        System.out.println("|===================================|");
        System.out.println("|               Login               |");
        System.out.println("|===================================|");
        System.out.print("Masukkan Username -> ");
        String IdL = input.readLine();
        System.out.print("Masukkan Password -> ");
        String passL = input.readLine();
        for(akun Akun : DataAkun){
            if(Akun.getuser().equals(IdL)){
                if(Akun.getpass().equals(passL)){
                    clear();
                    System.out.println("|==========================|");
                    System.out.println("|        Login Success     |");
                    System.out.println("|==========================|");
                    sleep(1);
                    menu_utama();
                    break;
                }
            }
            else
            {
                clear();
                System.out.println("|====================================|");
                System.out.println("|   Username / Password Anda Salah   |");
                System.out.println("|          Ingat-ingat Dulu          |");
                System.out.println("|====================================|");
            }
        }
    }

    private static void Register() throws IOException{
        clear();
        System.out.println("|=================================|");
        System.out.println("|              Register           |");
        System.out.println("|=================================|");
        System.out.print("Masukkan Username Anda -> ");
        String Id = input.readLine();
        System.out.print("Masukkan Password Anda -> ");
        String pass = input.readLine();
        akun akun_baru = new akun(Id, pass);
        DataAkun.add(akun_baru);
        System.out.println("|====================================|");
        System.out.println("|      Akun Anda Berhasil Dibuat     |");
        System.out.println("|====================================|");
        System.out.println("");
        System.out.println("Tekan Enter untuk melanjutkan ke halaman login ...");input.readLine();
        Login();
    }


    // Fungsi Tambah Data
    private static void nambah_dataN() throws NumberFormatException, IOException{
        System.out.println("|======================================================|");
        System.out.println("|                  Nambah Data NIKE                    |");
        System.out.println("|======================================================|");
        System.out.print("| Mau Memasukkan Berapa Data -> ");
        int batasan = Integer.parseInt(input.readLine());
        clear();
        for(int i = 1; i <= batasan; i++){
            System.out.println("|=============================|");
            System.out.println("| Data Ke-> "+i);
            System.out.print("Masukkan Nama Sepatu -> ");
            String namaNike = input.readLine();
            System.out.print("Masukkan Jenis Sepatu -> ");
            String jenis_sepatuN = input.readLine();
            System.out.print("Masukkan Ukuran Sepatu -> ");
            String ukuranN = input.readLine();
            System.out.print("Masukkan Warna Sepatu -> ");
            String WarnaN = input.readLine();
            System.out.print("Masukkan Stock -> ");
            int stockN = error_int();
            System.out.print("Masukkan Tahun Rilis -> ");
            int tahun_rilisN = error_int();
            System.out.print("Kondisi Sepatu [Brand New/Second] -> ");
            String KondisiN = input.readLine();
            System.out.print("Kisaran Harga Sepatu -> ");
            String HargaN = input.readLine();
            dataNike data_baru = new dataNike(namaNike, jenis_sepatuN, ukuranN, WarnaN, stockN, tahun_rilisN, KondisiN, HargaN);
            Nike.add(data_baru);
        }
        System.out.println("|=======================================|");
        System.out.println("|     Data Anda Berhasil Ditambahkan    |");
        System.out.println("|=======================================|");
    }

    private static void nambah_dataNB() throws NumberFormatException, IOException{
        System.out.println("|======================================================|");
        System.out.println("|                  Nambah Data NB                      |");
        System.out.println("|======================================================|");
        System.out.print("| Mau Memasukkan Berapa Data -> ");
        int batasan = Integer.parseInt(input.readLine());
        clear();
        for(int i = 1; i <= batasan; i++){
            System.out.println("|=============================|");
            System.out.println("| Data Ke-> "+i);
            System.out.print("Masukkan Nama Sepatu -> ");
            String namaNB = input.readLine();
            System.out.print("Masukkan Jenis Sepatu -> ");
            String jenis_sepatuNB = input.readLine();
            System.out.print("Masukkan Ukuran Sepatu -> ");
            String ukuranNB = input.readLine();
            System.out.print("Masukkan Warna Sepatu -> ");
            String WarnaNB = input.readLine();
            System.out.print("Masukkan Stock -> ");
            int stockNB = error_int();
            System.out.print("Masukkan Tahun Rilis -> ");
            int tahun_rilisNB = error_int();
            System.out.print("Kondisi Sepatu [Brand New/Second] -> ");
            String KondisiNB = input.readLine();
            System.out.print("Kisaran Harga Sepatu -> ");
            String HargaNB = input.readLine();
            dataNB data_baru = new dataNB(namaNB, jenis_sepatuNB, ukuranNB, WarnaNB, stockNB, tahun_rilisNB, KondisiNB, HargaNB);
            NewBalance.add(data_baru);
        }
        System.out.println("|=======================================|");
        System.out.println("|     Data Anda Berhasil Ditambahkan    |");
        System.out.println("|=======================================|");
    }

    private static void nambah_dataA() throws NumberFormatException, IOException{
        System.out.println("|======================================================|");
        System.out.println("|                  Nambah Data Adidas                  |");
        System.out.println("|======================================================|");
        System.out.print("| Mau Memasukkan Berapa Data -> ");
        int batasan = Integer.parseInt(input.readLine());
        clear();
        for(int i = 1; i <= batasan; i++){
            System.out.println("|=============================|");
            System.out.println("| Data Ke-> "+i);
            System.out.print("Masukkan Nama Sepatu -> ");
            String namaAdidas = input.readLine();
            System.out.print("Masukkan Jenis Sepatu -> ");
            String jenis_sepatuA = input.readLine();
            System.out.print("Masukkan Ukuran Sepatu -> ");
            String ukuranA = input.readLine();
            System.out.print("Masukkan Warna Sepatu -> ");
            String WarnaA = input.readLine();
            System.out.print("Masukkan Stock -> ");
            int stockA = error_int();
            System.out.print("Masukkan Tahun Rilis -> ");
            int tahun_rilisA = error_int();
            System.out.print("Kondisi Sepatu [Brand New/Second] -> ");
            String KondisiA = input.readLine();
            System.out.print("Kisaran Harga Sepatu -> ");
            String HargaA = input.readLine();
            dataAdidas data_baru = new dataAdidas(namaAdidas, jenis_sepatuA, ukuranA, WarnaA, stockA, tahun_rilisA, KondisiA, HargaA);
            Adidas.add(data_baru);
        }
        System.out.println("|=======================================|");
        System.out.println("|     Data Anda Berhasil Ditambahkan    |");
        System.out.println("|=======================================|");
    }


    // Fungsi Read
    private static void read_dataN(){
        System.out.println("|===================================================================================================================================|");
        System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
        System.out.println("|===================================================================================================================================|");
        for(int i = 0; i<Nike.size(); i++){
            System.out.printf("| %2d ", (i+1));
            System.out.printf("|\t%-20s  ", Nike.get(i).getNamaN());
            System.out.printf("|\t%-20s  ", Nike.get(i).getjenis_sepatuN());
            System.out.printf("|\t%-20s  ", Nike.get(i).getUkuranN());
            System.out.printf("|\t%-20s  ", Nike.get(i).getWarnaN());
            System.out.printf("|\t%-20s  ", Nike.get(i).getstockN());
            System.out.printf("|\t%-20s  ", Nike.get(i).getrilisN());
            System.out.printf("|\t%-20s  ", Nike.get(i).getKondisiN());
            System.out.printf("|\t%-20s  ", Nike.get(i).getHargaN());
            System.out.println("\n");
        }
    }

    private static void read_dataNB(){
        System.out.println("|===================================================================================================================================|");
        System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
        System.out.println("|===================================================================================================================================|");
        for(int i = 0; i<NewBalance.size(); i++){
            System.out.printf("| %2d ", (i+1));
            System.out.printf("|\t%-20s  ", NewBalance.get(i).getNamaNB());
            System.out.printf("|\t%-20s  ", NewBalance.get(i).getjenis_sepatuNB());
            System.out.printf("|\t%-20s  ", NewBalance.get(i).getUkuranNB());
            System.out.printf("|\t%-20s  ", NewBalance.get(i).getWarnaNB());
            System.out.printf("|\t%-20s  ", NewBalance.get(i).getstockNB());
            System.out.printf("|\t%-20s  ", NewBalance.get(i).getrilisNB());
            System.out.printf("|\t%-20s  ", NewBalance.get(i).getKondisiNB());
            System.out.printf("|\t%-20s  ", NewBalance.get(i).getHargaNB());
            System.out.println("\n");
        }
    }

    private static void read_dataA(){
        System.out.println("|===================================================================================================================================|");
        System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
        System.out.println("|===================================================================================================================================|");
        for(int i = 0; i<Adidas.size(); i++){
            System.out.printf("| %2d ", (i+1));
            System.out.printf("|\t%-20s  ", Adidas.get(i).getNamaA());
            System.out.printf("|\t%-20s  ", Adidas.get(i).getjenis_sepatuA());
            System.out.printf("|\t%-20s  ", Adidas.get(i).getUkuranA());
            System.out.printf("|\t%-20s  ", Adidas.get(i).getWarnaA());
            System.out.printf("|\t%-20s  ", Adidas.get(i).getstockA());
            System.out.printf("|\t%-20s  ", Adidas.get(i).getrilisA());
            System.out.printf("|\t%-20s  ", Adidas.get(i).getKondisiA());
            System.out.printf("|\t%-20s  ", Adidas.get(i).getHargaA());
            System.out.println("\n");
        }
    }

    // Fungsi Update
    private static void update_dataN()throws NumberFormatException, IOException{
        System.out.println("|==============================|");
        System.out.println("|        Update Data NIKE      |");
        System.out.println("|==============================|");
        System.out.println("");
        System.out.print("Masukkan nama sepatu yang mau diubah -> ");
        String nsN = input.readLine();
        System.out.println("|=====================================================================================================================================|");
        System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
        System.out.println("|=====================================================================================================================================|");
        for(dataNike nike : Nike){
            if(nike.getNamaN().equals(nsN)){
                System.out.printf("|\t%-20s  ", nike.getNamaN());
                System.out.printf("|\t%-20s  ", nike.getjenis_sepatuN());
                System.out.printf("|\t%-20s  ", nike.getUkuranN());
                System.out.printf("|\t%-20s  ", nike.getWarnaN());
                System.out.printf("|\t%-20s  ", nike.getstockN());
                System.out.printf("|\t%-20s  ", nike.getrilisN());
                System.out.printf("|\t%-20s  ", nike.getKondisiN());
                System.out.printf("|\t%-20s  ", nike.getHargaN());
                System.out.println("\n");
                boolean lanjut = true;
                while(lanjut){
                    System.out.println("");
                    System.out.println("|==================================|");
                    System.out.println("| 1. Ubah Nama Sepatu              |");
                    System.out.println("| 2. Ubah Jenis Sepatu             |");
                    System.out.println("| 3. Ubah Ukuran Sepatu            |");
                    System.out.println("| 4. Ubah Warna Sepatu             |");
                    System.out.println("| 5. Ubah Stock Sepatu             |");
                    System.out.println("| 6. Ubah Tahun Rilis              |");
                    System.out.println("| 7. Ubah Kondisi Sepatu           |");
                    System.out.println("| 8. Ubah Harga Pasaran            |");
                    System.out.println("|==================================|");
                    System.out.print("Masukkan Pilihan Anda -> ");
                    int pilihan = Integer.parseInt(input.readLine());
                    switch(pilihan){
                        case 1:
                            System.out.print("Masukkan Nama Sepatu Baru -> ");
                            nike.setNamaN(input.readLine());
                        break;
                        case 2:
                            System.out.print("Masukkan Jenis Sepatu Baru -> ");
                            nike.setJenisN(input.readLine());
                        break;
                        case 3:
                            System.out.print("Masukkan Ukuran Seaptu Baru -> ");
                            nike.setUkuranN(input.readLine());
                        break;
                        case 4:
                            System.out.print("Masukkan Warna Sepatu Baru -> ");
                            nike.setWarnaN(input.readLine());
                        break;
                        case 5:
                            System.out.print("Masukkan Stock Sepatu Baru -> ");
                            nike.setstockN(error_int());
                        break;
                        case 6:
                            System.out.print("Masukkan Tahun Rilis Sepatu Baru -> ");
                            nike.setRilisN(error_int());
                        break;
                        case 7:
                            System.out.print("Masukkan Kondisi Sepatu Baru -> ");
                            nike.setKondisiN(input.readLine());
                        break;
                        case 8:
                            System.out.print("Masukkan Harga Pasaran Sepatu Baru -> ");
                            nike.setHargaN(input.readLine());
                        break;
                        default:
                            System.err.println("|=====================================|");
                            System.err.println("|   Tolong Pilih Sesuai Yang Disuruh  |");
                            System.err.println("|=====================================|");
                        break;
                    }
                    lanjut = ulang("Masih Ingin Mengupdate data?");

                }
            }
        }
    }

    private static void update_dataNB()throws NumberFormatException, IOException{
        System.out.println("|==============================|");
        System.out.println("|        Update Data NB        |");
        System.out.println("|==============================|");
        System.out.println("");
        System.out.print("Masukkan nama sepatu yang mau diubah -> ");
        String nsNB = input.readLine();
        System.out.println("|=====================================================================================================================================|");
        System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
        System.out.println("|=====================================================================================================================================|");
        for(dataNB nb : NewBalance){
            if(nb.getNamaNB().equals(nsNB)){
                System.out.printf("|\t%-20s  ", nb.getNamaNB());
                System.out.printf("|\t%-20s  ", nb.getjenis_sepatuNB());
                System.out.printf("|\t%-20s  ", nb.getUkuranNB());
                System.out.printf("|\t%-20s  ", nb.getWarnaNB());
                System.out.printf("|\t%-20s  ", nb.getstockNB());
                System.out.printf("|\t%-20s  ", nb.getrilisNB());
                System.out.printf("|\t%-20s  ", nb.getKondisiNB());
                System.out.printf("|\t%-20s  ", nb.getHargaNB());
                System.out.println("\n");
                boolean lanjut = true;
                while(lanjut){
                    System.out.println("");
                    System.out.println("|==================================|");
                    System.out.println("| 1. Ubah Nama Sepatu              |");
                    System.out.println("| 2. Ubah Jenis Sepatu             |");
                    System.out.println("| 3. Ubah Ukuran Sepatu            |");
                    System.out.println("| 4. Ubah Warna Sepatu             |");
                    System.out.println("| 5. Ubah Stock Sepatu             |");
                    System.out.println("| 6. Ubah Tahun Rilis              |");
                    System.out.println("| 7. Ubah Kondisi Sepatu           |");
                    System.out.println("| 8. Ubah Harga Pasaran            |");
                    System.out.println("|==================================|");
                    System.out.print("Masukkan Pilihan Anda -> ");
                    int pilihan = Integer.parseInt(input.readLine());
                    switch(pilihan){
                        case 1:
                            System.out.print("Masukkan Nama Sepatu Baru -> ");
                            nb.setNamaNB(input.readLine());
                        break;
                        case 2:
                            System.out.print("Masukkan Jenis Sepatu Baru -> ");
                            nb.setJenisNB(input.readLine());
                        break;
                        case 3:
                            System.out.print("Masukkan Ukuran Seaptu Baru -> ");
                            nb.setUkuranNB(input.readLine());
                        break;
                        case 4:
                            System.out.print("Masukkan Warna Sepatu Baru -> ");
                            nb.setWarnaNB(input.readLine());
                        break;
                        case 5:
                            System.out.print("Masukkan Stock Sepatu Baru -> ");
                            nb.setstockNB(error_int());
                        break;
                        case 6:
                            System.out.print("Masukkan Tahun Rilis Sepatu Baru -> ");
                            nb.setRilisNB(error_int());
                        break;
                        case 7:
                            System.out.print("Masukkan Kondisi Sepatu Baru -> ");
                            nb.setKondisiNB(input.readLine());
                        break;
                        case 8:
                            System.out.print("Masukkan Harga Pasaran Sepatu Baru -> ");
                            nb.setHargaNB(input.readLine());
                        break;
                        default:
                            System.err.println("|=====================================|");
                            System.err.println("|   Tolong Pilih Sesuai Yang Disuruh  |");
                            System.err.println("|=====================================|");
                        break;
                    }
                    lanjut = ulang("Masih Ingin Mengupdate data?");

                }
            }
        }
    }

    private static void update_dataA()throws NumberFormatException, IOException{
        System.out.println("|==============================|");
        System.out.println("|      Update Data ADIDAS      |");
        System.out.println("|==============================|");
        System.out.println("");
        System.out.print("Masukkan nama sepatu yang mau diubah -> ");
        String nsA = input.readLine();
        System.out.println("|=====================================================================================================================================|");
        System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
        System.out.println("|=====================================================================================================================================|");
        for(dataAdidas adidas : Adidas){
            if(adidas.getNamaA().equals(nsA)){
                System.out.printf("|\t%-20s  ", adidas.getNamaA());
                System.out.printf("|\t%-20s  ", adidas.getjenis_sepatuA());
                System.out.printf("|\t%-20s  ", adidas.getUkuranA());
                System.out.printf("|\t%-20s  ", adidas.getWarnaA());
                System.out.printf("|\t%-20s  ", adidas.getstockA());
                System.out.printf("|\t%-20s  ", adidas.getrilisA());
                System.out.printf("|\t%-20s  ", adidas.getKondisiA());
                System.out.printf("|\t%-20s  ", adidas.getHargaA());
                System.out.println("\n");
                boolean lanjut = true;
                while(lanjut){
                    System.out.println("");
                    System.out.println("|==================================|");
                    System.out.println("| 1. Ubah Nama Sepatu              |");
                    System.out.println("| 2. Ubah Jenis Sepatu             |");
                    System.out.println("| 3. Ubah Ukuran Sepatu            |");
                    System.out.println("| 4. Ubah Warna Sepatu             |");
                    System.out.println("| 5. Ubah Stock Sepatu             |");
                    System.out.println("| 6. Ubah Tahun Rilis              |");
                    System.out.println("| 7. Ubah Kondisi Sepatu           |");
                    System.out.println("| 8. Ubah Harga Pasaran            |");
                    System.out.println("|==================================|");
                    System.out.print("Masukkan Pilihan Anda -> ");
                    int pilihan = Integer.parseInt(input.readLine());
                    switch(pilihan){
                        case 1:
                            System.out.print("Masukkan Nama Sepatu Baru -> ");
                            adidas.setNamaA(input.readLine());
                        break;
                        case 2:
                            System.out.print("Masukkan Jenis Sepatu Baru -> ");
                            adidas.setJenisA(input.readLine());
                        break;
                        case 3:
                            System.out.print("Masukkan Ukuran Seaptu Baru -> ");
                            adidas.setUkuranA(input.readLine());
                        break;
                        case 4:
                            System.out.print("Masukkan Warna Sepatu Baru -> ");
                            adidas.setWarnaA(input.readLine());
                        break;
                        case 5:
                            System.out.print("Masukkan Stock Sepatu Baru -> ");
                            adidas.setstockA(error_int());
                        break;
                        case 6:
                            System.out.print("Masukkan Tahun Rilis Sepatu Baru -> ");
                            adidas.setRilisA(error_int());
                        break;
                        case 7:
                            System.out.println("Masukkan Kondisi Sepatu Baru -> ");
                            adidas.setKondisiA(input.readLine());
                        break;
                        case 8:
                            System.out.print("Masukkan Harga Pasaran Sepatu Baru -> ");
                            adidas.setHargaA(input.readLine());
                        break;
                        default:
                            System.err.println("|=====================================|");
                            System.err.println("|   Tolong Pilih Sesuai Yang Disuruh  |");
                            System.err.println("|=====================================|");
                        break;
                    }
                    lanjut = ulang("Masih Ingin Mengupdate data?");

                }
            }
        }
    }

    // Fungsi Delete
    private static void delete_dataN() throws NumberFormatException, IOException{
        System.out.println("|==============================|");
        System.out.println("|        Delete Data NIKE      |");
        System.out.println("|==============================|");
        System.out.println("");
        System.out.print("Masukkan nama sepatu yang mau dihapus -> ");
        String nsN = input.readLine();
        System.out.println("|=====================================================================================================================================|");
        System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
        System.out.println("|=====================================================================================================================================|");
        for(dataNike nike : Nike){
            if(nike.getNamaN().equals(nsN)){
                System.out.printf("|\t%-20s  ", nike.getNamaN());
                System.out.printf("|\t%-20s  ", nike.getjenis_sepatuN());
                System.out.printf("|\t%-20s  ", nike.getUkuranN());
                System.out.printf("|\t%-20s  ", nike.getWarnaN());
                System.out.printf("|\t%-20s  ", nike.getstockN());
                System.out.printf("|\t%-20s  ", nike.getrilisN());
                System.out.printf("|\t%-20s  ", nike.getKondisiN());
                System.out.printf("|\t%-20s  ", nike.getHargaN());
                System.out.println("\n");
                System.out.print("Yakin Untuk Menghapus Data Ini?? [y/n] -> ");
                String yakin = input.readLine();
                if (yakin.equalsIgnoreCase("y")){
                    Nike.remove(nike);
                    System.out.println("|==================================|");
                    System.out.println("|     Data Telah Musnah HEHE -_-   |");
                    System.out.println("|==================================|");
                }
                else if(yakin.equalsIgnoreCase("n")){
                    System.out.println("|==================================|");
                    System.out.println("|       Tapi Boong HEHEHEHEH       |");
                    System.out.println("|==================================|");
                }
                break;
            }
        }
    }

    private static void delete_dataNB() throws NumberFormatException, IOException{
        System.out.println("|==============================|");
        System.out.println("|        Delete Data NB        |");
        System.out.println("|==============================|");
        System.out.println("");
        System.out.print("Masukkan nama sepatu yang mau dihapus -> ");
        String nsNB = input.readLine();
        System.out.println("|=====================================================================================================================================|");
        System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
        System.out.println("|=====================================================================================================================================|");
        for(dataNB nb : NewBalance){
            if(nb.getNamaNB().equals(nsNB)){
                System.out.printf("|\t%-20s  ", nb.getNamaNB());
                System.out.printf("|\t%-20s  ", nb.getjenis_sepatuNB());
                System.out.printf("|\t%-20s  ", nb.getUkuranNB());
                System.out.printf("|\t%-20s  ", nb.getWarnaNB());
                System.out.printf("|\t%-20s  ", nb.getstockNB());
                System.out.printf("|\t%-20s  ", nb.getrilisNB());
                System.out.printf("|\t%-20s  ", nb.getKondisiNB());
                System.out.printf("|\t%-20s  ", nb.getHargaNB());
                System.out.println("\n");
                System.out.print("Yakin Untuk Menghapus Data Ini?? [y/n] -> ");
                String yakin = input.readLine();
                if (yakin.equalsIgnoreCase("y")){
                    NewBalance.remove(nb);
                    System.out.println("|==================================|");
                    System.out.println("|     Data Telah Musnah HEHE -_-   |");
                    System.out.println("|==================================|");
                }
                else if(yakin.equalsIgnoreCase("n")){
                    System.out.println("|==================================|");
                    System.out.println("|       Tapi Boong HEHEHEHEH       |");
                    System.out.println("|==================================|");
                }
                break;
            }
        }
    }

    private static void delete_dataA() throws NumberFormatException, IOException{
        System.out.println("|==============================|");
        System.out.println("|        Delete Data NIKE      |");
        System.out.println("|==============================|");
        System.out.println("");
        System.out.print("Masukkan nama sepatu yang mau dihapus -> ");
        String nsA = input.readLine();
        System.out.println("|=====================================================================================================================================|");
        System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
        System.out.println("|=====================================================================================================================================|");
        for(dataAdidas adidas : Adidas){
            if(adidas.getNamaA().equals(nsA)){
                System.out.printf("|\t%-20s  ", adidas.getNamaA());
                System.out.printf("|\t%-20s  ", adidas.getjenis_sepatuA());
                System.out.printf("|\t%-20s  ", adidas.getUkuranA());
                System.out.printf("|\t%-20s  ", adidas.getWarnaA());
                System.out.printf("|\t%-20s  ", adidas.getstockA());
                System.out.printf("|\t%-20s  ", adidas.getrilisA());
                System.out.printf("|\t%-20s  ", adidas.getKondisiA());
                System.out.printf("|\t%-20s  ", adidas.getHargaA());
                System.out.println("\n");
                System.out.print("Yakin Untuk Menghapus Data Ini?? [y/n] -> ");
                String yakin = input.readLine();
                if (yakin.equalsIgnoreCase("y")){
                    Adidas.remove(adidas);
                    System.out.println("|==================================|");
                    System.out.println("|     Data Telah Musnah HEHE -_-   |");
                    System.out.println("|==================================|");
                }
                else if(yakin.equalsIgnoreCase("n")){
                    System.out.println("|==================================|");
                    System.out.println("|       Tapi Boong HEHEHEHEH       |");
                    System.out.println("|==================================|");
                }
                break;
            }
        }
    }



    private static void Db_Nike() throws NumberFormatException, IOException{
        boolean lanjut = true;
        while(lanjut){
            clear();
            System.out.println("\t|==================================|");
            System.out.println("\t|             Data NIKE            |");
            System.out.println("\t|==================================|");
            System.out.println("\t| [1] Tambah Data Sepatu Nike      |");
            System.out.println("\t| [2] Lihat Data Sepatu Nike       |");
            System.out.println("\t| [3] Update Data Sepatu Nike      |");
            System.out.println("\t| [4] Delete Data Sepatu Nike      |");
            System.out.println("\t| [5] Exit Database                |");
            System.out.println("\t|==================================|");
            System.out.print("\n\t| Masukkan Pilihan Anda [1-5] -> ");
            int pilih = error_int();
            switch(pilih){
                case 1:
                    clear();
                    nambah_dataN();
                    break;
                case 2:
                    clear();
                    read_dataN();
                    break;
                case 3:
                    clear();
                    update_dataN();
                    break;
                case 4:
                    clear();
                    delete_dataN();
                    break;
                case 5:
                    clear();
                    menu_utama();
                    break;
                default:
                    System.err.println("|========================================|");
                    System.err.println("|        Bercanda Mulu Capek EY!         |");
                    System.err.println("|========================================|");
                    break;
            }
            lanjut = ulang("Masih Mau Berkunjung? -> ");
        }
        menu_utama();
    }

    private static void Db_NB() throws NumberFormatException, IOException{
        boolean lanjut = true;
        while(lanjut){
            clear();
            System.out.println("\t|==================================|");
            System.out.println("\t|             Data NB              |");
            System.out.println("\t|==================================|");
            System.out.println("\t| [1] Tambah Data Sepatu NB        |");
            System.out.println("\t| [2] Lihat Data Sepatu NB         |");
            System.out.println("\t| [3] Update Data Sepatu NB        |");
            System.out.println("\t| [4] Delete Data Sepatu NB        |");
            System.out.println("\t| [5] Exit Database                |");
            System.out.println("\t|==================================|");
            System.out.print("\n\t| Masukkan Pilihan Anda [1-5] -> ");
            int pilih = error_int();
            switch(pilih){
                case 1:
                    clear();
                    nambah_dataNB();
                    break;
                case 2:
                    clear();
                    read_dataNB();
                    break;
                case 3:
                    clear();
                    update_dataNB();
                    break;
                case 4:
                    clear();
                    delete_dataNB();
                    break;
                case 5:
                    clear();
                    menu_utama();
                    break;
                default:
                    System.err.println("|========================================|");
                    System.err.println("|        Bercanda Mulu Capek EY!         |");
                    System.err.println("|========================================|");
                    break;
            }
            lanjut = ulang("Masih Mau Berkunjung Data? -> ");
        }
        menu_utama();
    }

    private static void Db_Adidas() throws NumberFormatException, IOException{
        boolean lanjut = true;
        while(lanjut){
            clear();
            System.out.println("\t|==================================|");
            System.out.println("\t|             Data ADIDAS          |");
            System.out.println("\t|==================================|");
            System.out.println("\t| [1] Tambah Data Sepatu Adidas    |");
            System.out.println("\t| [2] Lihat Data Sepatu Adidas     |");
            System.out.println("\t| [3] Update Data Sepatu Adidas    |");
            System.out.println("\t| [4] Delete Data Sepatu Adidas    |");
            System.out.println("\t| [5] Exit Database                |");
            System.out.println("\t|==================================|");
            System.out.print("\n\t| Masukkan Pilihan Anda [1-5] -> ");
            int pilih = error_int();
            switch(pilih){
                case 1:
                    clear();
                    nambah_dataA();
                    break;
                case 2:
                    clear();
                    read_dataA();
                    break;
                case 3:
                    clear();
                    update_dataA();
                    break;
                case 4:
                    clear();
                    delete_dataA();
                    break;
                case 5:
                    clear();
                    menu_utama();
                    break;
                default:
                    System.err.println("|========================================|");
                    System.err.println("|        Bercanda Mulu Capek EY!         |");
                    System.err.println("|========================================|");
                    break;
            }
            lanjut = ulang("Masih Mau Berkunjung? -> ");
        }
        menu_utama();
    }

    private static void menu_utama() throws NumberFormatException ,IOException{
        boolean gas = true;
        while(gas){
            clear();
            System.out.println("\t|=============================|");
            System.out.println("\t|          Data Sepatu        |");
            System.out.println("\t|=============================|");
            System.out.println("\t| [1] Nike                    |");
            System.out.println("\t| [2] New Balance             |");
            System.out.println("\t| [3] Adidas                  |");
            System.out.println("\t| [4] Exit                    |");
            System.out.println("\t|=============================|");
            System.out.print("Masukkan Merek Yang Dituju -> ");
            int pilih = error_int();
            switch(pilih){
                case 1:
                    clear();
                    Db_Nike();
                    break;
                case 2:
                    clear();
                    Db_NB();
                    break;
                case 3:
                    clear();
                    Db_Adidas();
                    break;
                case 4:
                    clear();
                    menu_login();
                    break;
                default:
                    System.err.println("|========================================|");
                    System.err.println("|        Bercanda Mulu Capek EY!         |");
                    System.err.println("|========================================|");
                    break;
            }
            gas = ulang("Apakah Masih ingin Lanjut?");
        }
        exit();
    }

    private static void menu_login()throws NumberFormatException, IOException{
        while(true){
            clear();
            System.out.println("|================================|");
            System.out.println("| [1] Register                   |");
            System.out.println("| [2] Login                      |");
            System.out.println("| [3] Exit Program               |");
            System.out.println("|================================|");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilih = error_int();
            switch(pilih){
                case 1:
                    Register();
                break;
                case 2:
                    Login();
                break;
                case 3:
                    exit();
                    System.exit(0);
                break;
                default:
                    System.err.println("|=====================================|");
                    System.err.println("|    Tolong Pilih Sesuai Menu Login   |");
                    System.err.println("|=====================================|");
                break;
            }
        }
    }
}
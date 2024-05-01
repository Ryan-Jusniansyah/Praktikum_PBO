package Posttest2;
import java.io.*;
import java.util.*;
import static Posttest2.Main.input;
import static Posttest2.Main.Nike;
import static Posttest2.Main.Adidas;
import static Posttest2.Main.NB;

public class User extends akun {
    private String priv = "User";

    public User(String Username, String Password, String priv){
        super(Username, Password);
        this.priv = priv;
    }

    @Override
    public int error_int() throws IOException{
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

    @Override
    public boolean ulang(String tanya){
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

    @Override
    public void menu() throws NumberFormatException, IOException{
        boolean lanjut = true;
        while(lanjut == true){
            clear();
            System.out.println("|==============================|");
            System.out.println("|          Welcome User        |");
            System.out.println("|==============================|");
            System.out.println("| [1] Lihat Sepatu Nike        |");
            System.out.println("| [2] Lihat Sepatu NB          |");
            System.out.println("| [3] Lihat Sepatu Adidas      |");
            System.out.println("| [0] Log Out                  |");
            System.out.println("|==============================|");
            System.out.print("Masukkan Pilihan Anda -> ");
            int pilih = error_int();
            switch(pilih){
                case 1 -> {
                    read_dataN();
                    break;
                }
                case 2 ->{
                    read_dataNB();
                    break;
                }
                case 3 ->{
                    read_dataA();
                    break;
                }
                case 0 -> {
                    clear();
                    return;
                }
                default -> {
                    clear();
                    System.out.println("Pilih sesuai pilihan diatas");
                    break;
                }
            }
        }
    }

    // Fungsi Read
    @Override
    protected void read_dataN() throws IOException{
        if (Nike.isEmpty()){
            clear();
            System.out.print("Data Masih Kosong, Tekan Enter untuk menlanjutkan ");
            input.readLine();
        } else {
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
            System.out.print("Tekan Enter untuk menlanjutkan ");
            input.readLine();
        }
    }

    @Override
    protected void read_dataNB() throws IOException{
        if (NB.isEmpty()){
            clear();
            System.out.print("Data Masih Kosong, Tekan Enter untuk menlanjutkan ");
            input.readLine();
        } else {
            System.out.println("|===================================================================================================================================|");
            System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
            System.out.println("|===================================================================================================================================|");
            for(int i = 0; i<NB.size(); i++){
                System.out.printf("| %2d ", (i+1));
                System.out.printf("|\t%-20s  ", NB.get(i).getNamaNB());
                System.out.printf("|\t%-20s  ", NB.get(i).getjenis_sepatuNB());
                System.out.printf("|\t%-20s  ", NB.get(i).getUkuranNB());
                System.out.printf("|\t%-20s  ", NB.get(i).getWarnaNB());
                System.out.printf("|\t%-20s  ", NB.get(i).getstockNB());
                System.out.printf("|\t%-20s  ", NB.get(i).getrilisNB());
                System.out.printf("|\t%-20s  ", NB.get(i).getKondisiNB());
                System.out.printf("|\t%-20s  ", NB.get(i).getHargaNB());
                System.out.println("\n");
            }
            System.out.print("Tekan Enter untuk menlanjutkan ");
            input.readLine();
        }
    }

    @Override
    protected void read_dataA() throws IOException{
        if (Adidas.isEmpty()){
            clear();
            System.out.print("Data Masih Kosong, Tekan Enter untuk menlanjutkan ");
            input.readLine();
        } else {
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
            System.out.print("Tekan Enter untuk menlanjutkan ");
            input.readLine();
        }
    }

    @Override
    protected void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
package Posttest2;
import java.io.*;
import java.util.*;

public class Main {
    static InputStreamReader p = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(p);
    private static ArrayList<User> DataUser = new ArrayList<>();
    static ArrayList<dataAdidas> Adidas = new ArrayList<>();
    static ArrayList<dataNike> Nike = new ArrayList<>();
    static ArrayList<dataNB> NB = new ArrayList<>();

    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
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
    
    public static void main(String[] args) throws IOException{
        final User User1 = new User("GOJO", "001", "User");
        final Admin admin = new Admin("Ryan", "026", "Admin", DataUser);
        while(true){
            clear();
            System.out.println("|================================|");
            System.out.println("|       Aplikasi Sepatu          |");
            System.out.println("|================================|");
            System.out.println("| [1] Register                   |");
            System.out.println("| [2] Login                      |");
            System.out.println("| [0] Exit Program               |");
            System.out.println("|================================|");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilih = error_int();
            switch(pilih){
                case 1 -> {
                    System.out.println("|=================================|");
                    System.out.println("|         Register ACCOUNT        |");
                    System.out.println("|=================================|");
                    System.out.print("| Masukkan Username -> ");
                    String username = input.readLine();
                    System.out.print("| Masukkan Password -> ");
                    String password = input.readLine();
                    User new_user = new User(username, password, "User");
                    DataUser.add(new_user);
                    System.out.println("|=================================|");
                    System.out.println("|    Data Berhasil Ditambahkan    |");
                    System.out.println("|=================================|");
                    System.out.println("");
                    System.out.println("Lanjut Login");
                    System.out.println("Tekan Enter untuk melanjutkan ...");input.readLine();
                }
                case 2 -> {
                    System.out.println("|==================================|");
                    System.out.println("|           LOGIN ACCOUNT          |");
                    System.out.println("|==================================|");
                    System.out.print("| Masukkan Username Anda -> ");
                    String username = input.readLine();
                    System.out.print("| Masukkan Password Anda -> ");
                    String Password = input.readLine();
                    if(username.equals(admin.getuser()) && Password.equals(admin.getpass())){
                        admin.menu();
                    }
                    for(User user : DataUser){
                        if(username.equals(user.getuser()) && Password.equals(user.getpass())){
                            User1.menu();
                        }
                    }
                }
                case 0 -> {
                    System.out.println("|=======================================|");
                    System.out.println("|Terima Kasih Sudah Memakai program kami|");
                    System.out.println("|=======================================|");
                    System.exit(0);
                }
                default -> {
                    System.err.println("|=====================================|");
                    System.err.println("|    Tolong Pilih Sesuai Menu Login   |");
                    System.err.println("|=====================================|");
                }
            }
        }
    }

    public static int error_int() throws IOException{
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

    // // Fungsi Read
    // public static void read_dataN() throws IOException{
    //     if (Nike.isEmpty()){
    //         clear();
    //         System.out.print("Data Masih Kosong, Tekan Enter untuk menlanjutkan ");
    //         input.readLine();
    //     } else {
    //         System.out.println("|===================================================================================================================================|");
    //         System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
    //         System.out.println("|===================================================================================================================================|");
    //         for(int i = 0; i<Nike.size(); i++){
    //             System.out.printf("| %2d ", (i+1));
    //             System.out.printf("|\t%-20s  ", Nike.get(i).getNamaN());
    //             System.out.printf("|\t%-20s  ", Nike.get(i).getjenis_sepatuN());
    //             System.out.printf("|\t%-20s  ", Nike.get(i).getUkuranN());
    //             System.out.printf("|\t%-20s  ", Nike.get(i).getWarnaN());
    //             System.out.printf("|\t%-20s  ", Nike.get(i).getstockN());
    //             System.out.printf("|\t%-20s  ", Nike.get(i).getrilisN());
    //             System.out.printf("|\t%-20s  ", Nike.get(i).getKondisiN());
    //             System.out.printf("|\t%-20s  ", Nike.get(i).getHargaN());
    //             System.out.println("\n");
    //         }
    //         System.out.print("Tekan Enter untuk menlanjutkan ");
    //         input.readLine();
    //     }
    // }

    // public static void read_dataNB() throws IOException{
    //     if (NB.isEmpty()){
    //         clear();
    //         System.out.print("Data Masih Kosong, Tekan Enter untuk menlanjutkan ");
    //         input.readLine();
    //     } else {
    //         System.out.println("|===================================================================================================================================|");
    //         System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
    //         System.out.println("|===================================================================================================================================|");
    //         for(int i = 0; i<NB.size(); i++){
    //             System.out.printf("| %2d ", (i+1));
    //             System.out.printf("|\t%-20s  ", NB.get(i).getNamaNB());
    //             System.out.printf("|\t%-20s  ", NB.get(i).getjenis_sepatuNB());
    //             System.out.printf("|\t%-20s  ", NB.get(i).getUkuranNB());
    //             System.out.printf("|\t%-20s  ", NB.get(i).getWarnaNB());
    //             System.out.printf("|\t%-20s  ", NB.get(i).getstockNB());
    //             System.out.printf("|\t%-20s  ", NB.get(i).getrilisNB());
    //             System.out.printf("|\t%-20s  ", NB.get(i).getKondisiNB());
    //             System.out.printf("|\t%-20s  ", NB.get(i).getHargaNB());
    //             System.out.println("\n");
    //         }
    //         System.out.print("Tekan Enter untuk menlanjutkan ");
    //         input.readLine();
    //     }
    // }

    // public static void read_dataA() throws IOException{
    //     if (Adidas.isEmpty()){
    //         clear();
    //         System.out.print("Data Masih Kosong, Tekan Enter untuk menlanjutkan ");
    //         input.readLine();
    //     } else {
    //         System.out.println("|===================================================================================================================================|");
    //         System.out.println("\n| No |\tNama Sepatu           |\tJenis Sepatu      |\tUkuran   |\tWarna     |\tStock  |\tRilis  |\tKondisi      |\tKisaran Harga\t|");
    //         System.out.println("|===================================================================================================================================|");
    //         for(int i = 0; i<Adidas.size(); i++){
    //             System.out.printf("| %2d ", (i+1));
    //             System.out.printf("|\t%-20s  ", Adidas.get(i).getNamaA());
    //             System.out.printf("|\t%-20s  ", Adidas.get(i).getjenis_sepatuA());
    //             System.out.printf("|\t%-20s  ", Adidas.get(i).getUkuranA());
    //             System.out.printf("|\t%-20s  ", Adidas.get(i).getWarnaA());
    //             System.out.printf("|\t%-20s  ", Adidas.get(i).getstockA());
    //             System.out.printf("|\t%-20s  ", Adidas.get(i).getrilisA());
    //             System.out.printf("|\t%-20s  ", Adidas.get(i).getKondisiA());
    //             System.out.printf("|\t%-20s  ", Adidas.get(i).getHargaA());
    //             System.out.println("\n");
    //         }
    //         System.out.print("Tekan Enter untuk menlanjutkan ");
    //         input.readLine();
    //     }
    // }
}
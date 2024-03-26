package Posttest2;
import java.io.*;
import java.util.*;
import static Posttest2.Main.error_int;
import static Posttest2.Main.clear;

public class User extends akun {
    private String priv = "User";

    public User(String Username, String Password, String priv){
        super(Username, Password);
        this.priv = priv;
    }

    public static void menu_user() throws NumberFormatException, IOException{
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
                    Main.read_dataN();
                    break;
                }
                case 2 ->{
                    Main.read_dataNB();
                    break;
                }
                case 3 ->{
                    Main.read_dataA();
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

}

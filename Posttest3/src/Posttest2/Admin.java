package Posttest2;
import java.io.*;
import java.util.*;
import static Posttest2.Main.clear;
import static Posttest2.Main.error_int;

public class Admin extends akun {
    private String priv = "Admin";
    private ArrayList<User> DataUser;

    public Admin(String Username, String Password, String priv, ArrayList<User> data){
        super(Username, Password);
        this.priv = priv;
    }

    public String getpriv(){
        return priv;
    }

    public void setpriv(String priv){
        this.priv = priv;
    }

    public static void menu_Admin() throws NumberFormatException ,IOException{
        boolean gas = true;
        while(gas){
            clear();
            System.out.println("\t|=============================|");
            System.out.println("\t|          Data Sepatu        |");
            System.out.println("\t|=============================|");
            System.out.println("\t| [1] Nike                    |");
            System.out.println("\t| [2] New Balance             |");
            System.out.println("\t| [3] Adidas                  |");
            System.out.println("\t| [0] Log Out                 |");
            System.out.println("\t|=============================|");
            System.out.print("Masukkan Merek Yang Dituju -> ");
            int pilih = error_int();
            switch(pilih){
                case 1 -> {
                    clear();
                    Main.Db_Nike();
                    break;
                }
                case 2 -> {
                    clear();
                    Main.Db_NB();
                    break;
                }
                case 3 -> {
                    clear();
                    Main.Db_Adidas();
                    break;
                }
                case 0 -> {
                    clear();
                    return;
                }
                default -> {
                    System.err.println("|========================================|");
                    System.err.println("|        Bercanda Mulu Capek EY!         |");
                    System.err.println("|========================================|");
                    return;
                }
            }
        }
    }
}

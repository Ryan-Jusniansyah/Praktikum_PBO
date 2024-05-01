package Posttest2;

import java.io.IOException;

public abstract class akun {
    private String Username;
    private String Password;

    protected abstract void read_dataA() throws IOException;
    protected abstract void read_dataN() throws IOException;
    protected abstract void read_dataNB() throws IOException;
    protected abstract void menu() throws NumberFormatException, IOException;
    protected abstract void clear();
    protected abstract int error_int() throws IOException;
    protected abstract boolean ulang(String tanya);

    akun(String Id, String pass){
        this.Username = Id;
        this.Password = pass;
    }
    
    public String getuser(){
        return Username;
    }

    public String getpass(){
        return Password;
    }

}

package Posttest1;

class akun {
    private String Username;
    private String Password;

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

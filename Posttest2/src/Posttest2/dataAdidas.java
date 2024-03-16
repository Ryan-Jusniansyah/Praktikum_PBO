package Posttest2;

class dataAdidas{
    private String namaA;
    private String jenis_sepatuA;
    private String ukuranA;
    private String WarnaA;
    private int stockA;
    private int tahun_rilisA;
    private String KondisiA;
    private String HargaA;

    dataAdidas(String SepatuAdidas, String JenisA, String UkuranA, String WarnaA, int stockA,int rilisA, String KondisiA, String HargaA){
        this.namaA = SepatuAdidas;
        this.jenis_sepatuA = JenisA;
        this.ukuranA = UkuranA;
        this.WarnaA = WarnaA;
        this.stockA = stockA;
        this.tahun_rilisA = rilisA;
        this.KondisiA = KondisiA;
        this.HargaA = HargaA;
    }

    public void setNamaA(String namaA){
        this.namaA = namaA;
    }

    public void setJenisA(String jenis_sepatuA){
        this.jenis_sepatuA = jenis_sepatuA;
    }

    public void setUkuranA(String ukuranA){
        this.ukuranA = ukuranA;
    }

    public void setWarnaA(String WarnaA){
        this.WarnaA = WarnaA;
    }

    public void setstockA(int stockA){
        this.stockA = stockA;
    }

    public void setRilisA(int RilisA){
        this.tahun_rilisA = RilisA;
    }

    public void setKondisiA(String KondisiA){
        this.KondisiA = KondisiA;
    }

    public void setHargaA(String HargaA){
        this.HargaA = HargaA;
    }

    public String getNamaA(){
        return namaA;
    }

    public String getjenis_sepatuA(){
        return jenis_sepatuA;
    }

    public String getUkuranA(){
        return ukuranA;
    }

    public String getWarnaA(){
        return WarnaA;
    }

    public int getstockA(){
        return stockA;
    }

    public int getrilisA(){
        return tahun_rilisA;
    }

    public String getKondisiA(){
        return KondisiA;
    }

    public String getHargaA(){
        return HargaA;
    }
}
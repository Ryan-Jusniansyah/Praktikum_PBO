package Posttest1;

class dataNB {
    private String namaNB;
    private String jenis_sepatuNB;
    private String ukuranNB;
    private String WarnaNB;
    private int stockNB;
    private int tahun_rilisNB;
    private String KondisiNB;
    private String HargaNB;

    dataNB(String SepatuNB, String JenisNB, String UkuranNB, String WarnaNB, int stockNB,int rilisNB, String KondisiNB, String HargaNB){
        this.namaNB = SepatuNB;
        this.jenis_sepatuNB = JenisNB;
        this.ukuranNB = UkuranNB;
        this.WarnaNB = WarnaNB;
        this.stockNB = stockNB;
        this.tahun_rilisNB = rilisNB;
        this.KondisiNB = KondisiNB;
        this.HargaNB = HargaNB;
    }

    public void setNamaNB(String namaNB){
        this.namaNB = namaNB;
    }

    public void setJenisNB(String jenis_sepatuNB){
        this.jenis_sepatuNB = jenis_sepatuNB;
    }

    public void setUkuranNB(String ukuranNB){
        this.ukuranNB = ukuranNB;
    }

    public void setWarnaNB(String WarnaNB){
        this.WarnaNB = WarnaNB;
    }

    public void setstockNB(int stockNB){
        this.stockNB = stockNB;
    }

    public void setRilisNB(int RilisNB){
        this.tahun_rilisNB = RilisNB;
    }

    public void setKondisiNB(String KondisiNB){
        this.KondisiNB = KondisiNB;
    }

    public void setHargaNB(String HargaNB){
        this.HargaNB = HargaNB;
    }

    public String getNamaNB(){
        return namaNB;
    }

    public String getjenis_sepatuNB(){
        return jenis_sepatuNB;
    }

    public String getUkuranNB(){
        return ukuranNB;
    }

    public String getWarnaNB(){
        return WarnaNB;
    }

    public int getstockNB(){
        return stockNB;
    }

    public int getrilisNB(){
        return tahun_rilisNB;
    }

    public String getKondisiNB(){
        return KondisiNB;
    }

    public String getHargaNB(){
        return HargaNB;
    }
}

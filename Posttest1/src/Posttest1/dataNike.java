package Posttest1;

class dataNike{
    private String namaNike;
    private String jenis_sepatuN;
    private String ukuranN;
    private String WarnaN;
    private int stockN;
    private int tahun_rilisN;
    private String KondisiN;
    private String HargaN;

    dataNike(String SepatuNike, String JenisN, String UkuranN, String WarnaN, int stockN,int rilisN, String KondisiN, String HargaN){
        this.namaNike = SepatuNike;
        this.jenis_sepatuN = JenisN;
        this.ukuranN = UkuranN;
        this.WarnaN = WarnaN;
        this.stockN = stockN;
        this.tahun_rilisN = rilisN;
        this.KondisiN = KondisiN;
        this.HargaN = HargaN;
    }

    public void setNamaN(String namaNike){
        this.namaNike = namaNike;
    }

    public void setJenisN(String jenis_sepatuN){
        this.jenis_sepatuN = jenis_sepatuN;
    }

    public void setUkuranN(String ukuranN){
        this.ukuranN = ukuranN;
    }

    public void setWarnaN(String WarnaN){
        this.WarnaN = WarnaN;
    }

    public void setstockN(int stockN){
        this.stockN = stockN;
    }

    public void setRilisN(int RilisN){
        this.tahun_rilisN = RilisN;
    }

    public void setKondisiN(String KondisiN){
        this.KondisiN = KondisiN;
    }

    public void setHargaN(String HargaN){
        this.HargaN = HargaN;
    }

    public String getNamaN(){
        return namaNike;
    }

    public String getjenis_sepatuN(){
        return jenis_sepatuN;
    }

    public String getUkuranN(){
        return ukuranN;
    }

    public String getWarnaN(){
        return WarnaN;
    }

    public int getstockN(){
        return stockN;
    }

    public int getrilisN(){
        return tahun_rilisN;
    }

    public String getKondisiN(){
        return KondisiN;
    }

    public String getHargaN(){
        return HargaN;
    }

}
package Project1;


public class Sala {
    private int iNumer;
    private  String sBudynek;
    private int iMaxLiczbaOsob;
   
    void setNumer(int iNumer)
    {
        this.iNumer = iNumer;
    }
    void setBudynek(String sBudynek)
    {
        this.sBudynek = sBudynek;
    }
    void setMaxLiczbaOsob(int iMaxLiczbaOsob)
    {
        this.iMaxLiczbaOsob = iMaxLiczbaOsob;
    }
    int getNumer()
    {
        return iNumer;
    }
    String getBudynek()
    {
        return sBudynek;
    }
    int getMaxLiczbaOsob()
    {
        return iMaxLiczbaOsob;
    }
}

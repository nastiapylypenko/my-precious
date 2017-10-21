 
package Project1;

 
public class Taniec {
   private String sRodzaj;
   private int iCena;
   private String sGrupa;
    void setRodzaj(String sRodzaj)
    {
        this.sRodzaj = sRodzaj;
    }
    void setGrupa(String sGrupa)
    {
        this.sGrupa = sGrupa;
    }
    void setCena(int iCena)
    {
        this.iCena = iCena;
    }
    String getRodzaj()
            {
                return sRodzaj;
            }
    String getGrupa()
    {
        return sGrupa;
    }
    int getCena()
    {
        return iCena;
    }
}

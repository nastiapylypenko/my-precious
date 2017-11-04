 
package przedsiebiorstwo;

 
public class Szef extends Menedzer {
    private int iPremia;
    Szef(int iWiek, String sImie, int iNumerSali, int iPremia)
    {
        super(iWiek,sImie, iNumerSali);
        this.iPremia = iPremia;
    }
}

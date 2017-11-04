 
package przedsiebiorstwo;
 
public class Menedzer extends Pracownik {
    private int iNumerSali;
    Menedzer(int iWiek, String sImie, int iNumerSali )
    {
        super(iWiek, sImie);
        this.iNumerSali = iNumerSali;
    }
}

 
package newyear;

 
public class Dziecko {
    private String nastroj;

    public String getNastroj() {
        return nastroj;
    }
    void wezPrezent(Prezent p)
    {
        if(p instanceof Rozga)
        {
            Rozga ro = (Rozga)p;
            nastroj="smutny";
        }
       
        else if(p instanceof Lego)
        {
            Lego lego = (Lego)p;
            nastroj="wesoły";
        }
           else if(p instanceof Duplo)
        {
            Duplo duplo = (Duplo)p;
            nastroj="zajebisty";
        }
        else if(p instanceof Klocki)
        {
            Klocki klo = (Klocki)p;
            nastroj="super";
        }
        
    }
            
}

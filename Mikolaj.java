 
package newyear;

import java.util.ArrayList;

 
public class Mikolaj {
    ArrayList torba = new ArrayList();
    Prezent p;
    void wlozPrezent(Prezent p)
    {
        torba.add(p);
    }
    Prezent dajPrezent(int nr)
    {
        if(nr <= torba.size())
        {
            p = (Prezent)torba.get(nr);
            torba.remove(nr);
        }
        else 
          p = null;
        
        
          return p;
        
    }
}

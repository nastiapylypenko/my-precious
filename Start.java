  
package newyear;

import java.util.Random;


public class Start {

     
    public static void main(String[] args) {
         Mikolaj mikolaj = new Mikolaj();
         Dziecko dziecko = new Dziecko();
         Random r = new Random();
         
         int rozmiar = r.nextInt(10);
         for(int i= 0;i<=rozmiar;i++)
         {
             int rodzajPrezentu = r.nextInt(4);
             if( rodzajPrezentu == 0)
             {
                 Rozga ro = new Rozga(i);
                 mikolaj.wlozPrezent(ro);
                         
             }
             else if( rodzajPrezentu == 1)
             {
                 Klocki klo = new Klocki(i);
                 mikolaj.wlozPrezent(klo);
                         
             }
             else if( rodzajPrezentu == 2)
             {
                 Lego lego = new Lego(i);
                 mikolaj.wlozPrezent(lego);
                         
             }
             else if( rodzajPrezentu == 3)
             {
                 Duplo duplo = new Duplo(i);
                 mikolaj.wlozPrezent(duplo);
                         
             }
         }
         dziecko.wezPrezent(mikolaj.dajPrezent(2));
         String l = dziecko.getNastroj();
         System.out.println(l);
    }
    
}

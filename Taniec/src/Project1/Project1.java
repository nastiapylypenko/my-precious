 
package Project1;

 
public class Project1 {
  
    public static void main(String[] args) {
        Taniec t1  = new Taniec();
        t1.setRodzaj("taniec towarzyski");
        t1.setGrupa("podstawowa");
        t1.setCena(190);
        Taniec t2 = new Taniec();
        t2.setGrupa("zaawansowana");
        Sala s1 = new Sala();
        s1.setNumer(12);
        s1.setBudynek("H-14");
        s1.setMaxLiczbaOsob(50);
        Sala s2 = new Sala();
        s2.setNumer(21);
        if (t1.getCena() < 200 )
            System.out.println("Grupa " + t1.getGrupa() + " ma zajecia w sali numer " + s1.getNumer());
        else
            System.out.println("Grupa " + t2.getGrupa() + " ma zajecia w sali numer " + s2.getNumer());
    }
    
}

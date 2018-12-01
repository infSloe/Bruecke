
/**
 * Die Klasse Aufgabe
 */
public class Aufgabe implements Runnable
{
    // Attribute
    private Bruecke bruecke;
    //private String zustand;

    // Konstruktor
    public Aufgabe()
    {
        bruecke = new Bruecke();

    }

    // Methoden
    public void run()
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " steht vor der Bruecke");
        boolean vorBruecke = true;
        while (vorBruecke)
        {
            System.out.println(name + " möchte über die Bruecke fahren");
            if (bruecke.testenUndSperren())
            {
                System.out.println(name + " fährt über die Brücke, juhu!");
                try{
                    Thread.sleep(5); // Es ist eine lange Brücke!
                }
                catch(Exception ex){}
                vorBruecke = false;
            }
        }

        System.out.println(name + " hat es endlich geschafft!");
        bruecke.freigeben();

    }
}


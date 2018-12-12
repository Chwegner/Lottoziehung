package lottoziehung;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author cwegner
 */
public class Berechnung
{

    //// Generierung von 6 Zusatzzahlen
    public ArrayList Zufall()
    {
        ArrayList rand = new ArrayList();
        ArrayList zahlList = new ArrayList();

        // Arraylist wird mit 49 Zahlen generiert
        for (int i = 0; i < 49; i++)
        {
            rand.add(i + 1);
        }

        // Zufallsfaktor        
        Collections.shuffle(rand);

        // Füge die ersten 6 Zahlen zahlList zu        
        for (int p = 0; p < 6; p++)
        {
            zahlList.add(rand.get(p));
        }
        System.out.println(zahlList);
        return zahlList;
    }

    //// Vergleich Spielerzahlen mit Gewinnzahlen, Richtige in Array zurückgeben
    public ArrayList Vergleich(String auswahl)
    {

        ArrayList zahlen = new ArrayList();
        ArrayList benutzereingaben = new ArrayList();
        Collections.sort(zahlen);
        ArrayList gewinnzahlen = Zufall();
        Collections.sort(gewinnzahlen);
        ArrayList richtigeList = new ArrayList();
        System.out.println("Richtig: ");

        // Spielerwahl Automatisch oder Manuell
        if (auswahl.equals("auto"))
        {
            zahlen = Zufall();
        } else
        {
            zahlen = benutzereingaben;
        }

        // Sind die Spielerzahlen in den Gewinnzahlen vorhanden, dann füge die 
        // jeweiligen Zahlen "richtigeList" hinzu
        for (int i = 0; i < 6; i++)
        {
            if (zahlen.get(i).equals(gewinnzahlen.get(0))
                    || zahlen.get(i).equals(gewinnzahlen.get(1))
                    || zahlen.get(i).equals(gewinnzahlen.get(2))
                    || zahlen.get(i).equals(gewinnzahlen.get(3))
                    || zahlen.get(i).equals(gewinnzahlen.get(4))
                    || zahlen.get(i).equals(gewinnzahlen.get(5)))
            {
                richtigeList.add(zahlen.get(i));
                System.out.println(zahlen.get(i));
            }
        }
        return richtigeList;
    }

}

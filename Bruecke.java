
/**
 * Die Klasse Brücke
 */
public class Bruecke
{
    // Attribute
    private boolean frei;

    public Bruecke()
    {
        frei = true;
    }
    
    // Methoden
    public boolean testenUndSperren()
    {
        if (frei)
        {
            frei = false;
            return true;
        }
        return false;
    }

    public void freigeben()
    {
        frei = true;
    }
}

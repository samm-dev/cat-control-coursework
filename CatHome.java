import java.util.LinkedList;
import java.util.HashSet;

/**
 * Keep track of all the cats in the sanctuary.
 *
 * @author Sam
 * @version 2020.12.01
 */
public class CatHome
{
    private LinkedList<Cat> cats;
    
    /**
     * Create a CatHome object.
     */
    public CatHome()
    {
        cats = new LinkedList<>();
    }
    
    /**
     * Add a new cat.
     * @param cat The cat.
     */
    public void addCat(Cat cat)
    {
        cats.add(cat);
    }
    
    /**
     * Lists all the cats that are not vaccinated.
     */
    public void printUnvaccinated()
    {
        for (Cat cat : cats) {
            if (!cat.isVaccinated()){
                System.out.println(cat.getDetails());
            }
        }
    }
    
    /**
     * Gets all unvaccinated cats and returns them in a HashSet.
     * @return HashSet<Cat>
     */
    public HashSet<Cat> getVaccinated()
    {
        HashSet<Cat> cattySet = new HashSet<>();
        for (Cat cat : cats) {
            if (cat.isVaccinated()){
                cattySet.add(cat);
            }
        }
        return cattySet;
    }
}

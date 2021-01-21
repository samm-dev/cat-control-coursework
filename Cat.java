/**
 * Model a cat sanctuary
 *
 * @author Sam
 * @version 2020.12.01
 */
public class Cat
{
    // The name of the cat.
    private String name;
    // The breed of the cat.
    private String breed;;
    // Whether the cat is vaccinated or not.
    private boolean vaccinated;
    
    /**
     * Create a cat object.
     * @param name The cat's name.
     * @param breed The breed of the cat.
     * @param vaccinated Whether the cat is vaccinated or not
     */
    public Cat(String name, String breed, boolean vaccinated)
    {
        this.name = name;
        this.breed = breed;
        this.vaccinated = vaccinated;
    }

    /**
     * Get the name.
     * @return The name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Get the breed.
     * @return The breed.
     */
    public String getBreed()
    {
        return breed;
    }

    /**
     * Return whether the cat is vaccinated or not.
     * @return true if vaccinated, false otherwise.
     */
    public boolean isVaccinated()
    {
        return vaccinated;
    }

    /**
     * Get the formatted details.
     * @return the formatted details.
     */
    public String getDetails()
    {
        return String.format("%s is a %s %s",
                             name, breed, vaccinated ? "(Vaccinated)" : "");
    }
}

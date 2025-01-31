import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName, suit;
//    private Image image;


    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
    }



    /**
     * This method returns a list of face names that are valid for
     * Card objects
     */
    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack",
                            "queen","king","ace");
    }

    /**
     * This method will valid the argument and set the instance variable
     * @param faceName 2,3,4,5,6,7,8,9,10,jack,queen,king
     */
    public void setFaceName(String faceName) {
        List<String> validFaceNames = getValidFaceNames();
        faceName = faceName.toLowerCase();

        if (validFaceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException("Valid face names are"+
                            validFaceNames);
    }

    /**
     * This method will return a list of valid suits
     * @return spades, hearts, clubs, diamonds
     */
    public static List<String> getValidSuits()
    {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }

    public void setSuit(String suit) {
        List<String> validSuits = getValidSuits();
        suit = suit.toLowerCase();
        
        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("valid suits are"+ validSuits);
    }

    public String toString()
    {
        return String.format("%s of %s", faceName, suit);
    }
}

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;
//    private Image backOfCardImage;

    //1. define the class
    //2. define the instance variables
    //3. create Constructor - this will define the object in the system
    //4. create get/set methods
    //5. create any custom methods

    /**
     * This is a zero argument constructor that will build a full Deck of Cards
     */
    public DeckOfCards()
    {
        List<String> suits = Card.getValidSuits(); //that is calling a static method
                                                    //so we do NOT need an instance of Card
                                                    //to call it
        List<String> faceNames = Card.getValidFaceNames();

        deck = new ArrayList<>();

        for (String suit:suits)
        {
            for (String faceName:faceNames)
                deck.add(new Card(faceName,suit));
        }
    }
}

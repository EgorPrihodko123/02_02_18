package robotFactory;

/**
 * Created by java on 02.02.2018.
 */
public class Hand {
    private String typeHand;
    public void robotCanWrite(){
        System.out.println("I am "+typeHand+" hand I can write");
    }

    public Hand(String typeHand) {
        this.typeHand = typeHand;
    }

    public String getTypeHand() {
        return typeHand;
    }

    public void setTypeHand(String typeHand) {
        this.typeHand = typeHand;
    }
}

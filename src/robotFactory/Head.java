package robotFactory;

/**
 * Created by java on 02.02.2018.
 */
public class Head {
    private String typeLeft;
    public void robotCanThink(){
        System.out.println("I am "+typeLeft+" I can think");
    }

    public Head(String typeLeft) {
        this.typeLeft = typeLeft;
    }
}

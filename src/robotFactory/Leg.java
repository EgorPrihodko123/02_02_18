package robotFactory;

/**
 * Created by java on 02.02.2018.
 */
public class Leg {
    private String typeLeg;
    public void robotCanRun(){
        System.out.println("I am "+typeLeg+" leg I can run");
    }

    public Leg(String typeLeg) {
        this.typeLeg = typeLeg;
    }

    public String getTypeLeg() {
        return typeLeg;
    }

    public void setTypeLeg(String typeLeg) {
        this.typeLeg = typeLeg;
    }
}

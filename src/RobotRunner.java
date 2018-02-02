import robotFactory.*;

/**
 * Created by java on 02.02.2018.
 */
public class RobotRunner {

    public static void main(String[] args) {
        Robot robot=new Robot(new Head(""),new Body(),new Hand("right"),new Hand("left"),new Leg("right"),new Leg("left"));
        System.out.println(robot);
    }
}

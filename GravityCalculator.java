package gravityCalculator;

/**
 * Created by Aser on 19.08.2016.
 */
public class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        //formula to determine the final position of the object : x(t) = 0.5 * a(t * t) + v(t) + x
        //a – gravity
        //t – time
        //v – initial velocity
        //x – initial position


        finalPosition = (0.5 * (gravity * (fallingTime * fallingTime)) + (initialVelocity * fallingTime) + (initialPosition));

        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}



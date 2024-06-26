package GravityCalculator;

/**
 * @author neozhang
 */
class GravityCalculator { public static void main(String[] arguments) {
    // Earth's gravity in m/s^2
    double gravity = -9.81;
    double initialVelocity = 0.0;
    double fallingTime = 10.0;
    double initialPosition = 0.0;
    double finalPosition = 0.0;

    // Part One
    System.out.println("The object's position after " + fallingTime +
            " seconds is " + finalPosition + " m.");  // The object's position after 10.0 seconds is 0.0 m.

    // Part Two
    // Calculate the final position using the formula
    finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;
    System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
    }
}

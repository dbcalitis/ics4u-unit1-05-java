/*
* The BoardFoot program calculates the length of
* a wooden plank with the dimensions of a board foot
*
* @author  Daria Bernice Calitis
* @version 1.0
* @since   2022-09-23
*/

// Import Scanner
import java.util.Scanner;

/**
* .Class constructor BoardFoot.
*/
final class BoardFoot {
    /**
     * Error message.
     */
    public static final String ERR_MSG = "Invalid Input.";

    /**
     * Board Foot.
     */
    public static final int BOARD_FOOT = 144;

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * BoardFootLength Method.
     * This calculates the length of a wooden plank
     * with the dimensions of a board foot.
     *
     * @param width Width of a wooden plank
     * @param height Height of a wooden plank
     *
     * @return length Length of a wooden plank
     */
    private static float boardFootLength(float width, float height) {
        final float length = BOARD_FOOT / (width * height);
        return length;
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // Create Scanner Object
        final Scanner scan = new Scanner(System.in);

        try {
            System.out.print(
                "This program figures out the length of a wooden board "
                + "that is 1 board foot in dimension"
                + "(1 board foot is 144 inches³ of wood)"
            );

            System.out.print("Enter the width (inch): ");
            final float userWidth = scan.nextFloat();

            System.out.print("Enter the height (inch): ");
            final float userHeight = scan.nextFloat();

            System.out.printf("\nThe wood should be %s inch(es) long.\n",
                String.valueOf(boardFootLength(userWidth, userHeight))
            );
        } catch (java.util.InputMismatchException error) {
            System.out.println(ERR_MSG);
        }

        System.out.println("\nDone.");
    }
}

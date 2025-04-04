import org.code.theater.*;
import java.util.ArrayList;

public class SchoolScene extends Scene {
  /*
   * Private variables for initialization of images
   */
    private Girl theGirl;
    private Crying tears;
    private String backgroundImage;
    public static final int SIZE = 400;

    /*
     * Parameterized constructor for each of the variables
     */
    public SchoolScene(Girl theGirl, Crying tears, String backgroundImage) {
        this.theGirl = theGirl;
        this.tears = tears;
        this.backgroundImage = backgroundImage;
    }

    /*
     * Creates scene through drawBackground
     * and animateGirl methods
     */
    public void createScene() {
        drawBackground();
        animateGirl();  // Run the animation sequence
    }

    private void drawBackground() {
        drawImage(backgroundImage, 0, 0, 420);
    }

    private void animateGirl() {
        // Shows girl studying
        drawExpression("studyingwoman.png", 1);
        drawText("Alissa is a diligent high school student", 15, 80);
        drawText("who aspires to become a worker at", 15, 100);
        drawText("the United Nations.", 15, 120);
        playSound(tears.getSound()); 
        pause(5);
        clear("white");
      
        // Shows stress
        drawExpression("stressedstudying.png", 1);
        drawText("Alissa wants to join the MUN club", 15, 60);
        drawText("and participate in competitions.", 15, 80);
        playSound("StressedAudio.wav"); 
        pause(5);
        clear("white");
        
        // Shows sadness with tears and sound
        drawExpression("result2.png", 1);
        drawText("She feels sad and hopeless when she", 15, 40);
        drawText("realizes that she is unable to afford", 15, 60);
        drawText("the competition fees.", 15, 80);
        playSound(tears.getSound()); 
        pause(5);
        clear("white");
        
        // Shows happiness
        drawExpression("result3.png", 1);
        drawText("After outreaching for help. She is", 15, 60);
        drawText("able to receive the financial support", 15, 80);
        drawText("she needs.", 15, 100);
        pause(5);
        playSound("HappyAudio.wav"); 
     
      
    }

    /*
     * Creates each of the images with specified times
     */
    private void drawExpression(String expression, double pauseTime) {
        drawBackground();
        drawImage(theGirl.getImage(expression), 0, 0, 300);
        pause(pauseTime);
    }
}
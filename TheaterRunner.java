import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
    public static void main(String[] args) {
        // Images representing different emotional states of the girl
        String[] girlImages = {"studyingwoman.png", "stressedstudying.png", "result2.png", "result3.png"};
        double[] sound = SoundLoader.read("newcryingaudio.wav"); // Load crying sound

        // Create characters
        Girl theGirl = new Girl(girlImages, sound, 180, 200, SchoolScene.SIZE);
        Crying tears = new Crying("crying.png", 280, 10, 45, SchoolScene.SIZE);

        // Create scene
        SchoolScene school = new SchoolScene(theGirl, tears, "school.png");
        school.createScene();
        
        // Play the animation in Theater
        Theater.playScenes(school);
    }
}

import org.code.media.*;
public class Crying extends Student {
    private int rotation;

    /*
     * Gives x and y position of given image
     * along with side and type of rotation
     */
    public Crying(String image, int xPos, int yPos, int rotation, int size) {
        super(image, xPos, yPos, size);
        this.rotation = rotation;
    }

    public int getRotation() { return rotation; }
    public void setRotation(int rotation) { this.rotation = rotation; }

    public double[] getSound() {
        return SoundLoader.read("CryingAudio.wav");
    }
}
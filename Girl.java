import org.code.media.*;


public class Girl extends Student {

  /*
   * Private variables of girl images and sounds
   */
    private String[] girlImages;
    private double[] sound;

  // Parameterized constructor
    public Girl(String[] girlImages, double[] sound, int xPos, int yPos, int size) {
        super(girlImages[0], xPos, yPos, size);
        this.girlImages = girlImages;
        this.sound = sound;
    }

  /*
   * Enhanced for loop returns image if it contains emotion
   */
    public String getImage(String emotion) {
        for (String img : girlImages) {
            if (img.contains(emotion)) {
                return img;
            }
        }
        return girlImages[0];
    }

    public double[] getSound() { return sound; }
}
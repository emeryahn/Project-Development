import org.code.media.*;

public class Student {
    private String image;
    private int xPos, yPos, size;

    public Student(String image, int xPos, int yPos, int size) {
        this.image = image;
        this.xPos = xPos;
        this.yPos = yPos;
        this.size = size;
    }

    public String getImage() { return image; }
    public int getXPos() { return xPos; }
    public int getYPos() { return yPos; }
    public int getSize() { return size; }
    public void updatePosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
}
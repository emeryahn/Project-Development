import org.code.media.*;

/* 
 * Sets sound frequency and volume
 */
public class SoundEffects {
    public static double[] increaseVolume(double[] sound, double amount) {
        double[] louderSound = new double[sound.length];
        for (int i = 0; i < sound.length; i++) {
            louderSound[i] = sound[i] * amount;
        }
        return louderSound;
    }
}

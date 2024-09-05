package sound;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SamplerPlayer {
    public static final String path = "src/sound/Audio2.wav";

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file = new File(path);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Rewind, Q = Quit");
            System.out.println("Enter your choice");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response){
                case ("P"): clip.start();
                break;
                case ("S"): clip.stop();
                break;
                case ("R"): clip.setFramePosition(1000);
                break;
                case ("Q"): clip.close();
                default:
                    System.out.println("Not Valid");
            }
        }
        clip.start();
    }
}

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlayMusicJava
{
    public static void main(String[] args)
    {
         System.setProperty("java.awt.headless", "true");

         String filepath = "/home/stokesy/Downloads/Y2meta.app - Madison Beer - Make You Mine (Official Music Video) (128 kbps).wav";
         Playmusic(filepath);
         System.out.println("Press Enter to stop playing");

        // Create a Scanner object to read input from the console
         Scanner scanner = new Scanner(System.in);

        // Wait for the user to press Enter
         scanner.nextLine();

        // Clean up the Scanner resource
         scanner.close();

         System.out.println("Music stopped.");
    }

    public static void Playmusic(String location)
    {
    try
        {
         File musicpath = new File(location);

        if (musicpath.exists())
        {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicpath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        }

        else
        {
         System.out.println("File not found");
        }
       }
   
    catch(Exception e)
    {
      System.out.println(e);
    }

   }

}
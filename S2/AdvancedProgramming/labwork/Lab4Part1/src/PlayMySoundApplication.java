import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 01/03/2017
 * 
 */
public class PlayMySoundApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			try{
				InputStream inputSoundFile = new FileInputStream("spacemusic.au");
				AudioStream audioStream = new AudioStream(inputSoundFile);
				AudioPlayer.player.start(audioStream);
			}
			catch(IOException e){
				e.printStackTrace();
			}
	}//end main
	
}//end class
package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class Trance implements CompactDisc {
	private String title = "Wake me up";
	private String artist = "Avicii";
	
	public void play(){
		System.out.println("Playing" + title + "By" + artist);
	}
}

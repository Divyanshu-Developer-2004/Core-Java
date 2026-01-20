package Abstraction;

public interface MusicPlayer {
	
	void play();
	
	void pause();
	
	void stop();
}

class SpotifyPlayer implements MusicPlayer {
	
	public void play() {
		System.out.println("Spotify is Playing");
	}
	
	public void pause() {
		System.out.println("Spotify has Plaused");
	}
	
	public void stop() {
		System.out.println("Spotify has Stopped");
	}
}

class YouTubeMusicPlayer implements MusicPlayer {
	
	public void play() {
		System.out.println("YouTube is Playing");
	}
	
	public void pause() {
		System.out.println("YouTube has Plaused");
	}
	
	public void stop() {
		System.out.println("YouTube has Stopped");
	}
}
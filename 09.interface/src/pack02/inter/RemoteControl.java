package pack02.inter;

public interface RemoteControl {
	void turnOn();
	void turnOff();
	int MIN_VOLUME = 0;
	int MAX_VOLUME = 10;
	void setVolume(int volume);
}

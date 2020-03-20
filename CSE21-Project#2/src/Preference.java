
public class Preference {

	int quietTime;
	int music;
	int reading;
	int chatting;
	
	
	public Preference(int quietTime, int music, int reading, int chatting) {
		
		quietTime = 0;
		music = 0;
		reading = 0;
		chatting = 0;
		
		if (quietTime >= 0 && quietTime <= 10){
			this.quietTime = quietTime;	
		}
		
		if (music >= 0 && music <= 10){
			this.music = music;
		}
		
		if (reading >= 0 && reading <= 10){
			this.reading = reading;
		}
		
		if (chatting >= 0 && chatting <= 10){
			this.chatting = chatting;
		}

		
	}
	
	public int QuietTime(){
		return quietTime;
	}
	
	public int music(){
		return music;
	}
	
	public int reading(){
		return reading;
	}
	
	public int chatting(){
		return chatting;
	}
	
	public int totPref(Preference pref){
		int totPref = (this.quietTime - pref.quietTime) + (this.music - pref.music) + (this.reading - pref.reading) + (this.chatting - pref.chatting);
		return totPref;
	}
	
}

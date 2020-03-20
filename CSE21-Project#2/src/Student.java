
public class Student {

	private String name;
	private char gender;
	private Date birthday;
	private Preference pref;
	private boolean matched;
	
	
	public Student(String name, char gender, Date birthday, Preference pref){
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.pref = pref;
		
	}
	
	public void setName(){
		this.name = name;
	}
	
	public void setGender(){
		this.gender = gender;
	}
	
	public void setBirthday(){
		this.birthday = birthday;
	}
	
	public void setPref(){
		this.pref = pref;
	}
	
	public void setMatched(boolean b){ //mutator
		this.matched = matched;
	}
	
	public String Name(){ //accessor
		return name;
	}
	
	public char Gender(){
		return gender;
	}
	
	public Date birthday(){
		return birthday;
	}
	
	public Preference pref(){
		return pref;
	}
	
	public boolean matched(){
		return matched;
	}
	
	public int compare(Student st){
		int compScore = 0;
		System.out.println(this.name + " compare to " + st.name);
		if (gender != st.gender){
		return 0;
		}
		
		compScore = Math.abs((40 - pref.totPref(st.pref) ) + (60 - birthday.ageDiff(st.birthday)));
		System.out.println("40 - " + pref.totPref(st.pref) + " + " + "60 - " + birthday.ageDiff(st.birthday));
		if (compScore < 0){
			return 0;
		} 
		else if (compScore > 100){
			return 100;
		}
		return compScore;
	}
}

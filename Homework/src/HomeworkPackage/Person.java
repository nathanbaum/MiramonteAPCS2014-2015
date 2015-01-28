package HomeworkPackage;

public class Person {
	private String firstName, nickname;
	
	public Person(String firstName, String nickname){
		this.firstName = firstName;
		this.nickname = nickname;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getNickname(){
		return nickname;
	}
}

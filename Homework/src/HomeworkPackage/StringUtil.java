package HomeworkPackage;

import java.util.ArrayList;

public class StringUtil {

	public static void main(String[] args) {
		ArrayList<Person> peeps = new ArrayList<Person>();
		
		Person h = new Person("Henry", "Hank");
		Person e = new Person("Elizabeth", "Liz");
		Person j = new Person("John", "Jack");
		Person m = new Person("Margaret", "Peggy");
		
		peeps.add(h);
		peeps.add(e);
		peeps.add(j);
		peeps.add(m);
		
		System.out.println(replaceNameNickname("Henry and John walked Elizabeth and Margaret down the beach. John was happy.", peeps));
		System.out.println(replaceNameNickname("Henry married Margaret, who liked Henry's BFF, John, who dated Margaret's sister, Elizabeth, who is Henry's ex.", peeps));
	}

	public static String apcsReplaceAll(String str, String oldStr, String newStr){
		for(int i=0; i<str.length()-oldStr.length(); i++){
			if(oldStr.equals(str.substring(i, i+oldStr.length()))){
				str = str.substring(0, i) + newStr +str.substring(i+oldStr.length(), str.length());
			}
		}
		return str;
	}
	
	public static String replaceNameNickname(String str, ArrayList<Person> people){
		for(Person i : people){
			str = apcsReplaceAll(str, i.getFirstName(), i.getNickname());
		}
		return str;
	}
}

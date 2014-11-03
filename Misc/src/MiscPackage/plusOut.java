package MiscPackage;

public class plusOut {

public String plusOut(String str, String word) {
	String tempString;
	String newString = "";
			
	for(int i=0; i<word.length()/str.length(); i+=str.length()){
		tempString = word.substring(i, i+str.length());
		
		if(tempString.equals(str)) newString = newString + str;
		else newString = newString + "+";
	}
	System.out.println(newString);
}

}



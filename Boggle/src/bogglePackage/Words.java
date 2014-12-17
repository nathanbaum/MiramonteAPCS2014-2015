package bogglePackage;

public class Words {
	private String[] dictionary;
	private StringArrayBinarySearch dictSearch;
	
	public Words(String[] dictionary){
		this.dictionary = dictionary;
	}
	
	public boolean isWord(String word){
		dictSearch = new StringArrayBinarySearch(dictionary);
		
		if(dictSearch.searchFor(word)>-1) return true;
		return false;
	}
	
	public boolean notAlreadyIn(String word, String[] words){
		for(int i=0; i<words.length; i++){
			if(word.equals(words[i])) return false;
		}
		return true;
	}
}

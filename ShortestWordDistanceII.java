
public class ShortestWordDistanceII {
	
	String[] words;
	
	public ShortestWordDistanceII(String[] words) {
		this.words = words;
	}
	
	public int shortestWordDistance(String[] words, String word1, String word2) {
		
		int firstWord = -1;
		int secondWord = -1;
		int min = Integer.MIN_VALUE;
		for(int i = 0; i < words.length; i++) {
			if(words[i].equals(word1)) {
				firstWord = i;
			}
			else if(words[i].equals(word2)) {
				secondWord = i;
			}
			if(firstWord != -1 && secondWord != -1) {
				min = Math.abs(firstWord - secondWord);
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] string = {"practice", "makes", "perfect", "coding", "makes"};
		
		ShortestWordDistanceII instance = new ShortestWordDistanceII(string);
		
		System.out.println(instance.shortestWordDistance(string, "practice", "coding"));
		
	}

}

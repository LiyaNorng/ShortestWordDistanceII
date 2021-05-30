

/**
 * 
 * @author liyanorng
 *
 *
 Design a class which receives a list of words in the constructor, and implements a method that takes two words word1 and word2 and return the shortest distance between these two words in the list. Your method will be called repeatedly many times with different parameters. 

	Example:
	Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
	
	Input: word1 = “coding”, word2 = “practice”
	Output: 3
	Input: word1 = "makes", word2 = "coding"
	Output: 1
	Note:
	You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
 *
 *
 *
 */


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

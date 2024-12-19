import java.util.StringTokenizer;
class WordOccurrences{
  static int WordOccurrencesUsingIndexOf(String sentence,String word){
    int count = 0;
        int index = sentence.indexOf(word);
        //System.out.println(index);
        while (index != -1) {
            count++;
            index = sentence.indexOf(word, index + word.length());
            //System.out.println(index);
        }
    return count;
  }
  
  static int WordOccurrencesUsingSplit(String sentence,String word){
    String[] parts = sentence.split(word);
    int count = parts.length;
    if(!sentence.endsWith(word))
      count--;
    return count;
  }
  
  static int WordOccurrencesUsingTokenizer(String sentence,String word){
    StringTokenizer tokenizer = new StringTokenizer(sentence, word);
    int count = 0;
    System.out.println("Tokens:");
    while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
            count++;
    }
    return count;
  }
  
	static public void main(String[] args){
	  String sentence = "ITI develops people and ITI house of developers and ITI for people ITI";
    System.out.println("Number of occurrences using indexOf: " + WordOccurrencesUsingIndexOf(sentence,"ITI"));
    System.out.println("Number of occurrences using split: " + WordOccurrencesUsingSplit(sentence,"ITI"));
    System.out.println("Number of occurrences using Tokenizer: " + WordOccurrencesUsingTokenizer(sentence,"ITI"));
	} 
}

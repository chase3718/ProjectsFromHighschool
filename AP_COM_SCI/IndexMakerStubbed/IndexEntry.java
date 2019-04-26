import java.util.ArrayList;

public class IndexEntry
{
  private String word;
  private ArrayList<Integer> numsList;

  // Constructs an IndexEntry for a given word
  // (converted to upper case); sets numsList
  // to an empty ArrayList.
  public IndexEntry(String word)
  {
    word = word.toUpperCase();
	numsList = new ArrayList<Integer>();
  }

  // Returns the word of this IndexEntry object.
  public String getWord()
  {
  	return word;
  }

  // If num is not already in the list, adds num
  // at the end of this IndexEntry's list
  // of numbers.
  public void add(int lineNum)
  {
  	if (!numsList.contains(lineNum)); {
		numsList.add(lineNum);
	}
  }

  // Converts this IndexEntry into a string in the
  // following format: the word followed by a space, followed by
  // numbers separated by a comma and a space.
  public String toString()
  {
  	String result = "";

		if ( numsList.size() == 0) {
			return word;
		}

		result += word + " " ;

		for (int i = 0; i < numsList.size() - 1; i++) {
			result += numsList.get(i) + ", ";
		}
		result += numsList.get(numsList.size() - 1);

		return result;
  }
}

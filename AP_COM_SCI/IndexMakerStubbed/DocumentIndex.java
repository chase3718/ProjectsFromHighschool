import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>
{
  //  Creates an empty DocumentIndex with the default
  // initial capacity.
  public DocumentIndex()
  {
   	super();
  }

  //  Creates an empty DocumentIndex with a given
  //  initial capacity.
  public DocumentIndex(int initialCapacity)
  {
  	super(initialCapacity);
  }

  //  If word is not yet in this DocumentIndex,
  //  creates a new IndexEntry for word, and inserts
  //  it into this list in alphabetical order;
  //  adds lineNum to this word's IndexEntry by calling
  //  its add(num) method.
  public void addWord(String word, int lineNum){
  	word = word.toUpperCase();

		// System.out.println("Word: " + word + " Line Number Equals: " + num);


		for (IndexEntry e : this) {
			if (e.getWord().equals(word)) {
				e.add(lineNum);
				return;
			}
		}

		IndexEntry e = new IndexEntry(word);
		e.add(lineNum);

		if (this.size() == 0) {
			this.add(e);
			return;
		}
		else {
			for (int i = 0; i < this.size(); i++) {
				if( this.get(i).getWord().compareTo(word) > 0 ) {
					this.add(i, e);
					return;
				}

			}
		}
  }

  //  For each word in str, calls addWord(word, num).
  public void addAllWords(String str, int num)
  {
  	String[] strings;
		strings = str.split("\\W+");

		for (String s : strings) {
			if ( !s.equals("") )
				addWord(s, num);
		}
  }

  // Tries to find an IndexEntry with a given word in this
  // DocumentIndex.  If not found, inserts a new IndexEntry for
  // word at the appropriate place (in lexicographical order).
  // Returns the index of the found or inserted IndexEntry
  /*private int foundOrInserted(String word)
  {


  }*/
}

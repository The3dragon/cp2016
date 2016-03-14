package cp;

import com.sun.org.glassfish.external.statistics.Stats;
import java.nio.file.Path;
import java.util.List;

/**
 * 
 * @author Fabrizio Montesi <fmontesi@imada.sdu.dk>
 */
public class WordFinder
{
	/**
	 * Finds all the occurrences of a word in a directory.
	 * 
	 * The search is recursive: if the directory contains subdirectories,
	 * these are also searched and so on so forth (until there are no more
	 * subdirectories).
	 * 
	 * @param word the word to find
	 * @param dir the directory to search
	 * @return a list of results ({@link Result}), which tell where the word was found
	 */
	public static List< Result > findAll( String word, Path dir )
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Finds an occurrence of a word in a directory and returns.
	 * 
	 * This method searches only for one (any) occurrence of the word in the
	 * directory. As soon as one such occurrence is found, the search can be
	 * stopped and the method can return immediately.
	 * 
	 * As for method {@code findAll}, the search is recursive.
	 * 
	 * @param word
	 * @param dir
	 * @return 
	 */
	public static Result findAny( String word, Path dir )
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Computes overall statistics about the occurrences of words in a directory.
	 * 
	 * This method recursively searches the directory for all words and returns
	 * a {@link Stats} object containing the statistics of interest. See the
	 * documentation of {@link Stats}.
	 * 
	 * @param dir the directory to search
	 * @return the statistics of occurring words in the directory
	 */
	public static Stats stats( Path dir )
	{
		throw new UnsupportedOperationException();
	}
}
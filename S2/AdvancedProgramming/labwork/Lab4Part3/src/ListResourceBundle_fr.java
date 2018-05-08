import java.util.ListResourceBundle;


/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 03/03/2017
 *
 */
public class ListResourceBundle_fr extends ListResourceBundle{
	
	private static final Object[][] contents = {
		{"One", "Un"},
		{"Two", "Deux"},
		{"Three", "Trois"}
	};
	
	public Object[][] getContents(){
		return contents;
	}
}

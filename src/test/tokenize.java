package test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import com.code972.hebmorph.Reference;
import com.code972.hebmorph.Tokenizer;
import com.code972.hebmorph.hspell.HSpellLoader;

public class tokenize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		List<String> tokens = new ArrayList<String>();
		
		Reader r = new StringReader("המזרנים המיוחדים יהיו זמינים בחנויות לאחר החגים, לניסיון ורכישה. הרשת מאמינה שזה יהיה אחד המוצרים הטובים שלה אי פעם. מרטין בוקסדורף וצוות משרד יחסי הציבור ילוו את ההשקה כולה ויבטיחו את הצלחתה בפועל.");
        final Tokenizer tokenizer = new Tokenizer(r, HSpellLoader.readDefaultPrefixes());
        
        Reference<String> test = new Reference<String>("");

        try {
			while (tokenizer.nextToken(test) > 0) {
				System.out.println(test.ref);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

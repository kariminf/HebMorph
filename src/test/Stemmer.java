package test;

import java.util.List;


import com.code972.hebmorph.HebrewToken;
import com.code972.hebmorph.Lemmatizer;
import com.code972.hebmorph.hspell.HSpellLoader;

public class Stemmer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lemmatizer sf = new Lemmatizer(HSpellLoader.getDictHebMorph());
		
		List<HebrewToken> lht = sf.lemmatize("אותו");
		
		if (lht.size() < 1){
			System.out.println("same");
		}else{
			System.out.println(lht.get(0).getText());
			System.out.println(lht.get(0).getLemma());
		}

	}

}

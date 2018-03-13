
package wordnet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import net.didion.jwnl.JWNL;
import net.didion.jwnl.JWNLException;
import net.didion.jwnl.data.IndexWord;
import net.didion.jwnl.data.POS;
import net.didion.jwnl.data.Synset;
import net.didion.jwnl.dictionary.Dictionary;


public class WordNet {

    
    public static void main(String[] args) throws FileNotFoundException {
        try
        {
            //Database db = new Database();
            //db.getData();
            
            JWNL.initialize(new FileInputStream("C://Users//Aaron//Documents//NetBeansProjects//jwnl14-rc2//config//file_properties.xml"));
            Dictionary wordnet = Dictionary.getInstance();
            IndexWord word = wordnet.getIndexWord(POS.VERB,"run");
            Synset[] wordsenses = word.getSenses();
            
            
            for(Synset verbsense : wordsenses)
            {
                System.out.println(word + ": " + verbsense.getGloss());
            }
        }
        catch(JWNLException ex)
        {
            System.out.println("Cant find path");
        }
        
    }
    
}

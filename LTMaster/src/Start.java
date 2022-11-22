import java.util.Iterator;
import java.util.List;

public class Start {
    public static void main(String[] args) throws Exception {
        
        ParenthesisGen parenthesisGen = new ParenthesisGen();
        List<String> list = parenthesisGen.generateParenthesis(3);

        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}

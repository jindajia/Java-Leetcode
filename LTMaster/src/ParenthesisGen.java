import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ParenthesisGen {

    //Brute force
    class Solution1 {
        public boolean valid(char[] c_array) {
            int l=0,r=0;
            for (int i=0;i<c_array.length;i++) {
                if (r>l) {
                    return false;
                }
                if (c_array[i]=='(') {
                    l++;
                } else {
                    r++;
                }

            }
            return l==r;
        }
        public void getParenthesis(int pos, char[] c_array, List<String> l) {
            if (pos==c_array.length) {
                if (valid(c_array)) {
                    String s = new String(c_array);
                    l.add(s);
                }
            } else {
                c_array[pos] = '(';
                getParenthesis(pos+1, c_array, l);
                c_array[pos] = ')';
                getParenthesis(pos+1, c_array, l);
            }
        }
    }

    //BackTracking
    class Solution2{
        List<String> list;
        public void generate(StringBuilder cur, int open, int close, int max) {
            if (cur.length()==max*2) {
                list.add(cur.toString());
                return;
            }
            if (open<max) {
                cur.append('(');
                generate(cur, open+1, close, max);
                cur.deleteCharAt(cur.length()-1);
            }
            if (close<open) {
                cur.append(')');
                generate(cur, open, close+1, max);
                cur.deleteCharAt(cur.length()-1);
            }
        }
        public List<String> getAnswer(int n) {
            list = new LinkedList<>();
            generate(new StringBuilder(), 0, 0, n);
            return list;
        }
    }
    public List<String> generateParenthesis(int n) {
        char[] c = new char[n*2];
        LinkedList<String> list = new LinkedList<>();
        Solution1 s = new Solution1();
        // s.getParenthesis(0, c, list);
        Solution2 s2 = new Solution2();
        return s2.getAnswer(n);
    }
}

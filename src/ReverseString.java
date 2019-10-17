

public class ReverseString {
	public void reverseString(char[] s) {
        /*
        Stack<Character> stack = new Stack<Character>();
        for (char c: s){
            stack.push(c);
        }
        for (int i = 0; i < s.length; i ++){
            if (!stack.isEmpty()){
                Character out = stack.pop();
                s[i] = out;
                    
                }
            }
        */
        int i = 0;
        int j = s.length - 1;
        while (i<j) {
            char c = s[i];
            s[i] = s[j];
            s[j]= c;
            i++;
            j--;
        }
    }
}

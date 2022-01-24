class ValidParanthesis {
    public boolean isValid(String s) {
        char[] c=s.toCharArray();
        if(c.length == 1) return false;
        Stack<Character> p=new Stack();
        for (int i=0;i<c.length;i++){
            if(c[i]=='('){
                p.push(')');
            }else if(c[i]=='{'){
                p.push('}');
            }else if(c[i]=='['){
                p.push(']');
            }else if(p.isEmpty() || p.pop() != c[i]){
                return false;
            }
        }
        
        return p.isEmpty();
    }
}

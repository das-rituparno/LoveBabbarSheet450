/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        //Base Condition
        if(s.size() <= 1) return s;
        
        //Hypothesis
        int temp = s.pop();
        sort(s);
        
        //Induction
        return insert(s, temp);
    }
    
    public Stack<Integer> insert(Stack<Integer> s, int temp) {
        //Base Condition
        if(s.isEmpty() || s.peek() <= temp) {
            s.push(temp);
            return s;
        }
        
        //Hypothesis
        int last = s.pop();
        insert(s, temp);
        
        //Induction
        s.push(last);
        
        return s;
    }
}

/*
11 2 32 3 41
stack -> 
temp -> 
*/
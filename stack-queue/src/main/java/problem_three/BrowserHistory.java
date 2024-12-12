package problem_three;

import java.util.Stack;

// Create a class that manages browser history using two stacks
public class BrowserHistory {
    private Stack<String> history; // Stack for back history
    private Stack<String> forward;  // Stack for forward history
    private String currentUrl;
    public BrowserHistory(String url){
        history = new Stack<>();
        forward = new Stack<>();
        currentUrl = url;
        history.push(currentUrl);
    }
    public void visit(String url){
        history.push(url);
        forward.clear();
        currentUrl = url;
        System.out.println("Visited: " + currentUrl);
    }
    public void back(){
        if(history.size() > 1){
            forward.push(currentUrl);
            history.pop();
            currentUrl = history.peek(); // Update currentUrl to the new top of history
            System.out.println("Back to: " + currentUrl);
        }
        else{
            System.out.println("No history to go back to.");
        }
    }
    public void forward(){
        if(!forward.isEmpty()){
            currentUrl = forward.pop();
            history.push(currentUrl);
            System.out.println("Forward to: " + currentUrl);
        }
        else{
            System.out.println("No forward history.");
        }
    }
}

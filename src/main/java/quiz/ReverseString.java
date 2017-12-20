package quiz;

public class ReverseString {
    public String reverse(String input) {
    	String output="";
    	for(int i=(input.length())-1; i>-1;i--) {
    		if(i == input.length()-1) {
    			output = output.concat(input.substring(i));
    		}
    		else {
    			output = output.concat(input.substring(i, i+1));
    		}
    	}
        return output;
    }
    
   
}
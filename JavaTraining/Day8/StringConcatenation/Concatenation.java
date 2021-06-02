package Java8Ex;

import java.util.function.BiFunction;


public class Concatenation {
	
	    public static void main(String args[]){
	        BiFunction<String , String , String> concat = (String str1 , String str2) -> str1+str2;
	        
	        String str1="choco";
	        String str2="Truffle";
	        
	        concat.apply(str1,str2);
	        
	    }
	

}

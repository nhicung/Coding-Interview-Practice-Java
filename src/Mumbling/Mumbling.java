package Mumbling;

public class Mumbling {
	public static String accum(String s) {
	     // your code
	     String str = "";
	       for (int i=0; i<s.length(); i++){
	         char rest = Character.toLowerCase(s.charAt(i));
	         for (int j=0; j<i+1; j++){
	           if (j==0){
	             char first = Character.toUpperCase(s.charAt(i));
	             str += first;
	           }else{
	           str += rest;
	           }
	           }
	           if (i==s.length()-1){
	            break;
	           }else{
	            str += "-";
	           }  
	      }
	      return str;
	    }
}

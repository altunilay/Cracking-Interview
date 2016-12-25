import java.io.*;

public class OneAway {
	public static boolean isOneEdit(String str1, String str2){
		//insertion
		int diffCount=0;
		if((str2.length())-(str1.length())==1){
			for(int i=0; i<str1.length(); i++){
				if(str2.charAt(i)==str1.charAt(i)){
				}
				else{
					if(str2.charAt(i+1)!=str1.charAt(i)){
						return false;
					}
				}
			}
			return true;
		}
		//removal
		else if((str1.length())-(str2.length())==1){
			for(int i=0; i<str2.length(); i++){
				if(str2.charAt(i)==str1.charAt(i)){
				}
				else{
					if(str1.charAt(i+1)!=str2.charAt(i)){
						return false;
					}
				}
			}
			return true;
		}
		//replacement
		else if(str1.length()==str2.length()){
			for(int i=0; i<str2.length(); i++){
				if(str2.charAt(i)==str1.charAt(i)){
				}
				else{
					diffCount++;
				}
			}
			if(diffCount>1){
				return false;
			}
			else{
				return true;
			}
		}
		else{
			return false;
		}
	}
	public static void main(String[] args){
		System.out.println(isOneEdit("pale", "ple"));

	}
}
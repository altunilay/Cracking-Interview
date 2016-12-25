import java.io.*;

// Spaces and other charcters("./&6%$#()+@[1-9]") excluded
public class PalindromePermutation {
	public static boolean isPP(String str1){
		int oddNumber=0;
		int[] eng_alph= new int[26];
		for(int i=0; i<str1.length(); i++){
			if(str1.toLowerCase().charAt(i)-97>=0){
				eng_alph[str1.toLowerCase().charAt(i)-97]+=1;
			}
		}
		for(int i=0; i<26; i++){
			if(eng_alph[i]%2==1){			
				oddNumber++;
			}
		}
		if(oddNumber>1){
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		System.out.println(isPP("tact coat"));

	}
}
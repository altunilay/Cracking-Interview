import java.io.*;

// Spaces and other charcters("./&6%$#()+@[1-9]") excluded
public class CheckPermutation {
	public static boolean CheckPermutation(String str1, String str2){

		int[] eng_alph= new int[26];
		for(int i=0; i<str1.length(); i++){
			if(str1.toLowerCase().charAt(i)-97>=0){
				eng_alph[str1.toLowerCase().charAt(i)-97]+=1;
			}
		}
		for(int i=0; i<str2.length(); i++){
			if(str2.toLowerCase().charAt(i)-97>=0){			
				if(eng_alph[str2.toLowerCase().charAt(i)-97]<1){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args){
		System.out.println(CheckPermutation("dog","  goda///"));

	}
}
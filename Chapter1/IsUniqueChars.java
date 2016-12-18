import java.io.*;

//Assuming only English Letters [A-Z] && [a-z]

public class IsUniqueChars {
	public static boolean isUnique(String word){

		int[] eng_alph= new int[26];
		for(int i=0; i<word.length(); i++){
			if(word.toLowerCase().charAt(i)-97>=0){
				eng_alph[word.toLowerCase().charAt(i)-97]+=1;
					if(eng_alph[word.toLowerCase().charAt(i)-97]>1){
						return false;
					}
			}
		}
		return true;
	}
	public static void main(String[] args){
		System.out.println(isUnique("///.aBcDefGHiKlmnN"));

	}
}
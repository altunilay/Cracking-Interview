import java.io.*;

public class StringCompression {
	public static String compressStr(String str1){
		int count=0;
		StringBuilder result=new StringBuilder();   
		for(int i=0; i<str1.length(); i++){
			count++;
			if(i+1>= str1.length() || str1.charAt(i)!=str1.charAt(i+1)){
				result.append(str1.charAt(i));
				result.append(count);
				count=0;
			}
		}
		return result.length()<str1.length() ? result.toString() : str1;
	}
	public static void main(String[] args){
		System.out.println(compressStr("abbbbbb"));

	}
}
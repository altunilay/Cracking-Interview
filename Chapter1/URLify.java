import java.io.*;

public class URLify {
	public static void convert(char[] sentence, int givenLength){
		int spaces=0;
		for(int i=0; i<givenLength; i++){
			if(sentence[i] ==' '){
				spaces++;
			}
		}
		int endIndex=givenLength+(spaces*2);
		for(int t=givenLength-1; t>=0 ; t--){
			if(sentence[t]==' '){
				sentence[endIndex-1]='0';
				sentence[endIndex-2]='2';
				sentence[endIndex-3]='%';
				endIndex=endIndex-3;
			}else{
				sentence[endIndex-1]=sentence[t];
				endIndex--;
			}
		}
		String str = String.valueOf(sentence);
		System.out.println(str);
		
	}
	public static void main(String[] args){
		char[] charArray ={ 'a', ' ','b',' ', ' ',' ' }; 
		convert(charArray,3);
	}
}
import java.lang.*;

public class StringRotation{
	public static boolean isSubstring(String s1, String s2){
		return s1.contains(s2);

	}

	public static boolean isRotatedVersion(String s1, String s2){
		String newInput=s1+s1;
		return isSubstring(newInput,s2);
	}


	public static void main(String[] args){
		System.out.println(isRotatedVersion("erbottlewat","waterbottle"));

	}
}

public class Null01 {
	public static void main(String[] args) {
		String string1;
		string1 = "あいう";
		System.out.println(string1 + "の文字数:" + string1.length());
		string1 = "あ";
		System.out.println(string1 + "の文字数:" + string1.length());
		string1 = "イウエ";
		System.out.println(string1 + "の文字数:" + string1.length());	
		
		int[] array1 = new int[3];
		array1[0] = 60;
		array1[2] = 20;
		array1[1] = 20;
		int int2 = array1[0];
		System.out.println(int2);
		
	}
}

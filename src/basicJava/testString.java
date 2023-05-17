package basicJava;

public class testString {

	public static void main(String[] args) {
		
		//String name = "Manpreet_singh_HANDA";
		String name = new String("Manpreet_Singh_Handa");
		
		String name1 = new String("Manpreet_Singh_Handa");
		
		System.out.println("=========" + name.equals(name1));
		
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.replace("eet","it"));
		System.out.println(name.length());
		System.out.println(name.indexOf("singh")); //Returns the index within this string of the first occurrence of the specified substring. 
		System.out.println(name.trim());
		System.out.println(name.replace("Manpreet Handa", "ABCD DEFG"));
		System.out.println(name.replace("Handa", "SINGH"));
		
		
		String[] names = name.split("_");
		System.out.println("FN -- " + names[0]);
		System.out.println("MN -- " + names[1]);
		System.out.println("LN --" + names[2]);
		
		System.out.println(name.lastIndexOf("handa"));
		System.out.println(name.toLowerCase().lastIndexOf("handa")); //Returns the index within this string of the last occurrence of the specified substring
		
		System.out.println(name.substring(9));
		//Returns a string that is a substring of this string. Thesubstring begins with the character at the specified index and extends to the end of this string.
		System.out.println(name.substring(9,15)); 
	
		
		String kidName = "fn/mn_ln_afbfbskjfskjfskjdbfkjb";
		String[] kids = kidName.split("/");
		System.out.println(kids[1]);
		
	
	}
	/*
	 * concat()
	 * contains()
	 * equals()
	 * equalsIgnoreCase()
	 * length()
	 * indexof()
	 * replace()
	 * split()
	 * substring()
	 * toUpperCase()
	 * toLowerCase()
	 * trim()
	 */
	
}

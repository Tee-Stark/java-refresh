package basics;

public class StringManip {
	public static void main(String[] args) {
		// definition using literal
		String str1 = "Hello Java! What's good?";
		
		// definition using object
		String str2 = new String(" I'm Tim");
		/**
		 * Interesting methods to take note of:
		 * split()
		 * contains()
		 * replace()
		 * compareTo()
		 * trim() -> use strip()
		 * concat()
		 * indexOf()
		 * length()
		 * toUpperCase()
		 * toLowerCase()
		 * equals()
		 * substring()
		 * */
		System.out.println(str1.split(" ")[2]);
		System.out.println(str1.strip());
		
		// use StringBuffer for mutable strings -> 
		// e.g dealing with multiple threads that can modify a particular string
		// StringBuilder works like StringBuffer, but it is not thread-safe.
		// Where performance is critical and no need for multi-threading, it's best
		// to use StringBuilder, cos it is faster than StringBuffer.
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.capacity());
		buffer.append(str2.strip());
		System.out.println(buffer);
	}
}
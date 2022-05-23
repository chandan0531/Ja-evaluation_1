//Question 1:
/// -> String are immutable because if we denoted number of variable in one object.
//if one of the variable change the value of object, it will affected to all.


//String and String Builder
// 1. Performance : 
//	string : Slow performance as String Builder.
//	String Builder : Fast performance as String.
// 2. Mutability :
//	string : The string created by using the string class is immutable.
//	String Builder : The string created by using the stringBuilder class is mutable.
// 3. Nature :
//	string : ready only nature.
//	String : Dynamic in nature.

package com.massai;

public class StringQ1 {

	public static void main(String[] args) {
		String x = "a";
		String y = "b";
		System.out.println(x.compareTo(y));
		
		
		String name1 = "xyzabc";
		System.out.println(name1.length());
		
		System.out.println(name1.charAt(3));
		System.out.println(name1.substring(2));
		System.out.println(name1.indexOf("c"));
	}
	
	
}

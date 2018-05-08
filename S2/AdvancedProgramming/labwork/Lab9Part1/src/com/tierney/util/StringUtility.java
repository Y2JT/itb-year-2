/**
 * 
 */
package com.tierney.util;

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 15/03/2017
 *
 */
public class StringUtility {
	
	/**
     * @param s
     * @return value of s
     */
	public static int getSumOfAcsiiValues(String s){
		int value = 0;
		for(int i=0;i<s.length();i++){
			value = value + (int)((char)s.charAt(i));
		}//end for loop
		return value;
	}//end getSumOfAcsiiValues
	
	/**
     * @param s
     * @return value of s multiplied
     */
	public static int getProductOfAsciiValues(String s){
		int value = 1;
		for(int i=0;i<s.length();i++){
			value = value * (int)((char)s.charAt(i));
		}//end for loop
		return value;
	}//end getProductOfAsciiValues

}//end class

package StringReverse;
import java.lang.*;
import java.io.*;
import java.util.*;

public class StringReverse {
	public static void main(String[] args) {
		String input = "Lenovo";
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1=input1.reverse();
		for(int i = 0; i<input1.length(); i++)
			System.out.println(input1.charAt(i));
	}

}

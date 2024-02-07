package com.ashik.hackerrank;

public class BiggerIsGreater {

	public static void main(String[] args) {
		
		String str = "atedzcba";
		String subA = "";
		String subAb = "";
		int length = str.length() - 1;
		for(int i=length; i > 0; i--) {
			
			if(str.charAt(i) > str.charAt(i-1)) {
				String substr1 = str.substring(0, i-1);
				String substr2 = str.substring(i-1);
				int sublength = substr2.length()-1;
				while(substr2.charAt(0) >= substr2.charAt(sublength)) {
					sublength--;
				}
				String a = substr2.substring(sublength);
				if(a.length() > 2) {
					subA = a.substring(1);
					subAb = a.substring(0,1);
					StringBuilder sb=new StringBuilder(subA);  
				    sb.reverse(); 
				    subA = sb.toString();
				    a = subAb + subA;
				}
				
				String b = String.valueOf(substr2.charAt(0));
				String c = substr2.substring(1, sublength);
				StringBuilder sb=new StringBuilder(c);  
			    sb.reverse(); 
			    c = sb.toString();
				
				String finalString = substr1 + a + b + c;
				System.out.println(finalString);
			
				break;
			}
		}
		System.out.println("no answer");
	}

}

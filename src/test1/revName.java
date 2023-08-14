package test1;

public class revName {
public static void main(String[] args) {
	
	String name ="shubham mahajan";
    String rev="";
	
	System.out.println(name);
	for(int i=name.length()-1; i>=0; i--) {
		rev= rev+ name.charAt(i);
	}
	// rev= najaham mahbuhs
	
	String sp []= rev.split(" ");
	String last = sp[0];
	String first = sp[1];

	System.out.println(first+" "+last);
	
}
}

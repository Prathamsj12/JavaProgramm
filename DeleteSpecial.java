class Deletespecial{
public static void main(String args[]){
String s1="Hello?? how are you i am fine !! thank you.";
StringBuilder sb=new StringBuilder();
for(int i=0;i<s1.length();i++){
	char c=s1.charAt(i); 
	if(Character.isLetterOrDigit(c)||Character.isWhitespace(c))
		sb.append(c);
	}
}
System.out.println(sb);
	}
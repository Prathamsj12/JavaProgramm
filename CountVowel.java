import java.util.Arrays;
class Array
	{
	public static void main(String args[]){	
	String Str="Prathmesh";
	char[] ch=Str.toCharArray();
StringBuilder sb=new StringBuilder();
	for(int i=0;i<Str.length()-1;i++)
		{
			sb.append(ch);
	}	
		System.out.println(sb);
			}
}
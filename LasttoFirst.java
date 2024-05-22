class LasttoFirst{
public static void main(String [] args){
	String str="India";
StringBuilder sb=new StringBuilder();
sb.append(sb.charAt(sb.length()-1));
for(int i=0;i<str.length();i++){
sb.append(str.charAt(i));
System.out.println(sb);
		}
	}
}
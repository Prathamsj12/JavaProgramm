class toUpperCase{
public static void main(String args[]){
String str="Hello I am Java Developer";
String s2="AEIOUaeiou";
StringBuilder sb=new StringBuilder();
for(int i=0;i<str.length();i++){
	if(str.contains(String.ValueOf(str.charAt(i))))
		{
		sb.append(Character.toUpperCase(str.charAt(i)));
				}
	else
	{
sb.append(str.charAt(i));
		}
System.out.println(sb);
	
		}
	}
		}
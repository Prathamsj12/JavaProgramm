public class PaliOrNot {
    public static void main(String[] args) {

                String s1="Never odd or Even";
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<s1.length();i++)
			{
                   		 	if(Character.isAlphabetic(s1.charAt(i)))
                   	     sb.append(s1.charAt(i));
                    			if(sb.toString().equalsIgnoreCase(sb.reverse().toString()))
                    System.out.println("String is Palndrom");

        }
    }
}

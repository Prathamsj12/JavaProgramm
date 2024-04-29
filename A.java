class Big_Star1{
public static void main(String[] args){
   int n=5;
for(int i=1;i<=(n*2)-1;i++){
   if(i<=n)
     for(int j=i;j>=1;j--)
     System.out.print((char)(i+64));
   else
     for(int j=i;j<=(n*2)-1;j++)
    System.out.print("*");
       
System.out.println();
     }
   }
}


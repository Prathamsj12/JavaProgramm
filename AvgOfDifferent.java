class AvgOfDifferent{
public static void main(String args[]){
int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
int sum=0;
for(int i=0;i<ages.length-1;i++){
	sum+=ages[i];
	}
int Avg=sum/ages.length;
System.out.println(Avg);
	}
		}
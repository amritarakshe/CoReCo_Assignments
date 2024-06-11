package task.com;

public class PurchaseItem {
	
	public static void Purchase(int[] note,int rate)
	{
		int[] no= {10, 50, 100, 200};
		int total =0;
		
		for(int i=0;i<note.length;i++)
		{
			total=total+note[i]*no[i];
		}
		System.out.println(total);
		
		if(total>rate)
		{
			System.out.println("I Can Purchase");
		}
		
		else
		{
			System.out.println("I Need More Money");
		}
	}

	public static void main(String[] args) {
		int[] n1= {2,3,1,4};
		int pp=40;
		Purchase(n1,pp);
		
		

	}

	private static void Purchase(int[] n1, int pp) {
		// TODO Auto-generated method stub
		
	}

}

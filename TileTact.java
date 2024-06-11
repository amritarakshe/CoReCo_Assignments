package task.com;

public class TileTact {

	public static void main(String[] args) {
		
		PossibleBonus(3,7);
		PossibleBonus(1,9);
		PossibleBonus(5,3);

	}
	
	public static void PossibleBonus(int tile, int tile1)
	{
		int mtilemin = tile + 1;
		int mtilemax = tile + 6;
		
		int ftilemin = tile1 + 1;
		int ftilemax = tile1 + 6;
		
		if(mtilemin <= ftilemax && ftilemin <= mtilemax && tile != tile1)
		{
			System.out.println("true");
		}
		
		else
		{
			System.out.println("false");
		}
	}

}

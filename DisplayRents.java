// File: DisplayRents.java
// Programmer: Jennifer King
// Date: 10/15/18

public class DisplayRents 
{
	public static void main(String[] args)
	{
		int[][] rents = {{400, 450, 510},
						{500, 560, 630},
						{625, 676, 740},
						{1000, 1250, 1600}};
		int floor, rooms;
		
		for(floor = 0; floor < rents.length ; ++floor)
		{
			for(rooms = 0; rooms < rents[floor].length; ++rooms)
			{
				System.out.println("Floor " + (floor+1) + " Bedrooms " + rooms + " Rent is $" + rents[floor][rooms]);
			}
		}
	}
}


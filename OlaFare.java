import java.util.Scanner;

public class OlaFare
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance:");
		int distance=sc.nextInt();
		double fare=0;
		
		switch(distance)
		{
		case 1:
		case 2:
			fare=30;
			break;
			
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			fare=30+(distance-2)*15;
			break;
		
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			fare=105+(distance-6)*20;
			fare=fare+5;
			break;
		
		default:
			fare=185+(distance-11)*25;
			fare=fare+50;
			break;
		}
		
		System.out.println("The fare for "+ distance+" Km is:Rs."+fare);
	}

}

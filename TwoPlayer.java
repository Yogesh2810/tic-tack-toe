import java.util.Scanner;

public class TwoPlayer {
	static Scanner sc=new Scanner(System.in);
	static int mat[]= {0,-7,-7,-7,-7,-7,-7,-7,-7,-7};
	static int turn=1;
	public static void toggle()
	{
		if(turn==1)
		{turn=2;}
		else if(turn==2)
		{turn=1;}
	}
	public static void printboard() {
		System.out.println("--------------------");
		for(int i=1;i<=3;i++)
		{
			if(mat[i]==-7)
			{System.out.print("-\t");}
			if(mat[i]==1)
			{System.out.print("X\t");}
			if(mat[i]==2)
			{System.out.print("O\t");}
		}
		System.out.println("\n--------------------");
		for(int i=4;i<=6;i++)
		{
			if(mat[i]==-7)
			{System.out.print("-\t");}
			if(mat[i]==1)
			{System.out.print("X\t");}
			if(mat[i]==2)
			{System.out.print("O\t");}
		}
		System.out.println("\n--------------------");
		for(int i=7;i<=9;i++)
		{
			if(mat[i]==-7)
			{System.out.print("-\t");}
			if(mat[i]==1)
			{System.out.print("X\t");}
			if(mat[i]==2)
			{System.out.print("O\t");}
		}
		System.out.println("\n--------------------");
	}
	public static void checkvictory()
	{
		if((mat[1]+mat[2]+mat[3]==3)||(mat[1]+mat[2]+mat[3]==6))
		{
			mat[0]=mat[1];
		}
		if((mat[4]+mat[5]+mat[6]==3)||(mat[4]+mat[5]+mat[6]==6))
		{
			mat[0]=mat[4];
		}
		if((mat[7]+mat[8]+mat[9]==3)||(mat[7]+mat[8]+mat[9]==6))
		{
			mat[0]=mat[7];
		}
		if((mat[1]+mat[4]+mat[7]==3)||(mat[1]+mat[4]+mat[7]==6))
		{
			mat[0]=mat[1];
		}
		if((mat[2]+mat[5]+mat[8]==3)||(mat[2]+mat[5]+mat[8]==6))
		{
			mat[0]=mat[2];
		}
		if((mat[3]+mat[6]+mat[9]==3)||(mat[3]+mat[6]+mat[9]==6))
		{
			mat[0]=mat[3];
		}
		if((mat[1]+mat[5]+mat[9]==3)||(mat[1]+mat[5]+mat[9]==6))
		{
			mat[0]=mat[1];
		}
		if((mat[3]+mat[5]+mat[7]==3)||(mat[3]+mat[5]+mat[7]==6))
		{
			mat[0]=mat[3];
		}
		if(mat[0]!=0)
		{
			printboard();
			System.out.println("Player "+mat[0]+" Won ! Congratulations!");
			System.exit(turn);
		}
		
	}
	public static void choice(int k)
	{
		printboard();
		System.out.println("Player "+k+"'s Turn");
		int ch=sc.nextInt();
		if(ch>0&&ch<10&&mat[ch]==-7)
		{
			mat[ch]=k;
		}
		else
		{
			System.out.println("Invalid Input");
			choice(k);
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<9;i++)
		{
			choice(turn);
			checkvictory();
			toggle();
		}

	}

}

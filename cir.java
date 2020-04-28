import java.util.Scanner;

public class cir {
	public static void main(String[] args)
	{
		System.out.print("계산할 횟수를 입력하세요: ");
		Scanner in =new Scanner(System.in);
		int num = in.nextInt();
		int sign =1;
		double a=0.0;
		
		for(int i=1;i<2*num;i+=2)
		{
			a+=(double)sign/i;
			sign=-sign;
		}
		System.out.println(4*a);
	}

}

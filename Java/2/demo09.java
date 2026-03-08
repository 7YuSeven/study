import java.util.Scanner;

public class demo09{
	public static void main(String[] args){
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个整数");
		int a = sc.nextInt();
		
		System.out.println("输出的第一个数为");
		System.out.println(a);
		
		System.out.println("请输入第二个整数");
		int b = sc.nextInt();
		
		System.out.println("输出的第二个数为");
		System.out.println(b);
		
		System.out.println("两个数的和为");
		System.out.println(a + b);
	}
}
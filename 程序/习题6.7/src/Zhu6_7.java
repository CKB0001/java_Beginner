import java.io.*;
import java.util.Scanner;

public class Zhu6_7 {

	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		String name1="D:\\学习\\java\\程序\\习题6.7\\src\\001.txt";
		String name2="D:\\学习\\java\\程序\\习题6.7\\src\\002.txt";
		File w =new File(name1);
		BufferedWriter out=new BufferedWriter(new FileWriter(w));
		BufferedWriter in=new BufferedWriter(new FileWriter(name2));
		System.out .println("请输入你所想要排序的字母的个数");
		int num=sc.nextInt();
		System.out .println("请输入你所想要排序的字母");
		String a[],b;
		a=new String[num];
		
		for(int i=0;i<num;i++) 
		{	
			System.out .println("请输入第"+(i+1)+"个字母");
			a[i]=sc.next();
			out.write(a[i]);
			out.newLine();
		}
		
		out.close();
		
		for(int i=0;i<num-1;i++) 
		{
			for(int j=0;j<num-1-i;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					b=a[j];
					a[j]=a[j+1];
					a[j+1]=b;
				}
			}
		}
		for(int i=0;i<num;i++) 
		{
			in.write(a[i]);
			in.newLine();
			System.out .print(a[i]+"  ");
		}
		
		in.close();
		sc.close();
	}

}

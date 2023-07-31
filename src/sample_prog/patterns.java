package sample_prog;

public class patterns {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#pattern:1");
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
		System.out.println("#pattern:2");
        for(int i=1;i<=5;i++)
        {
        	for(int j=i;j<=5;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        System.out.println("#pattern:3");
        for(int i=1;i<=5;i++)
        {
        	for(int j=i;j>=1;j--)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("#pattern:4");
        for(int i=1;i<=5;i++)
        {
        	for(int j=i;j<=5;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        	
        	for(int k=i;k>=1;k--)
        	{
        		System.out.print(" ");
        	}
        	}
        System.out.println();
        System.out.println("#pattern:5");
        for(int i=1;i<=5;i++)
        {
        	for(int k=i;k<=5-1;k++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=i;j>=1;j--)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        	
        	}
        
        System.out.println("#pattern:6");
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5-i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int k=i;k>=1;k--)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        System.out.println("#pattern:7");
        for(int i=1;i<=5;i++)
        {
        	for(int j=i;j<=5;j++)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        	for(int k=i;k>=1;k--)
        	{
        		System.out.print(" ");
        	}
        }
        System.out.println();
        System.out.println("#pattern:8");
        for(int i=1;i<=5-1;i++)
        {
        	for(int j=1;j<=5-i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int k=i;k>=1;k--)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        
        for(int i=1;i<=5;i++)
        {
        	for(int j=i;j<=5;j++)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        	for(int k=i;k>=1;k--)
        	{
        		System.out.print(" ");
        	}
        }
        System.out.println();
        System.out.println("#pattern:9");
        for(int i=1;i<=5;i++)
        {
        	for(int j=i;j<=5;j++)
        	{
        		System.out.print("*"+" ");
        	}
        	System.out.println();
        	for(int k=i;k>=1;k--)
        	{
        		System.out.print(" ");
        	}
        }
        System.out.println();
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5-i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int k=i;k>=1;k--)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        System.out.println();
        System.out.println("#pattern:10");
        int p=1;
        for(int i=1;i<=5;i++)
        {
        	for(int j=i;j>=1;j--)
        	{
        		System.out.print(p+" ");
        		p++;
        	}
        	System.out.println();
        }
        

	}



}

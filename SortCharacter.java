



import java.util.*;
class SortCharacter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int x = sc.nextInt();
        
        char c[] = new char[x];
        char temp;
        System.out.println("enter characters");
        for(int i=0;i<x;i++)
        {
            c[i]=sc.next().charAt(0);
        }
        for(int i=0;i<c.length;i++)
		{
		   for(int j=i+1;j<c.length;j++) 
		   {
		       if(c[i]>(c[j]))
		       {
		       temp=c[i];
		       c[i]=c[j];
		       c[j]=temp;
		       }
		       
		   }
		}
		System.out.println(" ascending order ");
        for(int i=0;i<x;i++)
        {
            System.out.println(c[i]+ " ");
        }
        for(int i=0;i<c.length;i++)
		{
		   for(int j=i+1;j<c.length;j++) 
		   {
		       if(c[i]<(c[j]))
		       {
		       temp=c[i];
		       c[i]=c[j];
		       c[j]=temp;
		       }
		       
		   }
		}
		System.out.println(" descending order: ");
        for(int i=0;i<x;i++)
        {
            System.out.println(c[i]+ " ");
        }
    }
}

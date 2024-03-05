public class Addition
{
	public void add(int x,int y)
{
	System.out.println(x+y);	
}
	public void add (int x,int y,int z)
{
	System.out.println(x+y+z);
}
	public void add (int x,int y,double f,String s)
{
	System.out.println(x+y+f+s);
}

	public static void main(String args[])
{
	Addition a=new Addition();
	         a.add(10,12);
		 a.add(10,12,13);
		 a.add(10,12,13.1,"Add");
}



}

//Overloading Example
1.same class
2.same method name
3.different parameter
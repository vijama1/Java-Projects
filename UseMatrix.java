class UseMatrix
{
	public static void main(String args[])
	{
		
		Matrix m1=new Matrix();
		System.out.print("First Matrix is\n");
		m1.read();
		m1.show();
		
		Matrix m2=new Matrix(4,5);
		System.out.print("Second Matrix is\n");
		m2.read();
		
		m2.show();
		System.out.println();
		Matrix m3=new Matrix(m2);
		System.out.print("Third Matrix is");
		m3.read();
		m3.show();
	}
}
	
class Test extends Thread
{
	public void run()
	{
		System.out.println("hi :"+Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.start();
		for (int i=0;i<5 ;i++ ) 
		{
			System.out.println("ok");
		}
		
	}
}
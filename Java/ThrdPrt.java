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
	}
}
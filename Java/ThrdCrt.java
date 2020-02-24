//create thread by extends
class Test extends Thread
{
	public void run()
	{
		System.out.println("hi :"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("hello :"+Thread.currentThread().getName());

		Test t1 = new Test();
		t1 . start();

		Test t2 = new Test();
		t2 . start();

		for (int i=1;i<10;i++ ) 
		{
			System.out.println("ok");
		}
	}
}
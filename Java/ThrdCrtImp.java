class Test implements Runnable{
	public void run()
	{
		System.out.println("thread created");
	}
	public static void main(String[] args) {
		Test ob = new Test();
		Thread t1 = new Thread(ob);
		t1.start();
	}
}
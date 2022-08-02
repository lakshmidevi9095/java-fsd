public class threadclass extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		threadclass mt = new  threadclass();
  		mt.start();
 	}
}
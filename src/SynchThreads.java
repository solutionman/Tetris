

class First
{
    public void call(String msg)
    {
        System.out.println("This message we get from First class: " + msg);
    }

}


public class SynchThreads
{
    public static void main(String args[])
    {
        System.out.println("This message from the main class SynchThreads");

        First getmessage = new First();
        getmessage.call("hello");


        Second message2 = new Second();
        message2.call("tetris.jpg");
    }


}


class Second
{
    public void call(String msg)
    {
        System.out.println("This is second message from second class");
    }
}
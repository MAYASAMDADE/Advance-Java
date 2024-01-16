/*Write a java program which will display name and priority of current thread. 
Change name of Thread to MyThread and priority to 2. Display the details of Thread. */
public class Slip17A
{
    public static void main(String arg[])throws Exception
    {
        Thread t=Thread.currentThread();
        System.out.println("Name of the current Thread : "+ t.getName());
        System.out.println("Priority of the current Thread : "+t.getPriority());
        t.setName("MyThread");
        t.setPriority(2);
        System.out.println("Details of the Thread : "+t);
    }
}

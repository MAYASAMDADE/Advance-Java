/*A)Write a multithreading program in java to display all vowels from a given String. */
public class Slip2A {
    public static void main(String arg[])throws Exception
    {
        String s=arg[0];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
            System.out.println("\t"+ch);
            }
            Thread.sleep(500);
        }
    }
}

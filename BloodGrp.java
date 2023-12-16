import java.io.*;
class BloodGrp
{
    public static void main(String args[])
    {
        int c1=0;
        int ca=0;
        int cb=0;
        String[] a={"O","A","O","AB","A","B","AB","B","A"};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=="O"|| a[i]=="AB")
            {
               c1++; 
            }
            else if(a[i]=="A")
            {
                ca++;
            }
            else{
                cb++;
            }
        }
        int b=Math.max(ca,cb);
        System.out.println(c1+b);

    }
}
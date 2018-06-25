import java.io.*;
import java.util.*;
class thread5
{
    public static void main(String args[])
    {
		wrtv v4=new wrtv();
        ReadFile rf=new ReadFile(v4);
        ReadFromVector rl=new ReadFromVector(v4);
        rf.start();
        rl.start();
    }
}
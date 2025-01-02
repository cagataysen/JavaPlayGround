package org.EffectiveJava.Chapter2.item8a9;

//Item 8: Avoid finalizers and cleaners
//Item 9: Prefer try-with-resources to try-finally

import java.io.*;
import java.util.Scanner;

//Item 8: Avoid finalizers and cleaners
//Item 9: Prefer try-with-resources to try-finally
/**
 * A resource must implement the AutoCloseable interface, which consists of a
 * single void-returning close method. Many classes and interfaces in the Java
 * libraries and in third-party libraries now implement or extend AutoCloseable. If
 * you write a class that represents a resource that must be closed, your class should
 * implement AutoCloseable too.
 */


public class ItemNineTest {
    private static final int BUFFER_SIZE = 0;

    // 1
    static String firstLineOfFile(String path, String defaultVal) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try
        {
            return br.readLine();
        }
        catch (IOException e)
        {
            return defaultVal;
        }
        finally
        {
            br.close();
        }
    }

    static String firstLineOfFileWell(String path, String defaultVal)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            return br.readLine();
        }
        catch (IOException e)
        {
            return defaultVal;
        }
    }

    // 3
    static void copy(String src, String dst) throws IOException
    {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst))
        {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }

    public static void main(String[] args) {
        // try-catch-finally
//		Scanner scanner = null;
//		try
//		{
//		    scanner = new Scanner(new File("C:\Users\Komp\Desktop\Projects\JavaPlayGround\src\main\java\org\EffectiveJava\Chapter02\CreatingAndDestroyingObjects\item8a9\text.txt"));
//		    while (scanner.hasNext())
//		    {
//		        System.out.println(scanner.nextLine());
//		    }
//		}
//		catch (FileNotFoundException e)
//		{
//		    e.printStackTrace();
//		}
//		finally
//		{
//		    if (scanner != null)
//		    {
//		    	System.out.println("Hello");
//		        scanner.close();
//		    }
//		}
//
//		// try-with-resources - try(Resources)
//		try (Scanner scanner2 = new Scanner(new File("C:\Users\Komp\Desktop\Projects\JavaPlayGround\src\main\java\org\EffectiveJava\Chapter02\CreatingAndDestroyingObjects\item8a9\text.txt")))
//		{
//		    while (scanner2.hasNext())
//		    {
//		        System.out.println(scanner2.nextLine());
//		    }
//		}
//		catch (FileNotFoundException e)
//		{
//			System.out.println("Hello");
//		    e.printStackTrace();
//		}


        // 2
//		try
//		{
//			int data = 25 / 0;
//			System.out.println(data);
//		}
//		catch (NullPointerException e) {System.out.println("Ali");}
//		finally
//		{
//			//int data = 25 / 0;
//			System.out.println("working always");
//		}
//


        // Try catch Finaly!

//		try
//		{
//			int data=25/5;
//			System.out.println(data);
//		}
//		catch(NullPointerException e){System.out.println(e);}
//		finally{System.out.println("working always");}


        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            //int data = 25 / 0;
            System.out.println("working always");
        }


    }

    }

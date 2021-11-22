import MD5.MD5;
import SHA1.SHA1;
import SHA256.SHA256;
import SHA3_256.SHA3_256;
import SHA3_512.SHA3_512;
import SHA512.SHA512;

import java.util.Scanner;

/**
 * Project name(项目名称)：散列算法
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/22
 * Time(创建时间)： 18:17
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        String str;
        if (args.length == 0)
        {
            System.out.print("输入一行：");
            Scanner input = new Scanner(System.in);
            str = input.nextLine();
        }
        else
        {
            StringBuilder StringBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++)
            {
                StringBuilder.append(args[i]);
            }
            str = StringBuilder.toString();
        }
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        System.out.println("MD5:");
        System.out.println(MD5.getMD5(str));
        System.out.println(MD5.getMD5toUpperCase(str));
        System.out.println("SHA1:");
        System.out.println(SHA1.getSHA1(str));
        System.out.println(SHA1.getSHA1toUpperCase(str));
        System.out.println("SHA256:");
        System.out.println(SHA256.getSHA256(str));
        System.out.println(SHA256.getSHA256toUpperCase(str));
        System.out.println("SHA512:");
        System.out.println(SHA512.getSHA512(str));
        System.out.println(SHA512.getSHA512toUpperCase(str));
        System.out.println("SHA3-256:");
        System.out.println(SHA3_256.getSHA3_256(str));
        System.out.println(SHA3_256.getSHA3_256toUpperCase(str));
        System.out.println("SHA3-512:");
        System.out.println(SHA3_512.getSHA3_512(str));
        System.out.println(SHA3_512.getSHA3_512toUpperCase(str));
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}

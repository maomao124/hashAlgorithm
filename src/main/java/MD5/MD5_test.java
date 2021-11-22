package MD5;

/**
 * Project name(项目名称)：散列算法
 * Package(包名): MD5
 * Class(类名): MD5_test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/22
 * Time(创建时间)： 12:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class MD5_test
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        String s = "123";
        System.out.println(MD5.getMD5(s));  //202cb962ac59075b964b07152d234b70 202cb962ac59075b964b07152d234b70
        System.out.println(MD5.getMD5("1234"));  //81dc9bdb52d04dc20036dbd8313ed055  81dc9bdb52d04dc20036dbd8313ed055
        System.out.println(MD5.getMD5("456789"));//e35cf7b66449df565f93c607d5a81d09  e35cf7b66449df565f93c607d5a81d09
        System.out.println(MD5.getMD5toUpperCase("456789"));  //e35cf7b66449df565f93c607d5a81d09 E35CF7B66449DF565F93C607D5A81D09
        for (int i = 0; i < 1000; i++)
        {
            System.out.println(MD5.getMD5(String.valueOf(i))); //
        }
        //99  :  ac627ab1ccbdb62ec96e702f07f6425b
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

public class Sample12
{
	public static void main(Stringhd[] args)
	{
        System.out.println("1+2等於"+(1+2));
        System.out.println("3*4等於"+(3*4));  

        int num1 =10;
        int num2 =5;

        System.out.println("num1和num2的各種運算:");
        System.out.println("num1+num2等於"+ (num1+num2));
        System.out.println("num1-num2等於"+ (num1-num2));
        System.out.println("num1*num2等於"+ (num1*num2));
        System.out.println("num1/num2等於"+ (num1/num2));
        System.out.println("num1%num2等於"+ (num1%num2));

        int a = 0;
        int b = 0;
        int c = 0;

        b = a++;
        c = ++a;

        System.out.println("因為是在指定值之後才遞增,所以b的值為"+ b);
        System.out.println("因為是在遞增之後才指定值,所以c的值為"+ c);
    }
}

package test;

public class Zifu {
    public static void main(String[] args) {
    	 char c = 'A';
         short s = 80;
          
         //虽然short和char都是16位的，长度是一样的
         //但是彼此之间，依然需要进行强制转换
         s = (short) c;
         int d=10;
         int f=s+d;
         //直接进行转换，会出现编译错误
        System.out.println(c==s);
        System.out.println(f);
        long l = 900000000;
        int i = 900000000;
         
        //int比较小，要放进比较大的long,随便怎么样，都放的进去
       // l = i;
        System.out.println(l==i);
        
        System.out.println(Integer.toBinaryString(d));
        
       // s=(short)d;
       // System.out.println(s);
        d=s;
        System.out.println(d);
        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toBinaryString(80));
	}
}

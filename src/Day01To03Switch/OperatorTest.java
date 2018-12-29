package Day01To03Switch;

/*
++,--的练习题

第一题：
int a = 10;
int b = 10;
int c = 10;

a = b++;  a=10 b=11 c=10
c = --a;  c=9   a=9  b=11
b = ++a;  a=10 b=10  c=9
a = c--;  c=8 a=9 b=10
请分别计算出a,b,c的值

第二题：
int x = 4;   x=5 x=      4+6+6*10=70 
int y = (x++)+(++x)+(x*10); 5+5+50=60 5
请分别计算出x,y的值   
*/
class OperatorTest {
public static void main(String[] args) {
	int a = 10;
	int b = 10;
	int c = 10;

	a = b++; //a=10,b=11,c=10
	c = --a; //a=9,b=11,c=9
	b = ++a; //a=10,b=10,c=9
	a = c--; //a=9,b=10,c=8
	
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	System.out.println("c:"+c);
	System.out.println("--------------");
	
	int x = 4;
	int y = (x++)+(++x)+(x*10);
	//4+6+60
	//x=5,6
	
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	
	int s = 1,z = 1;
   
if(s++==1 || ++z==1)
{
	s =7;
}
System.out.println("s="+s+",z="+z);
	
int q = 1,e = 1;    
if(q++==1 & ++e==1)
{
q =7;
}
System.out.println("q="+q+",e="+e);

int d = 1,k = 1;    
if(d++==1 && ++k==1)
{
d =7;
}
System.out.println("d="+d+",k="+k);


int i = 1,p = 1;

if(i++==1 | ++p==1)
{
	i =7;
}
System.out.println("i="+i+",y="+p);


}
}
class paracons
{
int roll;
String name; 
paracons(int a,String b)
{
roll=a;
name=b;
}
void display()
{
System.out.println("Roll no. : "+roll);
System.out.println("Name : "+name);
}
public static void main (String args[]){
paracons d =new paracons(1,"Rutuja");
d.display();
}
}


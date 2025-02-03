class defcons
{
int roll;
String name; 
defcons()
{
roll=1;
name="Raj";
}
void display()
{
System.out.println("Roll no. : "+roll);
System.out.println("Name : "+name);
}
public static void main (String args[]){
defcons d =new defcons();
d.display();
}
}



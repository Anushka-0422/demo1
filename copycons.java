class copycons{
int roll;
String name;
copycons(int a, String b){
roll=a;
name=b;
}
copycons(copycons x){
roll=x.roll;
name=x.name;
}
void display(){
System.out.println("Roll no.: "+roll);
System.out.println("Name : "+name);
}
public static void main(String args[]){
copycons c=new copycons(1,"Rutu");
copycons c1=new copycons(c);
c.display();
c1.display();
}
}
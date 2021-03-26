interface Drawing
{  
void draw();  
static int cube(int x)  //using the static function here because interface abstract methods cannot have body
{
    return x*x*x;
}  
}  
class Square implements Drawing
{  
public void draw()
{
    System.out.println("drawing square");
    
}  
}  
  
class Main
{  
public static void main(String args[])
{  
Drawing d=new Square();  
d.draw();  
System.out.println(Drawing.cube(3));  
}
}  

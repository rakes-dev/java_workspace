import java.util.*;

class Area
{
  float length,breadth;
  Area(float l, float b)
  {
    length = l;
    breadth = b;
  }
  float setDim()
  {
    float area = length*breadth;
    return area;
  }
  void getArea()
  {
    System.out.println("Area of rectangle is: " + setDim());
  }

  public static void main(String[] args)
  {
    float l,b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of Rectangle: ");
    l = sc.nextFloat();
    System.out.println("Enter breadth of Rectangle: ");
    b = sc.nextFloat();
    Area a = new Area(l,b);
    a.setDim();
    a.getArea();
  }
}

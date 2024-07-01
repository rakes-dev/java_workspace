

class Operation
{
  int square(int n)
  {
    return n*n;
  }
}

class Circle
{
  Operation op;

  double pi=3.14;

  double area(int radius)
  {
    op = new Operation();
    int rsquare= op.square(radius);
    return pi*rsquare;
  }
}

class aggregation
{
  public static void main(String[] args)
  {
    Circle c = new Circle();
    System.out.println(c.area(4));
  }
}

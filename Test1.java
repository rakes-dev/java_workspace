class Shape{
	public double getArea(double l, double b){
		return 0;
	}
}
class Rectangle extends Shape{
	public double getArea(double l, double b){
		return l*b;
	}
}
class Test1{
	public static void main(String[] args){
		double area;
		Shape r = new Rectangle();
		
		area = r.getArea(2,4);
		
		System.out.println("Area of Rectangle: " + area);
	}
}

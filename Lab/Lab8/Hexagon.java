//Hexagon
//By Charles Clark
//12-21-2015
//Beginner's Java

public class Hexagon extends GeometricObject {

	private double side = 1.0;
	private double HexArea = 0.0;
	private double HexPerimeter = 0.0;

	//Create Perimeter and Area
	public Hexagon(double s) {
		side = s;
		HexArea = (((3*Math.sqrt(3))/2)*Math.pow(side,2));
		HexPerimeter = 6*side;
	}
	//Create Perimeter and Area with Default Side
    public Hexagon() {
    	HexArea = (((3*Math.sqrt(3))/2)*Math.pow(side,2));
    	HexPerimeter = 6*side;
    }
    //getter methods
    public double getArea(){
    	return HexArea;
    }
    public double getPerimeter(){
    	return HexPerimeter;
    }
    //Polymorphism Compare to Object o
    public int compareTo(Object o) {

    	Hexagon x = new Hexagon(side);

    	if (x.compareTo(o)<0) {
    		return 1;
    	}
    	else if (x.compareTo(o)==0) {
    		return 0;
    	}
    	else if (x.compareTo(o)>0) {
    		return -1;
    	}
    		return -1;

	}
}
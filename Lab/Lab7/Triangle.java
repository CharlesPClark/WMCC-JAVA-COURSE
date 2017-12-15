//Triangle
//By Charles Clark
//12-21-2015
//Beginner's Java

public class Triangle extends GeometricObject{

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	private boolean blnscalene;
	private boolean blnisolceles;
	private boolean blnequilateral;
	private boolean blnright;

	//Declare Three Sides For Hexagon -> Constructor
	public Triangle(double s1, double s2, double s3) {

		side1 = s1;
		side2 = s2;
		side3 = s3;

	}
	//Default Constructor
    public Triangle() {

    	side1 = 1.0;
    	side2 = 1.0;
    	side3 = 1.0;

    }
    //Grab either side1,side2,side3 -> getter method
    public double getSide1() {
    	return side1;
    }

    public double getSide2() {
    	return side2;
    }

    public double getSide3() {
    	return side3;
    }
    //Replace either side1,side2,side -> setter method
    public void setSide1(double s1) {
        side1 = s1;
    }

    public void setSide2(double s2) {
        side2 = s2;
    }

    public void setSide3(double s3) {
        side3 = s3;
    }
	//find area of triangle
    public double findArea() {
        return (side1 + side2 + side3) / 2;
    }
    //find perimenter of triangle
    public double findPerimeter() {
        return side1 + side2 + side3;
    }
    //Check if it is either equilateral,isoceles,or scalence
    public boolean isEquilateral() {

      if ((side1 == side2) && (side1 == side3)) {
      	 blnequilateral = true;
         return true;
      }

      else {
      	 blnequilateral = false;
         return false;
      }


   }

    public boolean isIsoceles() {
    	if (((side1 == side2) && (side1 != side3)) || ((side1 == side3) && (side1 != side2)) || ((side2 == side3) && (side2 != side1))) {
    		blnisolceles = true;
         	return true;
    	}

        else {
      	   blnisolceles = false;
           return false;
      }

    }

    public boolean isScalence() {
    	if ((side1 != side2) && (side1 != side3) && (side2 != side3)) {
    		blnscalene = true;
            return true;
    	}
        else {
        	blnscalene = false;
            return false;
        }

    }
    //check is triangle is right
    public boolean isRight() {
    	if (((side1*side1) == ((side2*side2) + (side3*side3))) || ((side2*side2) == ((side1*side1) + (side3*side3))) || ((side3*side3) == ((side1*side1) + (side2*side2)))) {
    	   blnright = true;
           return true;
    	}

       else {
       	  blnright = false;
          return false;
       }

    }
    //returns triangle information
    public String toString() {

    	return "Side 1 = " + side1 + "/n" + "Side 2 = " + side2 + "/n" + "Side 3 = " + "/n" + "Is Equilateral: " + blnequilateral + "/n" + "Is Isoceles: " + blnisolceles + "/n" + "Is Scalence: " + blnisolceles + "/n" + "Is Right: " + blnright;
    }


}
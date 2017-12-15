public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
    public Rectangle(int xcor, int ycor, int w, int h) {
    	super(xcor,ycor);
    	width = w;
    	height = h;
    	
    }
    
    public int getWidth() {
    	return width;
    }
    public int getHeight() {
    	return height;
    }
    
    public void setWidth(int w) {
    	width = w;
    }
    
    public void setHeight(int h) {
    	height = h;
    }
    
    
}
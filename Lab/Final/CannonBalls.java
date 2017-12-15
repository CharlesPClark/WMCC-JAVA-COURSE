//Final CannonBalls
//By Charles Clark
//12-21-2015
//Beginner's Java


public class CannonBalls{

	//Method Use to check if it can be recursive
    public int countCannonballs(int intheight) {
		if (intheight == 0) {
			return (0);
		}
		//Will Do Recursive Action if Height Does not Equal Zero
		else {
			return (intheight * intheight + countCannonballs(intheight - 1));
		}
	}
}
//Final Hero
//By Charles Clark
//12-21-2015
//Beginner's Java


public class Hero {

	//Declaration of Variables
	private String HeroName;
	private	String[] HeroPowers;
	private String HeroPowerList;
	private int i;

	//Default Constructor
    public Hero() {
    	HeroName="";
    }
    //Constructor
    public Hero(String name,String[] powers) {

   		HeroName = name;
   		HeroPowers = powers;

    }
    //getter methods
    public String getName() {

    	return HeroName;

    }

    public String[] getPowers() {

    	return HeroPowers;

    }
    //setter method
    public void setName(String name) {

    	HeroName = name;

    }

    //Show Powers of Hero
    public String listPowers() {

    	for (i = 0; i < HeroPowers.length; i++) {


    		HeroPowerList += HeroPowers[i];
    		if (i != HeroPowers.length) {
    			HeroPowerList += ",";
    		}

		}
		return HeroPowerList;

    }

    //Returns if power is the same as HeroPowers
    public boolean hasPower(String power) {

    	for (i = 0; i < HeroPowers.length; i++) {
    		if (power == HeroPowers[i]) {
    			return true;
    		}
		}
		return false;
    }



}
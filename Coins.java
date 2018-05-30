/**
 * 
/**
 * 
 * Tom Abraham
 * period  # 1
 */
public class Coins {
	private int cents;

	/**
	 * constructor to initialize the instance variables
	 * @param money - amount for which the change is to
	 * 			be computed
	 */
	public Coins(int money)
	{
		cents = money;
	}
	/**
	 * method to calculate the change
	 * @param money the amount for which the change is 
	 * 			to be computed
	 */
	public void change()
	{
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;

		int rQuarter = ((cents / quarter));
		int rDime = (cents - (rQuarter*25)) / dime;
		int rNickel = (cents - ((rDime*10) + (rQuarter*25))) / nickel;
		int rPenny = (cents - ((rNickel*5) + (rDime*10) + (rQuarter*25))) / penny; 
		
		System.out.println(cents + " cents =>");
		System.out.println("Quarter(s)     " + rQuarter);
		System.out.println("Dime(s)        " + rDime);
		System.out.println("Nickel(s)      " + rNickel);
		System.out.println("Penny(s)       " + rPenny);
	}

}

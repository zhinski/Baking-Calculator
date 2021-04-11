package baking_calculator;

//Michael Dobrzanski

public class BakingCalculator {	
	public static void main(String[] args) {
		System.out.println("Testing totalCost...");
		System.out.println(totalCost (24, 1));
		System.out.println(totalCost (39, 1));
		System.out.println(totalCost (80, 8));
		System.out.println(totalCost (96, 10));
		System.out.println(totalCost (97, 10));
		System.out.println(totalCost (9000, 100));
		System.out.println(packagesOfButter (80, 8));
	}
	public static int bagsOfFlour(int cookieCount, int loafCount) {
		double flourPerCookie = 2.25 / 48;
		double flourPerLoaf = 1.5;
		double cupsPerBagFlour = 50 / 3;
		double totalFlour = (flourPerCookie * cookieCount) + (flourPerLoaf * loafCount);
		return (int) Math.ceil(totalFlour / cupsPerBagFlour);
	}

	public static int containersOfSalt(int cookieCount, int loafCount) {
		double saltPerCookie = 1 / 48;
		double saltPerLoaf = 0.125;
		double saltPerContainer = 6 * 26;
		double totalSalt = (saltPerCookie * cookieCount) + (saltPerLoaf * loafCount);
		return (int) Math.ceil(totalSalt / saltPerContainer);
	}

	public static int boxesOfBakingSoda(int cookieCount, int loafCount) {
		double bakingSodaPerCookie = 1 / 48;
		double bakingSodaPerLoaf = 1;
		double bakingSodaPerContainer = 6 * 16;
		double totalBakingSoda = (bakingSodaPerCookie * cookieCount) + (bakingSodaPerLoaf * loafCount);
		return (int) Math.ceil(totalBakingSoda / bakingSodaPerContainer);
	}

	public static int bottlesOfVanilla(int cookieCount, int loafCount) {
		double vanillaPerCookie = 1 / 48;
		double vanillaPerLoaf = 1;
		double vanillaPerBottle = 6;
		double totalVanilla = (vanillaPerCookie * cookieCount) + (vanillaPerLoaf * loafCount);
		return (int) Math.ceil(totalVanilla / vanillaPerBottle);
	}

	public static int cartonsOfEggs(int cookieCount, int loafCount) {
		double eggsPerCookie = 2 / 48;
		double eggsPerLoaf = 1;
		double eggsPerDozen = 12;
		double totalEggs = (eggsPerCookie * cookieCount) + (eggsPerLoaf * loafCount);
		return (int) Math.ceil(totalEggs / eggsPerDozen);
	}

	public static int bagsOfSugar(int cookieCount, int loafCount) {
		double sugarPerCookie = 1.5 / 48;
		double sugarPerLoaf = 0.75;
		double cupsPerBagSugar = 2;
		double totalSugar = (sugarPerCookie * cookieCount) + (sugarPerLoaf * loafCount);
		return (int) Math.ceil(totalSugar / cupsPerBagSugar);
	}

	public static int packagesOfButter(int cookieCount, int loafCount) {
		double butterPerCookie = 1;
		double butterPerLoaf = 16;
		double butterPerPackage = 48;
		double totalButterPerCookie = butterPerCookie * cookieCount;
		double totalButterPerLoaf = butterPerLoaf * loafCount;
		double totalButter = totalButterPerCookie + totalButterPerLoaf;
		double pleaseWork = (totalButter / butterPerPackage);
		return (int) Math.ceil(pleaseWork); 
	}

	public static int bananas(int cookieCount, int loafCount) {
		int bananaPerCookie = 0;
		int bananaPerLoaf = 3;
		int totalBanana = (bananaPerCookie * cookieCount) + (bananaPerLoaf * loafCount);
		return totalBanana;  
	}

	public static int bagsOfChocolateChips(int cookieCount, int loafCount) {
		double chipsPerCookie = 2.5 / 48;
		double chipsPerLoaf = 0;
		double cupsPerBagChips = 2;
		double totalChips = (chipsPerCookie * cookieCount) + (chipsPerLoaf * loafCount);
		return (int) Math.ceil(totalChips / cupsPerBagChips);  
	}

	public static double totalCost(int cookieCount, int loafCount) {
		double flourPrice = 1.79;
		double saltPrice = 1.09;
		double bakingSodaPrice = 1.09; 
		double vanillaPrice  = 3.99; 
		double eggsPrice  = 2.19; 
		double sugarPrice  = 1.99;
		double butterPrice  = 4.49;
		double bananaPrice  = 0.32;
		double chipsPrice  = 3.29;
		return flourPrice * bagsOfFlour(cookieCount, loafCount) + 
				saltPrice * containersOfSalt(cookieCount, loafCount) + 
				bakingSodaPrice * boxesOfBakingSoda(cookieCount, loafCount) + 
				vanillaPrice * bottlesOfVanilla(cookieCount, loafCount) + 
				eggsPrice * cartonsOfEggs(cookieCount, loafCount) + 
				sugarPrice * bagsOfSugar(cookieCount, loafCount) + 
				butterPrice * packagesOfButter(cookieCount, loafCount) + 
				bananaPrice * bananas(cookieCount, loafCount) + 
				chipsPrice * bagsOfChocolateChips(cookieCount, loafCount);
		
	}	
}
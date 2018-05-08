/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public class FoodClassifier {
	
	enum FoodType{
		MEAT, VEG, DAIRY;
	}//end enum FoodType
	
	public static String getSampleFood(FoodType food){
		String foodResult = null;
		
		if(food==FoodType.MEAT){
			foodResult = "Ham";
		}//end if
		else if(food==FoodType.VEG){
			foodResult = "Carrot";
		}//end else if
		else if(food==FoodType.DAIRY){
			foodResult = "Cheese";
		}//end else if
		
		return foodResult;
	}//end getSampleFood

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FoodType food1 = FoodType.MEAT;
		FoodType food2 = FoodType.VEG;
		FoodType food3 = FoodType.DAIRY;
		
		System.out.println(getSampleFood(food1));
		System.out.println(getSampleFood(food2));
		System.out.println(getSampleFood(food3));

	}//end main

}//end class
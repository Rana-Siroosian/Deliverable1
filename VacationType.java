import java.util.Scanner;

public class VacationType {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String VacationType;
		int groupSize;
		String result;
		String destination ="";
		String travelSuggestion = "";
		
		String prompt1 = "What kind of trip would you like to go on, musical, tropical, or adventurous? ";
		System.out.print(prompt1);
		VacationType = scanner.next();
		System.out.println();
		
		String prompt2 = "How many are in your group? ";
		System.out.print(prompt2);
		groupSize = scanner.nextInt();
		System.out.println();
		
		if (VacationType.compareTo("musical") == 0) {
			destination = "New Orleans";
		}
		else if (VacationType.compareTo ("tropical")== 0) {
			destination = "beach vacation in Mexico";
		}
		else if (VacationType.compareTo ("adventurous")== 0){
			destination = "whitewater rafting the Grand Canyon";
		}
		if (groupSize >= 1 && groupSize <= 2) {
			travelSuggestion = "first class";
		}
		else if (groupSize >= 3 && groupSize <= 5) {
			travelSuggestion = "helicopter";
		}
		else if (groupSize >= 6) {
			travelSuggestion = "charter flight";
		}
		result = "Since you're a group of " +groupSize + " going on a " + VacationType + " vacation, you should take a " + travelSuggestion + " to "+
		destination + ".";
		
		System.out.println(result);
	}
}
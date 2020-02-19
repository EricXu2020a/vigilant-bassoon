package ConsumerLab;
import java.io.File;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	int max =   Review.starRating("src/ConsumerLab/simpleReview.txt");
	System.out.println(max);
	//System.out.println(Review.sentimentVal("hi"));
	  
	
	//test reading from files
	//read in the positive adjectives in postiveAdjectives.txt
	try {
	Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
	while(input.hasNextLine()){
	String temp = input.nextLine().trim();
	System.out.println(temp);

	}
	input.close();
	}
	catch(Exception e){
	System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
	}
  }
}
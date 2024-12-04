//Class: CMSC203 CRN 202520
// Program: Assignment #5
// Instructor: Khandan Vahabzadeh Monshi
// Summary of Description: (In this program we use rigged arrays to help mickey and minnie with their distribution of holiday bonuses.) 
// Due Date: MM/DD/YYYY (<12/03/2024>)
// Integrity Pledge: I pledge that I have completed the programming assignment independently.
// I have not copied the code from a student or any source.
//Student Name: Borhawwe Debelo

package the;


public class HolidayBonus {



	    private static final double HIGH_BONUS = 5000.0; 
	    private static final double LOW_BONUS = 1000.0;  
	    private static final double OTHER_BONUS = 2000.0; 

	    public static double[] calculateHolidayBonus(double[][] thesales) {
	        int numberofstores = thesales.length;
	        double[] thebonus = new double[numberofstores]; 
	        int maximumcol = 0;
	        for (double[] row : thesales) {
	            if (row.length > maximumcol) {
	                maximumcol = row.length;
	            }
	        }

	        for (int clmn = 0; clmn < maximumcol; clmn++) {
	            double highest = TwoDimRaggedArrayUtility.getHighestInColumn(thesales, clmn);
	            double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(thesales, clmn);

	            for (int row = 0; row < numberofstores; row++) {
	                if (clmn < thesales[row].length) {
	                    double amount = thesales[row][clmn];
	                    if (amount == highest) {
	                        thebonus[row] += HIGH_BONUS;
	                    } else if (amount == lowest) {
	                        thebonus[row] += LOW_BONUS;
	                    } else {
	                        thebonus[row] += OTHER_BONUS;
	                    }
	                }
	            }
	        }

	        return thebonus;
	    }

	    // 2. Method calculateTotalHolidayBonus
	    public static double calculateTotalHolidayBonus(double[][] thesales) {
	        double[] thebonus = calculateHolidayBonus(thesales);
	        double totalBonus = 0.0;

	        for (double thebonuses : thebonus) {
	            totalBonus += thebonuses;
	        }

	        return totalBonus;
	    }}
	

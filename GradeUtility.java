public class GradeUtility {

  public static char determineLetterGrade(double average) {
		char letter = 'x';
		
		if (average >= 90) 
			letter = 'A';
		else if (average >= 80)
			letter = 'B';
		else if (average >= 70)
			letter = 'C';
		else if (average >= 60)
			letter = 'D';
		else 
			letter = 'F';
  return letter;
  }

}
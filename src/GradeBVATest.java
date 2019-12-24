import junit.framework.TestCase;

public class GradeBVATest extends TestCase {
	private int min = 0;
	private int max = 100;
	LetterGrade letterGrade = new LetterGrade();
	
	public void testGradeMinMinus10() {
		assertEquals('X', LetterGrade.letterGrade(min-10));
	}

	public void testGradeMin() {
		assertEquals('F', LetterGrade.letterGrade(min));
	}
	
	public void testGradeMinPlus60() {
		assertEquals('D', LetterGrade.letterGrade(min+60));
	}
	
	public void testGradeMaxMinus20() {
		assertEquals('B', LetterGrade.letterGrade(max-20));
	}

	public void testGradeMax() {
		assertEquals('A', LetterGrade.letterGrade(max));
	}

	public void testGradeMaxPlus10() {
		assertEquals('X', LetterGrade.letterGrade(max+10));
	}

	public void testGradeBetweenMinAndMax() {
		assertEquals('C', LetterGrade.letterGrade(75));
	}
}

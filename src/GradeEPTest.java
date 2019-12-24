import junit.framework.TestCase;

public class GradeEPTest extends TestCase {
	LetterGrade letterGrade = new LetterGrade();
	
	public void testGradeX() {
		assertEquals('X', LetterGrade.letterGrade(-1));
		assertEquals('X', LetterGrade.letterGrade(200));
	}

	public void testGradeA() {
		for (int i = 90; i <= 100; i++)
			assertEquals('A', LetterGrade.letterGrade(i));
	}
	
	public void testGradeB() {
		for (int i = 80; i < 90; i++)
			assertEquals('B', LetterGrade.letterGrade(i));
	}
	
	public void testGradeC() {
		for (int i = 70; i < 80; i++)
			assertEquals('C', LetterGrade.letterGrade(i));
	}

	public void testGradeD() {
		for (int i = 60; i < 70; i++)
			assertEquals('D', LetterGrade.letterGrade(i));
	}

	public void testGradeF() {
		assertEquals('F', LetterGrade.letterGrade(55));
	}
}



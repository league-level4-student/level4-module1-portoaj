package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	static void horoscope(Zodiac Sign)
	{
		switch(Sign)
		{
			case ARIES:
				JOptionPane.showMessageDialog(null, "something", "horoscope", 0);
				break;
			case TAURUS:
				JOptionPane.showMessageDialog(null, "something", "horoscope", 0);
				break;
			case GEMINI:
				JOptionPane.showMessageDialog(null, "something", "horoscope", 0);
				break;
			case CANCER:
				JOptionPane.showMessageDialog(null, "something", "horoscope", 0);
				break;
			case LEO:
				JOptionPane.showMessageDialog(null, "something", "horoscope", 0);
				break;
			case VIRGO:
				JOptionPane.showMessageDialog(null, "something", "horoscope", 0);
				break;
			case LIBRA:
				JOptionPane.showMessageDialog(null, "something", "horoscope", 0);
				break;
			case SCORPIO:
				JOptionPane.showMessageDialog(null, "something", "horoscope", 0);
				break;
			case SAGITTARIUS:
				JOptionPane.showMessageDialog(null, "something", "horoscope", 0);
				break;
			case CAPRICORN:
				JOptionPane.showMessageDialog(null, "something", "horoscope", 0);
				break;
			case AQUARIUS:
				JOptionPane.showMessageDialog(null, "something", "horoscope", 0);
				break;
			case PISCES:
				JOptionPane.showMessageDialog(null, "something", "horoscope", 0);
				break;
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		horoscope(Zodiac.ARIES);
	}
}

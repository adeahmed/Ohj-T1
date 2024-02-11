package laskin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
 
// Tässä käytetään ParameterizedTest -annotaatiota
// Parametriparit taulukossa (comma separated values)
 
public class NelioTest {

	@ParameterizedTest
	@CsvSource({"1, 1", "2, 4", "3, 9", "4, 16", "5, 25"})
	public void testaaNelio(int luku, int odotettuTulos) {
		Laskin laskin = new Laskin();
		laskin.square(luku);
		assertEquals(odotettuTulos, laskin.getResult());

	}
}

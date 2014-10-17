package romanNumerals;

import static org.junit.Assert.*;
import org.junit.Test;

public class RomanTest {

	Roman r = new Roman();
	
	@Test
	public void testCheckParam() {
		
		assertFalse(r.checkParam(0));
		assertFalse(r.checkParam(-1));
		assertFalse(r.checkParam(4000));
		assertTrue(r.checkParam(1));
		assertTrue(r.checkParam(3999));
	}

	@Test
	public void testGenerate() throws Exception {

		assertEquals("Error, generate(1) should return 'I'", "I", r.generate(1) );
		assertEquals("Error, generate(2) should return 'II'", "II", r.generate(2) );
		assertEquals("Error, generate(3) should return 'III'", "III", r.generate(3) );
		assertEquals("Error, generate(10) should return 'X'", "X", r.generate(10) );
		assertEquals("Error, generate(11) should return 'XI'", "XI", r.generate(11) );
		assertEquals("Error, generate(20) should return 'XX'", "XX", r.generate(20) );
		assertEquals("Error, generate(23) should return 'XXIII'", "XXIII", r.generate(23) );
		assertEquals("Error, generate(32) should return 'XXXII'", "XXXII", r.generate(32) );
		assertEquals("Error, generate(4) should return 'IV'", "IV", r.generate(4) );
		assertEquals("Error, generate(5) should return 'V'", "V", r.generate(5) );
		assertEquals("Error, generate(9) should return 'IX'", "IX", r.generate(9) );
		assertEquals("Error, generate(19) should return 'XIX'", "XIX", r.generate(19) );
		assertEquals("Error, generate(40) should return 'XL'", "XL", r.generate(40) );
		assertEquals("Error, generate(49) should return 'XLIX'", "XLIX", r.generate(49) );
		assertEquals("Error, generate(50) should return 'L'", "L", r.generate(50) );
		assertEquals("Error, generate(60) should return 'LX'", "LX", r.generate(60) );
		assertEquals("Error, generate(67) should return 'LXVII'", "LXVII", r.generate(67) );
		assertEquals("Error, generate(90) should return 'XC'", "XC", r.generate(90) );
		assertEquals("Error, generate(99) should return 'XCIX'", "XCIX", r.generate(99) );
		assertEquals("Error, generate(101) should return 'CI'", "CI", r.generate(101) );
		assertEquals("Error, generate(299) should return 'CCXCIX'", "CCXCIX", r.generate(299) );
		assertEquals("Error, generate(357) should return 'CCCLVII'", "CCCLVII", r.generate(357) );
		assertEquals("Error, generate(400) should return 'CD'", "CD", r.generate(400) );
		assertEquals("Error, generate(500) should return 'D'", "D", r.generate(500) );
		assertEquals("Error, generate(600) should return 'DC'", "DC", r.generate(600) );
		assertEquals("Error, generate(738) should return 'DCCXXXVIII'", "DCCXXXVIII", r.generate(738) );
		assertEquals("Error, generate(897) should return 'DCCCXCVII'", "DCCCXCVII", r.generate(897) );
		assertEquals("Error, generate(900) should return 'CM'", "CM", r.generate(900) );
		assertEquals("Error, generate(999) should return 'CMXCIX'", "CMXCIX", r.generate(999) );
		assertEquals("Error, generate(1000) should return 'M'", "M", r.generate(1000) );
		assertEquals("Error, generate(1111) should return 'MCXI'", "MCXI", r.generate(1111) );
		assertEquals("Error, generate(1982) should return 'MCMLXXXII'", "MCMLXXXII", r.generate(1982) );
		assertEquals("Error, generate(2257) should return 'MMCCLVII'", "MMCCLVII", r.generate(2257) );
		assertEquals("Error, generate(3999) should return 'MMMCMXCIX'", "MMMCMXCIX", r.generate(3999) );
		
	}
	
	@Test(expected = Exception.class)
	public void testInvalidInputException() throws Exception {
		
	    r.generate(4000);
	    
	}

}

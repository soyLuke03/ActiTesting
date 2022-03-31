package com.java.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java.model.Model;

class Tests {

//	@Test
//	void testCapicua() {
//		assertEquals(Model.capicua(121), true);
//		assertEquals(Model.capicua("1221"), true);
//		assertEquals(Model.capicua(1221), true);
//		assertEquals(Model.capicua(122.1), false);
//		assertEquals(Model.capicua("122.1"), false);
//		assertEquals(Model.capicua(121.121), true);
//		assertEquals(Model.capicua(123), false);
//		assertEquals(Model.capicua(1223), false);
//		
//	}
	
	@Test
	void testAnagrama() {
		assertEquals(Model.anagrama("Hola"), false);
	}
	@Test
	void testAnagrama2() {
		assertEquals(Model.anagrama("HolaaloH"), true);
	}
	@Test
	void testAnagrama3() {
		assertEquals(Model.anagrama("HoloH"), true);
	}	
	@Test
	void testAnagrama4() {
		assertEquals(Model.anagrama("HollaH"), true);
	}


		
	}

}

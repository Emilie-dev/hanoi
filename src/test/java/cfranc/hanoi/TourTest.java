package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	Tour t = new Tour();
	Disque d = new Disque(1);
	Disque dSmall = new Disque(1);
	Disque dMedium = new Disque(2);
	Disque dTall = new Disque (3);


	@Test
		public void empiler_TourVide_True() {
			boolean expected = true;
			boolean actual = t.empiler(d);
			assertEquals(expected, actual);
		}

	@Test
		public void taille_Tour() {
			int expected = 1;
			t.empiler(d);
			int actual = t.taille();
			assertEquals(expected, actual);
		}
	@Test
		public void TourPleine() {
			boolean expected = true;
			Disque dSmall = new Disque(1);
			Disque dMedium = new Disque(2);
			Disque dTall = new Disque (3);
			t.empiler(dTall);
			t.empiler(dMedium);
			t.empiler(dSmall);
			boolean actual = t.estPleine();
			assertEquals(expected, actual);
		}

		@Test
		public void TourVide() {
			boolean expected = true;
			Disque dSmall = new Disque(1);
			Disque dMedium = new Disque(2);
			Disque dTall = new Disque (3);
			t.depiler();
			boolean actual = t.estVide();
			assertEquals(expected, actual);
		}
	}

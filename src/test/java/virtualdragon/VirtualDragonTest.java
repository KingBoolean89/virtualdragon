package virtualdragon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualDragonTest {

	@Test
	public void shouldHaveName() {
		VirtualDragon underTest = new VirtualDragon("", "", 0, 0, 0);

		String result = underTest.getname();

		assertEquals("", "");
	}

	@Test
	public void shouldHaveDescription() {
		VirtualDragon underTest = new VirtualDragon("", "", 0, 0, 0);

		String result = underTest.getdescription();

		assertEquals("", "");
	}

	@Test
	public void shouldHaveHungerLevel() {
		VirtualDragon underTest = new VirtualDragon("", "", 7, 0, 0);

		int result = underTest.gethungerLevel(0);

		assertEquals(50, 50);
	}

	@Test
	public void shouldHaveThirstLevel() {
		VirtualDragon underTest = new VirtualDragon("", "", 7, 0, 0);

		int result = underTest.getfireLevel();

		assertEquals(50, 50);
	}

	@Test
	public void shouldHaveBloodThirstLevel() {
		VirtualDragon underTest = new VirtualDragon("", "", 7, 0, 0);

		int result = underTest.getThirstLevel(0);

		assertEquals(50, 50);
	}

}

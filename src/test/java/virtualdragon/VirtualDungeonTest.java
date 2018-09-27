package virtualdragon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class VirtualDungeonTest {
	@Test
	public void shouldReturnDragon() {
		VirtualDungeon underTest = new VirtualDungeon();

		underTest.addDragon("King", "K");
		underTest.addDragon("John", "Q");

		Collection<VirtualDragon> result = underTest.getDragons();

		assertThat(result, contains(new VirtualDragon("", "", 0, 0, 0), new VirtualDragon("", "", 0, 0, 0)));
	}

	@Test
	public void shouldAddDragon() {
		VirtualDungeon underTest = new VirtualDungeon();

		underTest.addDragon("", "");
		underTest.addDragon("", "");

		Collection<VirtualDragon> result = underTest.getDragons();

		assertThat(result, contains(new VirtualDragon("", "", 0, 0, 0), new VirtualDragon("", "  ", 0, 0, 0)));
	}

	@Test
	public void shouldRemoveDragon() {
		VirtualDungeon underTest = new VirtualDungeon();

		underTest.addDragon("King", "");
		underTest.addDragon("", "");
		underTest.removeDragon(null);

		Collection<VirtualDragon> result = underTest.getDragons();

		assertThat(result, contains(new VirtualDragon("", "", 0, 0, 0), new VirtualDragon("", "  ", 0, 0, 0)));
	}

	@Test
	public void shouldfeedAll() {
		VirtualDragon underTest = new VirtualDragon("", "", 0, 0, 0);

		underTest.feed();
		Map<String, VirtualDragon> dragons = new HashMap<String, VirtualDragon>();

		assertEquals(3, underTest.getHungerLevel());
	}

	@Test
	public void shouldGiveFireStoneToAll() {
		VirtualDragon underTest = new VirtualDragon("", "", 0, 0, 0);
		Map<String, VirtualDragon> dragons = new HashMap<String, VirtualDragon>();

		assertEquals(3, underTest.getHungerLevel());
	}

	@Test
	public void shouldGoOnQuestWithDragon() {
		VirtualDragon underTest = new VirtualDragon("", "", 0, 0, 0);

		underTest.quest();

		assertEquals(3, underTest.getThirstLevel(3));
	}

	@Test
	public void shouldtickAll() {
		VirtualDragon underTest = new VirtualDragon("", "", 0, 0, 0);
		Map<String, VirtualDungeon> dragons = new HashMap<String, VirtualDungeon>();

		assertEquals(-1, underTest.getHungerLevel());
	}

	private void assertThat(Collection<VirtualDragon> result, Object contains) {
		// TODO Auto-generated method stub

	}

	private Object contains(VirtualDragon virtualDragon, VirtualDragon virtualDragon2) {
		// TODO Auto-generated method stub
		return true;
	}

}

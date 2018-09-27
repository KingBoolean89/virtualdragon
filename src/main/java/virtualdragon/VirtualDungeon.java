package virtualdragon;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class VirtualDungeon {
	int turns = 25;
	public Map<String, VirtualDragon> dragons = new HashMap<String, VirtualDragon>();

	public Collection<VirtualDragon> getDragons() {
		return dragons.values();
	}

	public void tick() {

		turns--;
	}

	public void addDragon(String name, String type) {
		VirtualDragon dragon = new VirtualDragon(name, type, 50, 50, 50);
		dragons.put(dragon.getname(), dragon);
	}

	public void removeDragon(VirtualDragon dragon) {

		dragons.remove(dragon.getname(), dragon);
		// TODO Auto-generated method stub

	}

	public void feed() {
		for (VirtualDragon dragon : dragons.values()) {
			dragon.feed();
		}
	}

	public void fire() {
		for (VirtualDragon dragon : dragons.values()) {
			dragon.fire();
		}
	}

	public void quest() {
		for (VirtualDragon dragon : dragons.values()) {
			dragon.quest();
		}
	}

	public static void removeDragons() {
		// TODO Auto-generated method stub

	}

}

package virtualdragon;

public class VirtualDragon {

	private final String NAME;
	private final String DESCRIPTION;
	public int HUNGER_LEVEL = 50;
	public int FIRE_LEVEL = 50;
	public int THIRST_LEVEL = 50;
	public int turns = 25;

	public VirtualDragon(String name, String description, int hungerLevel, int fireLevel, int thirstLevel) {
		this.NAME = name;
		this.DESCRIPTION = description;
		this.HUNGER_LEVEL = hungerLevel;
		this.FIRE_LEVEL = fireLevel;
		this.THIRST_LEVEL = thirstLevel;
	}

	public String getname() {
		return NAME;

	}

	public String getdescription() {

		return DESCRIPTION;
	}

	public int gethungerLevel(int hunger) {
		// TODO Auto-generated method stub
		return getHungerLevel();
	}

	public int getfireLevel() {
		// TODO Auto-generated method stub
		return FIRE_LEVEL;
	}

	public int getThirstLevel(int Thirst) {
		// TODO Auto-generated method stub
		return THIRST_LEVEL;
	}

	public void feed() {
		setHungerLevel(getHungerLevel() + 3);
		// TODO Auto-generated method stub

	}

	public void fire() {
		FIRE_LEVEL += 3;
		// TODO Auto-generated method stub

	}

	public void quest() {
		THIRST_LEVEL += 3;
		// TODO Auto-generated method stub

	}

	public int getThirstLevel() {
		return THIRST_LEVEL;
	}

	public void put(String getname, VirtualDragon dragon) {
		// TODO Auto-generated method stub

	}

	public void remove(VirtualDragon dragon) {
		// TODO Auto-generated method stub

	}

	public int getHungerLevel() {
		return HUNGER_LEVEL;
	}

	public void setHungerLevel(int hungerLevel) {
		this.HUNGER_LEVEL = hungerLevel;
	}

	public void tick() {
		HUNGER_LEVEL--;
		THIRST_LEVEL--;
		FIRE_LEVEL--;
		turns--;
	}

	public void values() {
		getHungerLevel();
		getThirstLevel();
		getfireLevel();

	}

	public void addDragon(String string, String string2) {
		// TODO Auto-generated method stub

	}

}

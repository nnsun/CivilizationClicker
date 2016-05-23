package Game;

public class Resources {
    private int gold;
    private int food;
    private int production;
    private int science;
    private int culture;

    private int usedLand;
    private int totalLand;
    private int expansions;

    private int cottages;
    private int hamlets;
    private int villages;
    private int towns;

    private int farms;
    private int irrigatedFarms;
    private int fertilizedFarms;
    private int GMcropFarms;

    private int mines;
    private int ironMines;
    private int coalMines;
    private int uraniumMines;

    private int libraries;
    private int universities;
    private int publicSchools;
    private int researchLabs;

    private int monuments;
    private int monasteries;
    private int theaters;
    private int broadcastTowers;

    private int strength;

    // constructor for all resources, land stats, buildings, and military
    // strength
    public Resources() {
	gold = 0;
	food = 0;
	production = 0;
	science = 0;
	culture = 0;

	usedLand = 0;
	totalLand = 1;
	expansions = 0;

	cottages = 0;
	hamlets = 0;
	villages = 0;
	towns = 0;

	farms = 0;
	irrigatedFarms = 0;
	fertilizedFarms = 0;
	GMcropFarms = 0;

	mines = 0;
	ironMines = 0;
	coalMines = 0;
	uraniumMines = 0;

	libraries = 0;
	universities = 0;
	publicSchools = 0;
	researchLabs = 0;

	monuments = 0;
	monasteries = 0;
	theaters = 0;
	broadcastTowers = 0;

	strength = 0;
    }

    // getter methods for all variables
    public int getGold() {
	return gold;
    }

    public int getFood() {
	return food;
    }

    public int getProduction() {
	return production;
    }

    public int getScience() {
	return science;
    }

    public int getCulture() {
	return culture;
    }

    public int getUsedLand() {
	return usedLand;
    }

    public int getTotalLand() {
	return totalLand;
    }

    public int getExpansions() {
	return expansions;
    }

    public int getCottages() {
	return cottages;
    }

    public int getHamlets() {
	return hamlets;
    }

    public int getVillages() {
	return villages;
    }

    public int getTowns() {
	return towns;
    }

    public int getFarms() {
	return farms;
    }

    public int getIrrigatedFarms() {
	return irrigatedFarms;
    }

    public int getFertilizedFarms() {
	return fertilizedFarms;
    }

    public int getGMcropFarms() {
	return GMcropFarms;
    }

    public int getMines() {
	return mines;
    }

    public int getIronMines() {
	return ironMines;
    }

    public int getCoalMines() {
	return coalMines;
    }

    public int getUraniumMines() {
	return uraniumMines;
    }

    public int getLibraries() {
	return libraries;
    }

    public int getUniversities() {
	return universities;
    }

    public int getPublicSchools() {
	return publicSchools;
    }

    public int getResearchLabs() {
	return researchLabs;
    }

    public int getMonuments() {
	return monuments;
    }

    public int getMonasteries() {
	return monasteries;
    }

    public int getTheaters() {
	return theaters;
    }

    public int getBroadcastTowers() {
	return broadcastTowers;
    }

    public int getMilitaryStrength() {
	return strength;
    }

    // getter methods for resource per second modifiers that come from buildings
    // Tier 4 buildings are 125 times more effective than T1 buildings, T3
    // builings are 30 times more effective, and T2 buildings are 5 times more
    // effective
    public int getGoldPerSecond() {
	int goldPerSecond = cottages + (5 * hamlets) + (30 * villages) + (125 * towns);
	return goldPerSecond;
    }

    public int getFoodPerSecond() {
	int foodPerSecond = farms + (5 * irrigatedFarms) + (30 * fertilizedFarms) + (125 * GMcropFarms);
	return foodPerSecond;
    }

    public int getProductionPerSecond() {
	int productionPerSecond = mines + (5 * ironMines) + (30 * coalMines) + (125 * uraniumMines);
	return productionPerSecond;
    }

    public int getSciencePerSecond() {
	int sciencePerSecond = libraries + (5 * universities) + (30 * publicSchools) + (125 * researchLabs);
	return sciencePerSecond;
    }

    public int getCulturePerSecond() {
	int culturePerSecond = monuments + (5 * monasteries) + (30 * theaters) + (125 * broadcastTowers);
	return culturePerSecond;
    }

    // setter methods that allow for adding resources, losing resources,
    // military strength, land values, and adding buildings
    public void setGold() {
	gold++;
    }

    public void setGold(int x) {
	gold = gold + x;
    }

    public void loseGold(int x) {
	gold = gold - x;
    }

    public void setFood() {
	food++;
    }

    public void setFood(int x) {
	food = food + x;
    }

    public void loseFood(int x) {
	food = food - x;
    }

    public void setProduction() {
	production++;
    }

    public void setProduction(int x) {
	production = production + x;
    }

    public void loseProduction(int x) {
	production = production - x;
    }

    public void setScience() {
	science++;
    }

    public void setScience(int x) {
	science = science + x;
    }

    public void loseScience(int x) {
	science = science - x;
    }

    public void setCulture() {
	culture++;
    }

    public void setCulture(int x) {
	culture = culture + x;
    }

    public void loseCulture(int x) {
	culture = culture - x;
    }

    public void setUsedLand(int x) {
	usedLand = usedLand + x;
    }

    public void setTotalLand() {
	totalLand++;
    }

    public void setTotalLand(int x) {
	totalLand = totalLand + x;
    }

    public void setExpansions() {
	expansions++;
    }

    public void setCottages() {
	cottages++;
    }

    public void setHamlets() {
	hamlets++;
    }

    public void setVillages() {
	villages++;
    }

    public void setTowns() {
	towns++;
    }

    public void setFarms() {
	farms++;
    }

    public void setIrrigatedFarms() {
	irrigatedFarms++;
    }

    public void setFertilizedFarms() {
	fertilizedFarms++;
    }

    public void setGMcropFarms() {
	GMcropFarms++;
    }

    public void setMines() {
	mines++;
    }

    public void setIronMines() {
	ironMines++;
    }

    public void setCoalMines() {
	coalMines++;
    }

    public void setUraniumMines() {
	uraniumMines++;
    }

    public void setLibraries() {
	libraries++;
    }

    public void setUniversities() {
	universities++;
    }

    public void setPublicSchools() {
	publicSchools++;
    }

    public void setResearchLabs() {
	researchLabs++;
    }

    public void setMonuments() {
	monuments++;
    }

    public void setMonasteries() {
	monasteries++;
    }

    public void setTheaters() {
	theaters++;
    }

    public void setBroadcastTowers() {
	broadcastTowers++;
    }

    public void setMilitaryStrength(int x) {
	strength = strength + x;
    }

    // method that allows for subtracting military strength
    public void loseMilitaryStrength(int x) {
	strength = strength - x;
    }
}

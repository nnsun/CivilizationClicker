package Game;

class Messages {
    public static String techText(String tech) {
	return "Research " + tech;
    }

    public static String unlockText(String unlock) {
	return "Unlocks " + unlock;
    }

    public static String buildText(String building) {
	return "Build " + building;
    }

    public static String buildingInfoText(int tier, String resource) {
	return "Tier " + tier + " " + resource + " building";
    }
}

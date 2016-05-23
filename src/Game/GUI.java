package Game;

import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {
    Resources objects = new Resources();
    Techs techs = new Techs();

    // declares JFrame components
    private JLabel gold;
    private JButton gatherGold;
    private JLabel food;
    private JButton gatherFood;
    private JLabel production;
    private JButton gatherProduction;
    private JLabel science;
    private JButton gatherScience;
    private JLabel culture;
    private JButton gatherCulture;

    private JLabel landUse;

    private JButton researchPottery;
    private JButton researchGuilds;
    private JButton researchPrintingPress;
    private JButton researchElectricity;

    private JButton researchAgriculture;
    private JButton researchMathematics;
    private JButton researchChemistry;
    private JButton researchGenetics;

    private JButton researchMining;
    private JButton researchIronWorking;
    private JButton researchSteamPower;
    private JButton researchFission;

    private JButton researchWriting;
    private JButton researchPaper;
    private JButton researchEducation;
    private JButton researchScientificMethod;

    private JButton researchMasonry;
    private JButton researchPhilosophy;
    private JButton researchDrama;
    private JButton researchRadio;

    private JButton researchMetalCasting;
    private JButton researchChivalry;
    private JButton researchGunpowder;
    private JButton researchIndustrialization;

    private JButton buildCottage;
    private JLabel totalCottages;
    private JButton buildHamlet;
    private JLabel totalHamlets;
    private JButton buildVillage;
    private JLabel totalVillages;
    private JButton buildTown;
    private JLabel totalTowns;

    private JButton buildFarm;
    private JLabel totalFarms;
    private JButton buildIrrigatedFarm;
    private JLabel totalIrrigatedFarms;
    private JButton buildFertilizedFarm;
    private JLabel totalFertilizedFarms;
    private JButton buildGMcropFarm;
    private JLabel totalGMcropFarms;

    private JButton buildMine;
    private JLabel totalMines;
    private JButton buildIronMine;
    private JLabel totalIronMines;
    private JButton buildCoalMine;
    private JLabel totalCoalMines;
    private JButton buildUraniumMine;
    private JLabel totalUraniumMines;

    private JButton buildLibrary;
    private JLabel totalLibraries;
    private JButton buildUniversity;
    private JLabel totalUniversities;
    private JButton buildPublicSchool;
    private JLabel totalPublicSchools;
    private JButton buildResearchLab;
    private JLabel totalResearchLabs;

    private JButton buildMonument;
    private JLabel totalMonuments;
    private JButton buildMonastery;
    private JLabel totalMonasteries;
    private JButton buildTheater;
    private JLabel totalTheaters;
    private JButton buildBroadcastTower;
    private JLabel totalBroadcastTowers;

    private JButton invadeOutpost;
    private JButton invadeTribe;
    private JButton invadeVillage;
    private JButton invadeTown;
    private JButton invadeCity;
    private JButton invadeCityState;
    private JButton invadeCountry;
    private JButton invadeEmpire;

    private JButton buildWarrior;
    private JButton buildSwordsman;
    private JButton buildKnight;
    private JButton buildInfantryman;
    private JButton buildTank;
    private JLabel strength;

    // JPanels for all techs and buildings so all building and tech types are on
    // different lines
    JPanel goldBuildingTechs = new JPanel();
    JPanel foodBuildingTechs = new JPanel();
    JPanel productionBuildingTechs = new JPanel();
    JPanel scienceBuildingTechs = new JPanel();
    JPanel cultureBuildingTechs = new JPanel();
    JPanel militaryUnitTechs = new JPanel();

    JPanel goldBuildings = new JPanel();
    JPanel foodBuildings = new JPanel();
    JPanel productionBuildings = new JPanel();
    JPanel scienceBuildings = new JPanel();
    JPanel cultureBuildings = new JPanel();
    JPanel militaryUnits = new JPanel();
    JPanel invade = new JPanel();

    public GUI() {
	super("CivClicker");
	setLayout(new FlowLayout());

	// Instantiates JLabels and JButtons for the window
	// buttons and labels for gathering
	gold = new JLabel("Gold: " + objects.getGold());
	gatherGold = new JButton("Gather Gold");
	gatherGold.setToolTipText("Gold is required for creating buildings and military units");
	food = new JLabel("Food: " + objects.getFood());
	gatherFood = new JButton("Gather Food");
	gatherFood.setToolTipText("Food is required for creating buildings and military units");
	production = new JLabel("Production: " + objects.getProduction());
	gatherProduction = new JButton("Gather Production");
	gatherProduction.setToolTipText("Production is required for creating buildings and military units");
	science = new JLabel("Science: " + objects.getScience());
	gatherScience = new JButton("Gather Science");
	gatherScience.setToolTipText("Science is required to research techs that unlock buildings and units");
	culture = new JLabel("Culture: " + objects.getCulture());
	gatherCulture = new JButton("Gather Culture");
	gatherCulture.setToolTipText("Culture is used to expand the borders, allowing more buildings.");

	landUse = new JLabel("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());

	// buttons and labels for techs
	researchPottery = new JButton("Research Pottery");
	researchPottery.setToolTipText("Unlocks Cottages");
	researchGuilds = new JButton("Research Guilds");
	researchGuilds.setToolTipText("Unlocks Hamlets");
	researchPrintingPress = new JButton("Research Printing Press");
	researchPrintingPress.setToolTipText("Unlocks Villages");
	researchElectricity = new JButton("Research Electricity");
	researchElectricity.setToolTipText("Unlocks Towns");

	researchAgriculture = new JButton("Research Agriculture");
	researchAgriculture.setToolTipText("Unlocks Farms");
	researchMathematics = new JButton("Research Mathematics");
	researchMathematics.setToolTipText("Unlocks Irrigated Farms");
	researchChemistry = new JButton("Research Chemistry");
	researchChemistry.setToolTipText("Unlocks Fertilized Farms");
	researchGenetics = new JButton("Research Genetics");
	researchGenetics.setToolTipText("Unlocks Genetically Modified Crop Farms");

	researchMining = new JButton("Research Mining");
	researchMining.setToolTipText("Unlocks Mines");
	researchIronWorking = new JButton("Research Iron Working");
	researchIronWorking.setToolTipText("Unlocks Iron Mines");
	researchSteamPower = new JButton("Research Steam Power");
	researchSteamPower.setToolTipText("Unlocks Coal Mines");
	researchFission = new JButton("Research Fission");
	researchFission.setToolTipText("Unlocks Uranium mines");

	researchWriting = new JButton("Research Writing");
	researchWriting.setToolTipText("Unlocks Libraries");
	researchPaper = new JButton("Research Paper");
	researchPaper.setToolTipText("Unlocks Universities");
	researchEducation = new JButton("Research Education");
	researchEducation.setToolTipText("Unlocks Public Schools");
	researchScientificMethod = new JButton("Research Scientific Method");
	researchScientificMethod.setToolTipText("Unlocks Research Labs");

	researchMasonry = new JButton("Research Masonry");
	researchMasonry.setToolTipText("Unlocks Monuments");
	researchPhilosophy = new JButton("Research Philosophy");
	researchPhilosophy.setToolTipText("Unlocks Monasteries");
	researchDrama = new JButton("Research Drama");
	researchDrama.setToolTipText("Unlocks Theaters");
	researchRadio = new JButton("Research Radio");
	researchRadio.setToolTipText("Unlocks Broadcast Towers");

	researchMetalCasting = new JButton("Research Metal Casting");
	researchMetalCasting.setToolTipText("Unlocks Swordsmen");
	researchChivalry = new JButton("Research Chivalry");
	researchChivalry.setToolTipText("Unlocks Knights");
	researchGunpowder = new JButton("Research Gunpowder");
	researchGunpowder.setToolTipText("Research Infantry");
	researchIndustrialization = new JButton("Research Industrialization");
	researchIndustrialization.setToolTipText("Unlocks Tanks");

	// buttons and labels for buildings
	buildCottage = new JButton("Build Cottage");
	buildCottage.setToolTipText("Tier 1 Gold building");
	totalCottages = new JLabel("Cottages: " + objects.getCottages());
	buildHamlet = new JButton("Build Hamlet");
	buildHamlet.setToolTipText("Tier 2 Gold building");
	totalHamlets = new JLabel("Hamlets: " + objects.getHamlets());
	buildVillage = new JButton("Build Village");
	buildVillage.setToolTipText("Tier 3 Gold building");
	totalVillages = new JLabel("Villages: " + objects.getVillages());
	buildTown = new JButton("Build Town");
	buildTown.setToolTipText("Tier 4 Gold building");
	totalTowns = new JLabel("Towns: " + objects.getTowns());

	buildFarm = new JButton("Build Farm");
	buildFarm.setToolTipText("Tier 1 Food building");
	totalFarms = new JLabel("Farms: " + objects.getFarms());
	buildIrrigatedFarm = new JButton("Build Irrigated Farm");
	buildIrrigatedFarm.setToolTipText("Tier 2 Food building");
	totalIrrigatedFarms = new JLabel("Irrigated Farms: " + objects.getIrrigatedFarms());
	buildFertilizedFarm = new JButton("Build Fertilized Farm");
	buildFertilizedFarm.setToolTipText("Tier 3 Food building");
	totalFertilizedFarms = new JLabel("Fertilized Farms: " + objects.getFertilizedFarms());
	buildGMcropFarm = new JButton("Build GM Crop Farm");
	buildGMcropFarm.setToolTipText("Tier 4 Food building");
	totalGMcropFarms = new JLabel("GM Crop Farms: " + objects.getGMcropFarms());

	buildMine = new JButton("Build Mine");
	buildMine.setToolTipText("Tier 1 Production building");
	totalMines = new JLabel("Mines: " + objects.getMines());
	buildIronMine = new JButton("Build Iron Mine");
	buildIronMine.setToolTipText("Tier 2 Production building");
	totalIronMines = new JLabel("Iron Mines: " + objects.getIronMines());
	buildCoalMine = new JButton("Build Coal Mine");
	buildCoalMine.setToolTipText("Tier 3 Production building");
	totalCoalMines = new JLabel("Coal Mines: " + objects.getCoalMines());
	buildUraniumMine = new JButton("Build Uranium Mine");
	buildUraniumMine.setToolTipText("Tier 4 Production building");
	totalUraniumMines = new JLabel("Uranium Mines: " + objects.getUraniumMines());

	buildLibrary = new JButton("Build Library");
	buildLibrary.setToolTipText("Tier 1 Science building");
	totalLibraries = new JLabel("Libraries: " + objects.getLibraries());
	buildUniversity = new JButton("Build University");
	buildUniversity.setToolTipText("Tier 2 Science building");
	totalUniversities = new JLabel("Universities: " + objects.getUniversities());
	buildPublicSchool = new JButton("Build Public School");
	buildPublicSchool.setToolTipText("Tier 3 Science building");
	totalPublicSchools = new JLabel("Public Schools: " + objects.getPublicSchools());
	buildResearchLab = new JButton("Build Research Lab");
	buildResearchLab.setToolTipText("Tier 4 Science building");
	totalResearchLabs = new JLabel("Research Labs: " + objects.getResearchLabs());

	buildMonument = new JButton("Build Monument");
	buildMonument.setToolTipText("Tier 1 Culture building");
	totalMonuments = new JLabel("Monuments: " + objects.getMonuments());
	buildMonastery = new JButton("Build Monastery");
	buildMonastery.setToolTipText("Tier 2 Culture building");
	totalMonasteries = new JLabel("Monasteries: " + objects.getMonasteries());
	buildTheater = new JButton("Build Theater");
	buildTheater.setToolTipText("Tier 3 Culture building");
	totalTheaters = new JLabel("Theaters: " + objects.getTheaters());
	buildBroadcastTower = new JButton("Build Broadcast Tower");
	buildBroadcastTower.setToolTipText("Tier 4 Culture building");
	totalBroadcastTowers = new JLabel("Broadcast Towers: " + objects.getBroadcastTowers());

	// buttons and labels for military units and strength
	buildWarrior = new JButton("Build Warrior");
	buildSwordsman = new JButton("Build Swordsman");
	buildKnight = new JButton("Build Knight");
	buildInfantryman = new JButton("Build Infantry");
	buildTank = new JButton("Build Tank");
	strength = new JLabel("Military Strength: " + objects.getMilitaryStrength());

	// buttons for invasion
	invadeOutpost = new JButton("Invade Outpost");
	invadeOutpost.setToolTipText("Strength: " + Constants.OUTPOST_STRENGTH);
	invadeTribe = new JButton("Invade Tribe");
	invadeTribe.setToolTipText("Strength: " + Constants.TRIBE_STRENGTH);
	invadeVillage = new JButton("Invade Village");
	invadeVillage.setToolTipText("Strength: " + Constants.VILLAGE_STRENGTH);
	invadeTown = new JButton("Invade Town");
	invadeTown.setToolTipText("Strength: " + Constants.TOWN_STRENGTH);
	invadeCity = new JButton("Invade City");
	invadeCity.setToolTipText("Strength: " + Constants.CITY_STRENGTH);
	invadeCityState = new JButton("Invade City-State");
	invadeCityState.setToolTipText("Strength: " + Constants.CITY_STATE_STRENGTH);
	invadeCountry = new JButton("Invade Country");
	invadeCountry.setToolTipText("Strength: " + Constants.COUNTRY_STRENGTH);
	invadeEmpire = new JButton("Invade Empire");
	invadeEmpire.setToolTipText("Strength: " + Constants.EMPIRE_STRENGTH);

	// adds generic resource gathering components
	add(gatherProduction);
	add(production);
	add(gatherGold);
	add(gold);
	add(gatherFood);
	add(food);
	add(gatherScience);
	add(science);
	add(gatherCulture);
	add(culture);
	add(landUse);

	// adds buttons and labels to respective JPanels
	goldBuildingTechs.add(researchPottery);
	goldBuildingTechs.add(researchGuilds);
	goldBuildingTechs.add(researchPrintingPress);
	goldBuildingTechs.add(researchElectricity);

	foodBuildingTechs.add(researchAgriculture);
	foodBuildingTechs.add(researchMathematics);
	foodBuildingTechs.add(researchChemistry);
	foodBuildingTechs.add(researchGenetics);

	productionBuildingTechs.add(researchMining);
	productionBuildingTechs.add(researchIronWorking);
	productionBuildingTechs.add(researchSteamPower);
	productionBuildingTechs.add(researchFission);

	scienceBuildingTechs.add(researchWriting);
	scienceBuildingTechs.add(researchPaper);
	scienceBuildingTechs.add(researchEducation);
	scienceBuildingTechs.add(researchScientificMethod);

	cultureBuildingTechs.add(researchMasonry);
	cultureBuildingTechs.add(researchPhilosophy);
	cultureBuildingTechs.add(researchDrama);
	cultureBuildingTechs.add(researchRadio);

	militaryUnitTechs.add(researchMetalCasting);
	militaryUnitTechs.add(researchChivalry);
	militaryUnitTechs.add(researchGunpowder);
	militaryUnitTechs.add(researchIndustrialization);

	goldBuildings.add(buildCottage);
	goldBuildings.add(totalCottages);
	goldBuildings.add(buildHamlet);
	goldBuildings.add(totalHamlets);
	goldBuildings.add(buildVillage);
	goldBuildings.add(totalVillages);
	goldBuildings.add(buildTown);
	goldBuildings.add(totalTowns);

	foodBuildings.add(buildFarm);
	foodBuildings.add(totalFarms);
	foodBuildings.add(buildIrrigatedFarm);
	foodBuildings.add(totalIrrigatedFarms);
	foodBuildings.add(buildFertilizedFarm);
	foodBuildings.add(totalFertilizedFarms);
	foodBuildings.add(buildGMcropFarm);
	foodBuildings.add(totalGMcropFarms);

	productionBuildings.add(buildMine);
	productionBuildings.add(totalMines);
	productionBuildings.add(buildIronMine);
	productionBuildings.add(totalIronMines);
	productionBuildings.add(buildCoalMine);
	productionBuildings.add(totalCoalMines);
	productionBuildings.add(buildUraniumMine);
	productionBuildings.add(totalUraniumMines);

	scienceBuildings.add(buildLibrary);
	scienceBuildings.add(totalLibraries);
	scienceBuildings.add(buildUniversity);
	scienceBuildings.add(totalUniversities);
	scienceBuildings.add(buildPublicSchool);
	scienceBuildings.add(totalPublicSchools);
	scienceBuildings.add(buildResearchLab);
	scienceBuildings.add(totalResearchLabs);

	cultureBuildings.add(buildMonument);
	cultureBuildings.add(totalMonuments);
	cultureBuildings.add(buildMonastery);
	cultureBuildings.add(totalMonasteries);
	cultureBuildings.add(buildTheater);
	cultureBuildings.add(totalTheaters);
	cultureBuildings.add(buildBroadcastTower);
	cultureBuildings.add(totalBroadcastTowers);

	militaryUnits.add(buildWarrior);
	militaryUnits.add(buildSwordsman);
	militaryUnits.add(buildKnight);
	militaryUnits.add(buildInfantryman);
	militaryUnits.add(buildTank);
	militaryUnits.add(strength);

	invade.add(invadeOutpost);
	invade.add(invadeTribe);
	invade.add(invadeVillage);
	invade.add(invadeTown);
	invade.add(invadeCity);
	invade.add(invadeCityState);
	invade.add(invadeCountry);
	invade.add(invadeEmpire);

	add(goldBuildingTechs);
	add(foodBuildingTechs);
	add(productionBuildingTechs);
	add(scienceBuildingTechs);
	add(cultureBuildingTechs);
	add(militaryUnitTechs);

	add(goldBuildings);
	add(foodBuildings);
	add(productionBuildings);
	add(scienceBuildings);
	add(cultureBuildings);

	add(militaryUnits);

	add(invade);

	EventHandler handler = new EventHandler();

	// adds ActionListeners for each button
	gatherGold.addActionListener(handler);
	gatherFood.addActionListener(handler);
	gatherProduction.addActionListener(handler);
	gatherScience.addActionListener(handler);
	gatherCulture.addActionListener(handler);

	researchPottery.addActionListener(handler);
	researchGuilds.addActionListener(handler);
	researchPrintingPress.addActionListener(handler);
	researchElectricity.addActionListener(handler);

	researchAgriculture.addActionListener(handler);
	researchMathematics.addActionListener(handler);
	researchChemistry.addActionListener(handler);
	researchGenetics.addActionListener(handler);

	researchMining.addActionListener(handler);
	researchIronWorking.addActionListener(handler);
	researchSteamPower.addActionListener(handler);
	researchFission.addActionListener(handler);

	researchWriting.addActionListener(handler);
	researchPaper.addActionListener(handler);
	researchEducation.addActionListener(handler);
	researchScientificMethod.addActionListener(handler);

	researchMasonry.addActionListener(handler);
	researchPhilosophy.addActionListener(handler);
	researchDrama.addActionListener(handler);
	researchRadio.addActionListener(handler);

	researchMetalCasting.addActionListener(handler);
	researchChivalry.addActionListener(handler);
	researchGunpowder.addActionListener(handler);
	researchIndustrialization.addActionListener(handler);

	buildCottage.addActionListener(handler);
	buildHamlet.addActionListener(handler);
	buildVillage.addActionListener(handler);
	buildTown.addActionListener(handler);

	buildFarm.addActionListener(handler);
	buildIrrigatedFarm.addActionListener(handler);
	buildFertilizedFarm.addActionListener(handler);
	buildGMcropFarm.addActionListener(handler);

	buildMine.addActionListener(handler);
	buildIronMine.addActionListener(handler);
	buildCoalMine.addActionListener(handler);
	buildUraniumMine.addActionListener(handler);

	buildLibrary.addActionListener(handler);
	buildUniversity.addActionListener(handler);
	buildPublicSchool.addActionListener(handler);
	buildResearchLab.addActionListener(handler);

	buildMonument.addActionListener(handler);
	buildMonastery.addActionListener(handler);
	buildTheater.addActionListener(handler);
	buildBroadcastTower.addActionListener(handler);

	buildWarrior.addActionListener(handler);
	buildSwordsman.addActionListener(handler);
	buildKnight.addActionListener(handler);
	buildInfantryman.addActionListener(handler);
	buildTank.addActionListener(handler);

	invadeOutpost.addActionListener(handler);
	invadeTribe.addActionListener(handler);
	invadeVillage.addActionListener(handler);
	invadeTown.addActionListener(handler);
	invadeCity.addActionListener(handler);
	invadeCityState.addActionListener(handler);
	invadeCountry.addActionListener(handler);
	invadeEmpire.addActionListener(handler);

    }

    // ticker to calculate passive resource gain from buildings
    Timer ticker = new Timer(1000, new TimerListener());

    public class TimerListener implements ActionListener {
	// adds passive resource gain and checks for culture border growth
	public void actionPerformed(ActionEvent event) {
	    objects.setGold(objects.getGoldPerSecond());
	    gold.setText("Gold: " + objects.getGold());
	    objects.setFood(objects.getFoodPerSecond());
	    food.setText("Food: " + objects.getFood());
	    objects.setProduction(objects.getProductionPerSecond());
	    production.setText("Production: " + objects.getProduction());
	    objects.setScience(objects.getSciencePerSecond());
	    science.setText("Science: " + objects.getScience());
	    objects.setCulture(objects.getCulturePerSecond());
	    culture.setText("Culture: " + objects.getCulture());

	    if (objects.getExpansions() == 0 && objects.getCulture() >= 10) {
		objects.loseCulture(10);
		objects.setTotalLand(3);
		objects.setExpansions();
	    }
	    if (objects.getCulture() >= (50 * objects.getExpansions()) && objects.getExpansions() != 0) {
		objects.loseCulture(50 * objects.getExpansions());
		objects.setTotalLand(3);
		objects.setExpansions();
	    }

	    landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
	}
    }

    private class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent event) {
	    ticker.start();
	    Object source = event.getSource();

	    // buttons for resources: one click gives one resource each
	    if (source == gatherGold) {
		objects.setGold();
		gold.setText("Gold: " + objects.getGold());
	    }
	    if (source == gatherFood) {
		objects.setFood();
		food.setText("Food: " + objects.getFood());
	    }
	    if (source == gatherProduction) {
		objects.setProduction();
		production.setText("Production: " + objects.getProduction());
	    }
	    if (source == gatherScience) {
		objects.setScience();
		science.setText("Science: " + objects.getScience());
	    }
	    if (source == gatherCulture) {
		objects.setCulture();
		culture.setText("Culture: " + objects.getCulture());
	    }

	    // buttons added for techs, checks to see if prereqs are met
	    if (source == researchPottery) {
		if (objects.getScience() >= Constants.TIER1_COST && techs.getPottery() != true) {
		    objects.loseScience(Constants.TIER1_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setPottery();
		    researchPottery.setText("Pottery researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER1_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchGuilds && techs.getGuilds() != true) {
		if (objects.getScience() >= Constants.TIER2_COST) {
		    objects.loseScience(Constants.TIER2_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setGuilds();
		    researchGuilds.setText("Guilds researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER2_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchPrintingPress && techs.getPrintingPress() != true) {
		if (objects.getScience() >= Constants.TIER3_COST) {
		    objects.loseScience(Constants.TIER3_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setPrintingPress();
		    researchPrintingPress.setText("Printing Press researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER3_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchElectricity && techs.getElectricity() != true) {
		if (objects.getScience() >= Constants.TIER4_COST) {
		    objects.loseScience(Constants.TIER4_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setElectricity();
		    researchElectricity.setText("Electricity researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER4_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);

	    }

	    if (source == researchAgriculture && techs.getAgriculture() != true) {
		if (objects.getScience() >= Constants.TIER1_COST) {
		    objects.loseScience(Constants.TIER1_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setAgriculture();
		    researchAgriculture.setText("Agriculture researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER1_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchMathematics && techs.getMathematics() != true) {
		if (objects.getScience() >= Constants.TIER2_COST) {
		    objects.loseScience(Constants.TIER2_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setMathematics();
		    researchMathematics.setText("Mathematics researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER2_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchChemistry && techs.getChemistry() != true) {
		if (objects.getScience() >= Constants.TIER3_COST) {
		    objects.loseScience(Constants.TIER3_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setChemistry();
		    researchChemistry.setText("Chemistry researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER3_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchGenetics && techs.getGenetics() != true) {
		if (objects.getScience() >= Constants.TIER4_COST) {
		    objects.loseScience(Constants.TIER4_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setGenetics();
		    researchGenetics.setText("Genetics researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER4_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }

	    if (source == researchMining && techs.getMining() != true) {
		if (objects.getScience() >= Constants.TIER1_COST) {
		    objects.loseScience(Constants.TIER1_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setMining();
		    researchMining.setText("Mining researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER1_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchIronWorking && techs.getIronWorking() != true) {
		if (objects.getScience() >= Constants.TIER2_COST) {
		    objects.loseScience(Constants.TIER2_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setIronWorking();
		    researchIronWorking.setText("Iron Working researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER2_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchSteamPower && techs.getSteamPower() != true) {
		if (objects.getScience() >= Constants.TIER3_COST) {
		    objects.loseScience(Constants.TIER3_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setSteamPower();
		    researchSteamPower.setText("Steam Power researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER3_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchFission && techs.getFission() != true) {
		if (objects.getScience() >= Constants.TIER4_COST) {
		    objects.loseScience(Constants.TIER4_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setFission();
		    researchFission.setText("Fission researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER4_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }

	    if (source == researchWriting && techs.getWriting() != true) {
		if (objects.getScience() >= Constants.TIER1_COST) {
		    objects.loseScience(Constants.TIER1_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setWriting();
		    researchWriting.setText("Writing researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER1_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchPaper && techs.getPaper() != true) {
		if (objects.getScience() >= Constants.TIER2_COST) {
		    objects.loseScience(Constants.TIER2_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setPaper();
		    researchPaper.setText("Paper researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER2_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchEducation && techs.getEducation() != true) {
		if (objects.getScience() >= Constants.TIER3_COST) {
		    objects.loseScience(Constants.TIER3_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setEducation();
		    researchEducation.setText("Education researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER3_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchScientificMethod && techs.getScientificMethod() != true) {
		if (objects.getScience() >= Constants.TIER4_COST) {
		    objects.loseScience(Constants.TIER4_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setScientificMethod();
		    researchScientificMethod.setText("Scientific Method researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER4_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }

	    if (source == researchMasonry && techs.getMasonry() != true) {
		if (objects.getScience() >= Constants.TIER1_COST) {
		    objects.loseScience(Constants.TIER1_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setMasonry();
		    researchMasonry.setText("Masonry researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER1_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchPhilosophy && techs.getPhilosophy() != true) {
		if (objects.getScience() >= Constants.TIER2_COST) {
		    objects.loseScience(Constants.TIER2_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setPhilosophy();
		    researchPhilosophy.setText("Philosophy researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER2_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchDrama && techs.getDrama() != true) {
		if (objects.getScience() >= Constants.TIER3_COST) {
		    objects.loseScience(Constants.TIER3_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setDrama();
		    researchDrama.setText("Drama researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER3_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchRadio && techs.getRadio() != true)

	    {
		if (objects.getScience() >= Constants.TIER4_COST) {
		    objects.loseScience(Constants.TIER4_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setRadio();
		    researchRadio.setText("Radio researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER4_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }

	    if (source == researchMetalCasting && techs.getMetalCasting() != true) {
		if (objects.getScience() >= Constants.TIER1_COST) {
		    objects.loseScience(Constants.TIER1_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setMetalCasting();
		    researchMetalCasting.setText("Metal Casting researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER1_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchChivalry && techs.getChivalry() != true) {
		if (objects.getScience() >= Constants.TIER2_COST) {
		    objects.loseScience(Constants.TIER2_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setChivalry();
		    researchChivalry.setText("Chivalry researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER2_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchGunpowder && techs.getGunpowder() != true) {
		if (objects.getScience() >= Constants.TIER3_COST) {
		    objects.loseScience(Constants.TIER3_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setGunpowder();
		    researchGunpowder.setText("Gunpowder researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER3_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == researchIndustrialization && techs.getIndustrialization() != true) {
		if (objects.getScience() >= Constants.TIER4_COST) {
		    objects.loseScience(Constants.TIER4_COST);
		    science.setText("Science: " + objects.getScience());
		    techs.setIndustrialization();
		    researchIndustrialization.setText("Industrialization researched");
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need " + Constants.TIER4_COST + " Science to research this tech.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }

	    // buttons for buildings
	    if (source == buildCottage) {
		if (techs.getPottery() && objects.getProduction() >= Constants.COTTAGE_PRODUCTION_COST
			&& objects.getGold() >= Constants.COTTAGE_GOLD_COST
			&& objects.getFood() >= Constants.COTTAGE_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER1_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.COTTAGE_PRODUCTION_COST);
			objects.loseGold(Constants.COTTAGE_GOLD_COST);
			objects.loseFood(Constants.COTTAGE_FOOD_COST);
			objects.setCottages();
			totalCottages.setText("Cottages: " + objects.getCottages());
			objects.setUsedLand(Constants.TIER1_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Pottery, " + Constants.COTTAGE_PRODUCTION_COST + " Production, "
				    + Constants.COTTAGE_GOLD_COST + " Gold, and " + Constants.COTTAGE_FOOD_COST
				    + " Food to build a Cottage.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildHamlet) {
		if (techs.getGuilds() && objects.getProduction() >= Constants.HAMLET_PRODUCTION_COST
			&& objects.getGold() >= Constants.HAMLET_GOLD_COST
			&& objects.getFood() >= Constants.HAMLET_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER2_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.HAMLET_PRODUCTION_COST);
			objects.loseGold(Constants.HAMLET_GOLD_COST);
			objects.loseFood(Constants.HAMLET_FOOD_COST);
			objects.setHamlets();
			totalHamlets.setText("Hamlets: " + objects.getHamlets());
			objects.setUsedLand(Constants.TIER2_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Guilds, " + Constants.HAMLET_PRODUCTION_COST + " Production, "
				    + Constants.HAMLET_GOLD_COST + " Gold, and " + Constants.HAMLET_FOOD_COST
				    + " Food to build a Hamlet.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildVillage) {
		if (techs.getPrintingPress() && objects.getProduction() >= Constants.VILLAGE_PRODUCTION_COST
			&& objects.getGold() >= Constants.VILLAGE_GOLD_COST
			&& objects.getFood() >= Constants.VILLAGE_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER3_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.VILLAGE_PRODUCTION_COST);
			objects.loseGold(Constants.VILLAGE_GOLD_COST);
			objects.loseFood(Constants.VILLAGE_FOOD_COST);
			objects.setVillages();
			totalVillages.setText("Villages: " + objects.getVillages());
			objects.setUsedLand(Constants.TIER3_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Printing Press, " + Constants.VILLAGE_PRODUCTION_COST + " Production, "
				    + Constants.VILLAGE_GOLD_COST + " Gold, and " + Constants.VILLAGE_FOOD_COST
				    + " Food to build a Village.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildTown) {
		if (techs.getElectricity() && objects.getProduction() >= Constants.TOWN_PRODUCTION_COST
			&& objects.getGold() >= Constants.TOWN_GOLD_COST
			&& objects.getFood() >= Constants.TOWN_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER4_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.TOWN_PRODUCTION_COST);
			objects.loseGold(Constants.TOWN_GOLD_COST);
			objects.loseFood(Constants.TOWN_FOOD_COST);
			objects.setTowns();
			totalTowns.setText("Towns: " + objects.getTowns());
			objects.setUsedLand(Constants.TIER4_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Electricity, " + Constants.TOWN_PRODUCTION_COST + " Production, "
				    + Constants.TOWN_GOLD_COST + " Gold, and " + Constants.TOWN_FOOD_COST
				    + " Food to build a Town.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }

	    if (source == buildFarm) {
		if (techs.getAgriculture() && objects.getProduction() >= Constants.FARM_PRODUCTION_COST
			&& objects.getGold() >= Constants.FARM_GOLD_COST
			&& objects.getFood() >= Constants.FARM_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER1_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.FARM_PRODUCTION_COST);
			objects.loseGold(Constants.FARM_GOLD_COST);
			objects.loseFood(Constants.FARM_FOOD_COST);
			objects.setFarms();
			totalFarms.setText("Farms: " + objects.getFarms());
			objects.setUsedLand(Constants.TIER1_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Agriculture, " + Constants.FARM_PRODUCTION_COST + " Production, "
				    + Constants.FARM_GOLD_COST + " Gold, and " + Constants.FARM_FOOD_COST
				    + " Food to build a Farm.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildIrrigatedFarm) {
		if (techs.getMathematics() && objects.getProduction() >= Constants.IRRIGATED_FARM_PRODUCTION_COST
			&& objects.getGold() >= Constants.IRRIGATED_FARM_GOLD_COST
			&& objects.getFood() >= Constants.IRRIGATED_FARM_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER2_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.IRRIGATED_FARM_PRODUCTION_COST);
			objects.loseGold(Constants.IRRIGATED_FARM_GOLD_COST);
			objects.loseFood(Constants.IRRIGATED_FARM_FOOD_COST);
			objects.setIrrigatedFarms();
			totalIrrigatedFarms.setText("Irrigated Farms: " + objects.getIrrigatedFarms());
			objects.setUsedLand(Constants.TIER2_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Mathematics, " + Constants.IRRIGATED_FARM_PRODUCTION_COST + " Production, "
				    + Constants.IRRIGATED_FARM_GOLD_COST + " Gold, and "
				    + Constants.IRRIGATED_FARM_FOOD_COST + " Food to build an Irrigated Farm.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildFertilizedFarm) {
		if (techs.getChemistry() && objects.getProduction() >= Constants.FERTILIZED_FARM_PRODUCTION_COST
			&& objects.getGold() >= Constants.FERTILIZED_FARM_GOLD_COST
			&& objects.getFood() >= Constants.FERTILIZED_FARM_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER3_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.FERTILIZED_FARM_PRODUCTION_COST);
			objects.loseGold(Constants.FERTILIZED_FARM_GOLD_COST);
			objects.loseFood(Constants.FERTILIZED_FARM_FOOD_COST);
			objects.setFertilizedFarms();
			totalFertilizedFarms.setText("Fertilized Farms: " + objects.getFertilizedFarms());
			objects.setUsedLand(Constants.TIER3_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Chemistry, " + Constants.FERTILIZED_FARM_PRODUCTION_COST + " Production, "
				    + Constants.FERTILIZED_FARM_GOLD_COST + " Gold, and "
				    + Constants.FERTILIZED_FARM_FOOD_COST + " Food to build a Fertilized Farm.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildGMcropFarm) {
		if (techs.getGenetics() && objects.getProduction() >= Constants.GM_CROP_FARM_PRODUCTION_COST
			&& objects.getGold() >= Constants.GM_CROP_FARM_GOLD_COST
			&& objects.getFood() >= Constants.GM_CROP_FARM_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER4_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.GM_CROP_FARM_PRODUCTION_COST);
			objects.loseGold(Constants.GM_CROP_FARM_GOLD_COST);
			objects.loseFood(Constants.GM_CROP_FARM_FOOD_COST);
			objects.setGMcropFarms();
			totalGMcropFarms.setText("GM Crop Farms: " + objects.getGMcropFarms());
			objects.setUsedLand(Constants.TIER4_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null, "You need Genetics, " + Constants.GM_CROP_FARM_PRODUCTION_COST
			    + " Production, " + Constants.GM_CROP_FARM_GOLD_COST + " Gold, and "
			    + Constants.GM_CROP_FARM_FOOD_COST + " Food to build a Genetically Modified Crop Farm.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }

	    if (source == buildMine) {
		if (techs.getMining() && objects.getProduction() >= Constants.MINE_PRODUCTION_COST
			&& objects.getGold() >= Constants.MINE_GOLD_COST
			&& objects.getFood() >= Constants.MINE_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER1_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.MINE_PRODUCTION_COST);
			objects.loseGold(Constants.MINE_GOLD_COST);
			objects.loseFood(Constants.MINE_FOOD_COST);
			objects.setMines();
			totalMines.setText("Mines: " + objects.getMines());
			objects.setUsedLand(Constants.TIER1_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Mining, " + Constants.MINE_PRODUCTION_COST + " Production, "
				    + Constants.MINE_GOLD_COST + " Gold, and " + Constants.MINE_FOOD_COST
				    + " Food to build a Mine.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildIronMine) {
		if (techs.getIronWorking() && objects.getProduction() >= Constants.IRON_MINE_PRODUCTION_COST
			&& objects.getGold() >= Constants.IRON_MINE_GOLD_COST
			&& objects.getFood() >= Constants.IRON_MINE_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER2_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.IRON_MINE_PRODUCTION_COST);
			objects.loseGold(Constants.IRON_MINE_GOLD_COST);
			objects.loseFood(Constants.IRON_MINE_FOOD_COST);
			objects.setIronMines();
			totalIronMines.setText("Iron Mines: " + objects.getIronMines());
			objects.setUsedLand(Constants.TIER2_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Iron Working, " + Constants.IRON_MINE_PRODUCTION_COST + " Production, "
				    + Constants.IRON_MINE_GOLD_COST + " Gold, and " + Constants.IRON_MINE_FOOD_COST
				    + " Food to build a Iron Mine.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildCoalMine) {
		if (techs.getSteamPower() && objects.getProduction() >= Constants.COAL_MINE_PRODUCTION_COST
			&& objects.getGold() >= Constants.COAL_MINE_GOLD_COST
			&& objects.getFood() >= Constants.COAL_MINE_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER3_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.COAL_MINE_PRODUCTION_COST);
			objects.loseGold(Constants.COAL_MINE_GOLD_COST);
			objects.loseFood(Constants.COAL_MINE_FOOD_COST);
			objects.setCoalMines();
			totalCoalMines.setText("Coal Mines: " + objects.getCoalMines());
			objects.setUsedLand(Constants.TIER3_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Steam Power, " + Constants.COAL_MINE_PRODUCTION_COST + " Production, "
				    + Constants.COAL_MINE_GOLD_COST + " Gold, and " + Constants.COAL_MINE_FOOD_COST
				    + " Food to build a Coal Mine.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildUraniumMine) {
		if (techs.getFission() && objects.getProduction() >= Constants.URANIUM_MINE_PRODUCTION_COST
			&& objects.getGold() >= Constants.URANIUM_MINE_GOLD_COST
			&& objects.getFood() >= Constants.URANIUM_MINE_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER4_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.URANIUM_MINE_PRODUCTION_COST);
			objects.loseGold(Constants.URANIUM_MINE_GOLD_COST);
			objects.loseFood(Constants.URANIUM_MINE_FOOD_COST);
			objects.setUraniumMines();
			totalUraniumMines.setText("Uranium Mines: " + objects.getUraniumMines());
			objects.setUsedLand(Constants.TIER4_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Fission, " + Constants.URANIUM_MINE_PRODUCTION_COST + " Production, "
				    + Constants.URANIUM_MINE_GOLD_COST + " Gold, and "
				    + Constants.URANIUM_MINE_FOOD_COST + " Food to build a Uranium Mine.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }

	    if (source == buildLibrary) {
		if (techs.getWriting() && objects.getProduction() >= Constants.LIBRARY_PRODUCTION_COST
			&& objects.getGold() >= Constants.LIBRARY_GOLD_COST
			&& objects.getFood() >= Constants.LIBRARY_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER1_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.LIBRARY_PRODUCTION_COST);
			objects.loseGold(Constants.LIBRARY_GOLD_COST);
			objects.loseFood(Constants.LIBRARY_FOOD_COST);
			objects.setLibraries();
			totalLibraries.setText("Libraries: " + objects.getLibraries());
			objects.setUsedLand(Constants.TIER1_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Writing, " + Constants.LIBRARY_PRODUCTION_COST + " Production, "
				    + Constants.LIBRARY_GOLD_COST + " Gold, and " + Constants.LIBRARY_FOOD_COST
				    + " Food to build a Library.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildUniversity) {
		if (techs.getPaper() && objects.getProduction() >= Constants.UNIVERSITY_PRODUCTION_COST
			&& objects.getGold() >= Constants.UNIVERSITY_GOLD_COST
			&& objects.getFood() >= Constants.UNIVERSITY_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER2_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.UNIVERSITY_PRODUCTION_COST);
			objects.loseGold(Constants.UNIVERSITY_GOLD_COST);
			objects.loseFood(Constants.UNIVERSITY_FOOD_COST);
			objects.setUniversities();
			totalUniversities.setText("Universities: " + objects.getUniversities());
			objects.setUsedLand(Constants.TIER2_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Paper, " + Constants.UNIVERSITY_PRODUCTION_COST + " Production, "
				    + Constants.UNIVERSITY_GOLD_COST + " Gold, and " + Constants.UNIVERSITY_FOOD_COST
				    + " Food to build a University.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildPublicSchool) {
		if (techs.getEducation() && objects.getProduction() >= Constants.PUBLIC_SCHOOL_PRODUCTION_COST
			&& objects.getGold() >= Constants.PUBLIC_SCHOOL_GOLD_COST
			&& objects.getFood() >= Constants.PUBLIC_SCHOOL_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER3_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.PUBLIC_SCHOOL_PRODUCTION_COST);
			objects.loseGold(Constants.PUBLIC_SCHOOL_GOLD_COST);
			objects.loseFood(Constants.PUBLIC_SCHOOL_FOOD_COST);
			objects.setPublicSchools();
			totalPublicSchools.setText("Public Schools: " + objects.getPublicSchools());
			objects.setUsedLand(Constants.TIER3_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Education, " + Constants.PUBLIC_SCHOOL_PRODUCTION_COST + " Production, "
				    + Constants.PUBLIC_SCHOOL_GOLD_COST + " Gold, and "
				    + Constants.PUBLIC_SCHOOL_FOOD_COST + " Food to build a Public School.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildResearchLab) {
		if (techs.getScientificMethod() && objects.getProduction() >= Constants.RESEARCH_LAB_PRODUCTION_COST
			&& objects.getGold() >= Constants.RESEARCH_LAB_GOLD_COST
			&& objects.getFood() >= Constants.RESEARCH_LAB_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER4_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.RESEARCH_LAB_PRODUCTION_COST);
			objects.loseGold(Constants.RESEARCH_LAB_GOLD_COST);
			objects.loseFood(Constants.RESEARCH_LAB_FOOD_COST);
			objects.setResearchLabs();
			totalResearchLabs.setText("Research Labs: " + objects.getResearchLabs());
			objects.setUsedLand(Constants.TIER4_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Scientific Method, " + Constants.RESEARCH_LAB_PRODUCTION_COST + " Production, "
				    + Constants.RESEARCH_LAB_GOLD_COST + " Gold, and "
				    + Constants.RESEARCH_LAB_FOOD_COST + " Food to build a Research Lab.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }

	    if (source == buildMonument) {
		if (techs.getMasonry() && objects.getProduction() >= Constants.MONUMENT_PRODUCTION_COST
			&& objects.getGold() >= Constants.MONUMENT_GOLD_COST
			&& objects.getFood() >= Constants.MONUMENT_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER1_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.MONUMENT_PRODUCTION_COST);
			objects.loseGold(Constants.MONUMENT_GOLD_COST);
			objects.loseFood(Constants.MONUMENT_FOOD_COST);
			objects.setMonuments();
			totalMonuments.setText("Monuments: " + objects.getMonuments());
			objects.setUsedLand(Constants.TIER1_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Masonry, " + Constants.MONUMENT_PRODUCTION_COST + " Production, "
				    + Constants.MONUMENT_GOLD_COST + " Gold, and " + Constants.MONUMENT_FOOD_COST
				    + " Food to build a Monument.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildMonastery) {
		if (techs.getPhilosophy() && objects.getProduction() >= Constants.MONASTERY_PRODUCTION_COST
			&& objects.getGold() >= Constants.MONASTERY_GOLD_COST
			&& objects.getFood() >= Constants.MONASTERY_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER2_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.MONASTERY_PRODUCTION_COST);
			objects.loseGold(Constants.MONASTERY_GOLD_COST);
			objects.loseFood(Constants.MONASTERY_FOOD_COST);
			objects.setMonasteries();
			totalMonasteries.setText("Monasteries: " + objects.getMonasteries());
			objects.setUsedLand(Constants.TIER2_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Philosophy, " + Constants.MONASTERY_PRODUCTION_COST + " Production, "
				    + Constants.MONASTERY_GOLD_COST + " Gold, and " + Constants.MONASTERY_FOOD_COST
				    + " Food to build a Monastery.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildTheater) {
		if (techs.getDrama() && objects.getProduction() >= Constants.THEATER_PRODUCTION_COST
			&& objects.getGold() >= Constants.THEATER_GOLD_COST
			&& objects.getFood() >= Constants.THEATER_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER3_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.THEATER_PRODUCTION_COST);
			objects.loseGold(Constants.THEATER_GOLD_COST);
			objects.loseFood(Constants.THEATER_FOOD_COST);
			objects.setTheaters();
			totalTheaters.setText("Theaters: " + objects.getTheaters());
			objects.setUsedLand(Constants.TIER3_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Drama, " + Constants.THEATER_PRODUCTION_COST + " Production, "
				    + Constants.THEATER_GOLD_COST + " Gold, and " + Constants.THEATER_FOOD_COST
				    + " Food to build a Theater.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildBroadcastTower) {
		if (techs.getRadio() && objects.getProduction() >= Constants.BROADCAST_TOWER_PRODUCTION_COST
			&& objects.getGold() >= Constants.BROADCAST_TOWER_GOLD_COST
			&& objects.getFood() >= Constants.BROADCAST_TOWER_FOOD_COST) {
		    if (objects.getUsedLand() + Constants.TIER4_LAND <= objects.getTotalLand()) {
			objects.loseProduction(Constants.BROADCAST_TOWER_PRODUCTION_COST);
			objects.loseGold(Constants.BROADCAST_TOWER_GOLD_COST);
			objects.loseFood(Constants.BROADCAST_TOWER_FOOD_COST);
			objects.setBroadcastTowers();
			totalBroadcastTowers.setText("Broadcast Towers: " + objects.getBroadcastTowers());
			objects.setUsedLand(Constants.TIER4_LAND);
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    } else
			JOptionPane.showMessageDialog(null,
				"You need more land. Gain culture or win battles to grow your borders.",
				"Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Radio, " + Constants.BROADCAST_TOWER_PRODUCTION_COST + " Production, "
				    + Constants.BROADCAST_TOWER_GOLD_COST + " Gold, and "
				    + Constants.BROADCAST_TOWER_FOOD_COST + " Food to build a Broadcast Tower.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }

	    // builds military units when clicked, making sure prereqs are met
	    // and costs are deducted
	    if (source == buildWarrior) {
		if (objects.getProduction() >= 10 && objects.getGold() >= 15 && objects.getFood() >= 25) {
		    objects.loseProduction(10);
		    objects.loseGold(15);
		    objects.loseFood(25);
		    objects.setMilitaryStrength(1);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need 10 Production, 15 Gold, and 25 Food to build a Warrior.", "Requirements Not Met",
			    JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildSwordsman) {
		if (techs.getMetalCasting() && objects.getProduction() >= 35 && objects.getGold() >= 35
			&& objects.getFood() >= 80) {
		    objects.loseProduction(35);
		    objects.loseGold(35);
		    objects.loseFood(80);
		    objects.setMilitaryStrength(5);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Metal Casting, 35 Production, 35 Gold, and 80 Food to build a Swordsman.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildKnight) {
		if (techs.getChivalry() && objects.getProduction() >= 150 && objects.getGold() >= 150
			&& objects.getFood() >= 200) {
		    objects.loseProduction(150);
		    objects.loseGold(150);
		    objects.loseFood(200);
		    objects.setMilitaryStrength(25);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Chivalry, 150 Production, 150 Gold, and 200 Food to build a Knight.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildInfantryman) {
		if (techs.getGunpowder() && objects.getProduction() >= 450 && objects.getGold() >= 675
			&& objects.getFood() >= 1375) {
		    objects.loseProduction(450);
		    objects.loseGold(675);
		    objects.loseFood(1375);
		    objects.setMilitaryStrength(175);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Gunpowder, 450 Production, 675 Gold, and 1375 Food to build a Infantryman.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if (source == buildTank) {
		if (techs.getIndustrialization() && objects.getProduction() >= 4000 && objects.getGold() >= 4000
			&& objects.getFood() >= 2000) {
		    objects.loseProduction(4000);
		    objects.loseGold(4000);
		    objects.loseFood(2000);
		    objects.setMilitaryStrength(725);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		} else
		    JOptionPane.showMessageDialog(null,
			    "You need Industrialization, 4000 Production, 4000 Gold, and 2000 Food to build a Tank.",
			    "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
	    }

	    // calculates casualty figures battles (1 Strength for 1 Strength,
	    // no force concentration multipliers factored in), checks result of
	    // battle and acts accordingly
	    // loss means destruction of entire army, win means land gain
	    if (source == invadeOutpost) {
		int difference = objects.getMilitaryStrength() - Constants.OUTPOST_STRENGTH;
		if (difference > 0) {
		    JOptionPane.showMessageDialog(null, "You won! You gained " + Constants.OUTPOST_LAND + "Land.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.setTotalLand(Constants.OUTPOST_LAND);
		    landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    objects.loseMilitaryStrength(Constants.OUTPOST_STRENGTH);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		} else {
		    JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.loseMilitaryStrength(objects.getMilitaryStrength());
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}
	    }
	    if (source == invadeTribe) {
		int difference = objects.getMilitaryStrength() - Constants.TRIBE_STRENGTH;
		if (difference > 0) {
		    JOptionPane.showMessageDialog(null, "You won! You gained " + Constants.TRIBE_LAND + " Land.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.setTotalLand(Constants.TRIBE_LAND);
		    landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    objects.loseMilitaryStrength(Constants.TRIBE_STRENGTH);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}

		else {
		    JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.loseMilitaryStrength(objects.getMilitaryStrength());
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}
	    }
	    if (source == invadeVillage) {
		int difference = objects.getMilitaryStrength() - Constants.VILLAGE_STRENGTH;
		if (difference > 0) {
		    JOptionPane.showMessageDialog(null, "You won! You gained " + Constants.VILLAGE_LAND + " Land.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.setTotalLand(Constants.VILLAGE_LAND);
		    landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    objects.loseMilitaryStrength(Constants.VILLAGE_STRENGTH);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}

		else {
		    JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.loseMilitaryStrength(objects.getMilitaryStrength());
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}
	    }
	    if (source == invadeTown) {
		int difference = objects.getMilitaryStrength() - Constants.TOWN_STRENGTH;
		if (difference > 0) {
		    JOptionPane.showMessageDialog(null, "You won! You gained " + Constants.TOWN_LAND + " Land.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.setTotalLand(Constants.TOWN_LAND);
		    landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    objects.loseMilitaryStrength(Constants.TOWN_STRENGTH);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}

		else {
		    JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.loseMilitaryStrength(objects.getMilitaryStrength());
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}
	    }
	    if (source == invadeCity) {
		int difference = objects.getMilitaryStrength() - Constants.CITY_STRENGTH;
		if (difference > 0) {
		    JOptionPane.showMessageDialog(null, "You won! You gained " + Constants.CITY_LAND + " Land.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.setTotalLand(Constants.CITY_LAND);
		    landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    objects.loseMilitaryStrength(Constants.CITY_STRENGTH);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}

		else {
		    JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.loseMilitaryStrength(objects.getMilitaryStrength());
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}
	    }
	    if (source == invadeCityState) {
		int difference = objects.getMilitaryStrength() - Constants.CITY_STATE_STRENGTH;
		if (difference > 0) {
		    JOptionPane.showMessageDialog(null, "You won! You gained " + Constants.CITY_STATE_LAND + " Land.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.setTotalLand(Constants.CITY_STATE_LAND);
		    landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    objects.loseMilitaryStrength(Constants.CITY_STATE_STRENGTH);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}

		else {
		    JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.loseMilitaryStrength(objects.getMilitaryStrength());
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}
	    }
	    if (source == invadeCountry) {
		int difference = objects.getMilitaryStrength() - Constants.COUNTRY_STRENGTH;
		if (difference > 0) {
		    JOptionPane.showMessageDialog(null, "You won! You gained " + Constants.COUNTRY_LAND + " Land.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.setTotalLand(Constants.COUNTRY_LAND);
		    landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    objects.loseMilitaryStrength(Constants.COUNTRY_STRENGTH);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}

		else {
		    JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.loseMilitaryStrength(objects.getMilitaryStrength());
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}
	    }
	    if (source == invadeEmpire) {
		int difference = objects.getMilitaryStrength() - Constants.EMPIRE_STRENGTH;
		if (difference > 0) {
		    JOptionPane.showMessageDialog(null, "You won! You gained " + Constants.EMPIRE_LAND + " Land.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.setTotalLand(Constants.EMPIRE_LAND);
		    landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		    objects.loseMilitaryStrength(Constants.EMPIRE_STRENGTH);
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}

		else {
		    JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.",
			    "Battle Results", JOptionPane.INFORMATION_MESSAGE);
		    objects.loseMilitaryStrength(objects.getMilitaryStrength());
		    strength.setText("Military Strength: " + objects.getMilitaryStrength());
		}
	    }
	}
    }
}

import javax.swing.JOptionPane;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame
{		
	Resources objects = new Resources();
	Techs techs = new Techs();
	
	//declares JFrame components 
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
	
	
	//JPanels for all techs and buildings so all building and tech types are on different lines
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
	
	
	public GUI()
	{
		super("CivClicker");
		setLayout(new FlowLayout());
		
		//Instantiates JLabels and JButtons for the window
		//buttons and labels for gathering
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
		
		//buttons and labels for techs
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
		
		//buttons and labels for buildings
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
		
		//buttons and labels for military units and strength
		buildWarrior = new JButton("Build Warrior");
		buildSwordsman = new JButton("Build Swordsman");
		buildKnight = new JButton("Build Knight");
		buildInfantryman = new JButton("Build Infantry");
		buildTank = new JButton("Build Tank");
		strength = new JLabel("Military Strength: " + objects.getMilitaryStrength());
		
		//buttons for invasion
		invadeOutpost = new JButton("Invade Outpost");
		invadeTribe = new JButton("Invade Tribe");
		invadeVillage = new JButton("Invade Village");
		invadeTown = new JButton("Invade Town");
		invadeCity = new JButton("Invade City");
		invadeCityState = new JButton("Invade City-State");
		invadeCountry = new JButton("Invade Country");
		invadeEmpire = new JButton("Invade Empire");
		
		//adds generic resource gathering components
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
		
		//adds buttons and labels to respective JPanels
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
		
		//adds ActionListeners for each button
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
	
	//ticker to calculate passive resource gain from buildings
	Timer ticker = new Timer(1000, new TimerListener());

	public class TimerListener implements ActionListener
	{
		//adds passive resource gain and checks for culture border growth
		public void actionPerformed(ActionEvent event)
		{
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
			
			
			if(objects.getExpansions() == 0 && objects.getCulture() >= 10)
			{
				objects.loseCulture(10);
				objects.setTotalLand(3);
				objects.setExpansions();
			}
			if(objects.getCulture() >= (50 * objects.getExpansions()) && objects.getExpansions() != 0)
			{
				objects.loseCulture(50 * objects.getExpansions());
				objects.setTotalLand(3);
				objects.setExpansions();
			}
			
			landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
		}
	}
	
	private class EventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{		
			ticker.start();
			Object source = event.getSource();
			
			//buttons for resources: one click gives one resource each
			if(source == gatherGold)
			{
				objects.setGold();
				gold.setText("Gold: " + objects.getGold());	
			}
			if(source == gatherFood)
			{
				objects.setFood();
				food.setText("Food: " + objects.getFood());
			}
			if(source == gatherProduction)
			{
				objects.setProduction();
				production.setText("Production: " + objects.getProduction());
			}
			if(source == gatherScience)
			{
				objects.setScience();
				science.setText("Science: " + objects.getScience());
			}
			if(source == gatherCulture)
			{
				objects.setCulture();
				culture.setText("Culture: " + objects.getCulture());
			}
			
			
			//buttons added for techs, checks to see if prereqs are met
			if(source == researchPottery)
			{
				if(objects.getScience() >= 30 && techs.getPottery() != true)
				{
					objects.loseScience(30);
					science.setText("Science: " + objects.getScience());
					techs.setPottery();
					researchPottery.setText("Pottery researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 30 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchGuilds && techs.getGuilds() != true)
			{
				if(objects.getScience() >= 200)
				{
					objects.loseScience(200);
					science.setText("Science: " + objects.getScience());
					techs.setGuilds();
					researchGuilds.setText("Guilds researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 200 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchPrintingPress && techs.getPrintingPress() != true)
			{
				if(objects.getScience() >= 1000)
				{
					objects.loseScience(1000);
					science.setText("Science: " + objects.getScience());
					techs.setPrintingPress();
					researchPrintingPress.setText("Printing Press researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 1000 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchElectricity && techs.getElectricity() != true)
			{
				if(objects.getScience() >= 5000)
				{
					objects.loseScience(5000);
					science.setText("Science: " + objects.getScience());
					techs.setElectricity();
					researchElectricity.setText("Electricity researched");	
				}
				else
					JOptionPane.showMessageDialog(null, "You need 5000 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);

			}
			
			if(source == researchAgriculture && techs.getAgriculture() != true)
			{
				if(objects.getScience() >= 30)
				{
					objects.loseScience(30);
					science.setText("Science: " + objects.getScience());
					techs.setAgriculture();
					researchAgriculture.setText("Agriculture researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 30 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchMathematics && techs.getMathematics() != true)
			{
				if(objects.getScience() >= 200)
				{
					objects.loseScience(200);
					science.setText("Science: " + objects.getScience());
					techs.setMathematics();
					researchMathematics.setText("Mathematics researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 200 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchChemistry && techs.getChemistry() != true)
			{
				if(objects.getScience() >= 1000)
				{
					objects.loseScience(1000);
					science.setText("Science: " + objects.getScience());
					techs.setChemistry();
					researchChemistry.setText("Chemistry researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 1000 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchGenetics && techs.getGenetics() != true)
			{
				if(objects.getScience() >= 5000)
				{
					objects.loseScience(5000);
					science.setText("Science: " + objects.getScience());
					techs.setGenetics();
					researchGenetics.setText("Genetics researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 5000 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(source == researchMining && techs.getMining() != true)
			{
				if(objects.getScience() >= 30)
				{
					objects.loseScience(30);
					science.setText("Science: " + objects.getScience());
					techs.setMining();
					researchMining.setText("Mining researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 30 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchIronWorking && techs.getIronWorking() != true)
			{
				if(objects.getScience() >= 200)
				{
					objects.loseScience(200);
					science.setText("Science: " + objects.getScience());
					techs.setIronWorking();
					researchIronWorking.setText("Iron Working researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 200 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchSteamPower && techs.getSteamPower() != true)
			{
				if(objects.getScience() >= 1000)
				{
					objects.loseScience(1000);
					science.setText("Science: " + objects.getScience());
					techs.setSteamPower();
					researchSteamPower.setText("Steam Power researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 1000 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchFission && techs.getFission() != true)
			{
				if(objects.getScience() >= 5000)
				{
					objects.loseScience(5000);
					science.setText("Science: " + objects.getScience());
					techs.setFission();
					researchFission.setText("Fission researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 5000 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(source == researchWriting && techs.getWriting() != true)
			{
				if(objects.getScience() >= 30)
				{
					objects.loseScience(30);
					science.setText("Science: " + objects.getScience());
					techs.setWriting();
					researchWriting.setText("Writing researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 30 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchPaper && techs.getPaper() != true)
			{
				if(objects.getScience() >= 200)
				{
					objects.loseScience(200);
					science.setText("Science: " + objects.getScience());
					techs.setPaper();
					researchPaper.setText("Paper researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 200 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchEducation && techs.getEducation() != true)
			{
				if(objects.getScience() >= 1000)
				{
					objects.loseScience(1000);
					science.setText("Science: " + objects.getScience());
					techs.setEducation();
					researchEducation.setText("Education researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 1000 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchScientificMethod && techs.getScientificMethod() != true)
			{
				if(objects.getScience() >= 5000)
				{
					objects.loseScience(5000);
					science.setText("Science: " + objects.getScience());
					techs.setScientificMethod();
					researchScientificMethod.setText("Scientific Method researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 5000 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(source == researchMasonry && techs.getMasonry() != true)
			{
				if(objects.getScience() >= 30)
				{
					objects.loseScience(30);
					science.setText("Science: " + objects.getScience());
					techs.setMasonry();
					researchMasonry.setText("Masonry researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 30 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchPhilosophy && techs.getPhilosophy() != true)
			{
				if(objects.getScience() >= 200)
				{
					objects.loseScience(200);
					science.setText("Science: " + objects.getScience());
					techs.setPhilosophy();
					researchPhilosophy.setText("Philosophy researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 200 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchDrama && techs.getDrama() != true)
			{
				if(objects.getScience() >= 1000)
				{
					objects.loseScience(1000);
					science.setText("Science: " + objects.getScience());
					techs.setDrama();
					researchDrama.setText("Drama researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 1000 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchRadio && techs.getRadio() != true)
				
			{
				if(objects.getScience() >= 5000)
				{
					objects.loseScience(5000);
					science.setText("Science: " + objects.getScience());
					techs.setRadio();
					researchRadio.setText("Radio researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 5000 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(source == researchMetalCasting && techs.getMetalCasting() != true)
			{
				if(objects.getScience() >= 30)
				{
					objects.loseScience(30);
					science.setText("Science: " + objects.getScience());
					techs.setMetalCasting();
					researchMetalCasting.setText("Metal Casting researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 30 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchChivalry && techs.getChivalry() != true)
			{
				if(objects.getScience() >= 200)
				{
					objects.loseScience(200);
					science.setText("Science: " + objects.getScience());
					techs.setChivalry();
					researchChivalry.setText("Chivalry researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 200 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchGunpowder && techs.getGunpowder() != true)
			{
				if(objects.getScience() >= 1000)
				{
					objects.loseScience(1000);
					science.setText("Science: " + objects.getScience());
					techs.setGunpowder();
					researchGunpowder.setText("Gunpowder researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 1000 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == researchIndustrialization && techs.getIndustrialization() != true)
			{
				if(objects.getScience() >= 5000)
				{
					objects.loseScience(5000);
					science.setText("Science: " + objects.getScience());
					techs.setIndustrialization();
					researchIndustrialization.setText("Industrialization researched");
				}
				else
					JOptionPane.showMessageDialog(null, "You need 5000 Science to research this tech.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			//buttons for buildings 
			if(source == buildCottage)
			{
				if(techs.getPottery() && objects.getProduction() >= 25 && objects.getGold() >= 15 && objects.getFood() >= 10)
				{
					if(objects.getUsedLand() < objects.getTotalLand())
					{
						objects.loseProduction(25);
						objects.loseGold(15);
						objects.loseFood(10);
						objects.setCottages();
						totalCottages.setText("Cottages: " + objects.getCottages());
						objects.setUsedLand();
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Pottery, 25 Production, 15 Gold, and 10 Food to build a Cottage.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildHamlet)
			{
				if(techs.getGuilds() && objects.getProduction() >= 100 && objects.getGold() >= 60 && objects.getFood() >= 40)
				{
					if(objects.getUsedLand() < objects.getTotalLand())
					{
						objects.loseProduction(100);
						objects.loseGold(60);
						objects.loseFood(40);
						objects.setHamlets();
						totalHamlets.setText("Hamlets: " + objects.getHamlets());
						objects.setUsedLand(3);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Guilds, 100 Production, 60 Gold, and 40 Food to build a Hamlet.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildVillage)
			{
				if(techs.getPrintingPress() && objects.getProduction() >= 500 && objects.getGold() >= 300 && objects.getFood() >= 200)
				{
					if(objects.getUsedLand() < objects.getTotalLand())
					{
						objects.loseProduction(500);
						objects.loseGold(300);
						objects.loseFood(200);
						objects.setVillages();
						totalVillages.setText("Villages: " + objects.getVillages());
						objects.setUsedLand(5);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Printing Press, 500 Production, 300 Gold, and 200 Food to build a Village.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildTown)
			{
				if(techs.getElectricity() && objects.getProduction() >= 2000 && objects.getGold() >= 1200 && objects.getFood() >= 800)
				{
					if(objects.getUsedLand() < objects.getTotalLand())
					{
						objects.loseProduction(2000);
						objects.loseGold(1200);
						objects.loseFood(800);
						objects.setTowns();
						totalTowns.setText("Towns: " + objects.getTowns());
						objects.setUsedLand(10);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Electricity, 2000 Production, 1200 Gold, and 800 Food to build a Town.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(source == buildFarm)
			{
				if(techs.getAgriculture() && objects.getProduction() >= 20 && objects.getGold() >= 10 && objects.getFood() >= 20)
				{
					if(objects.getUsedLand() < objects.getTotalLand())
					{
						objects.loseProduction(20);
						objects.loseGold(10);
						objects.loseFood(20);
						objects.setFarms();
						totalFarms.setText("Farms: " + objects.getFarms());
						objects.setUsedLand();
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Agriculture, 20 Production, 10 Gold, and 20 Food to build a Farm.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildIrrigatedFarm)
			{
				if(techs.getMathematics() && objects.getProduction() >= 80 && objects.getGold() >= 40 && objects.getFood() >= 80)
				{
					if(objects.getUsedLand() + 2 < objects.getTotalLand())
					{
						objects.loseProduction(80);
						objects.loseGold(40);
						objects.loseFood(80);
						objects.setIrrigatedFarms();
						totalIrrigatedFarms.setText("Irrigated Farms: " + objects.getIrrigatedFarms());
						objects.setUsedLand(3);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Mathematics, 80 Production, 40 Gold, and 80 Food to build an Irrigated Farm.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildFertilizedFarm)
			{
				if(techs.getChemistry() && objects.getProduction() >= 400 && objects.getGold() >= 200 && objects.getFood() >= 400)
				{
					if(objects.getUsedLand() + 4 < objects.getTotalLand())
					{
						objects.loseProduction(400);
						objects.loseGold(200);
						objects.loseFood(400);
						objects.setFertilizedFarms();
						totalFertilizedFarms.setText("Fertilized Farms: " + objects.getFertilizedFarms());
						objects.setUsedLand(5);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Chemistry, 400 Production, 200 Gold, and 400 Food to build a Fertilized Farm.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildGMcropFarm)
			{
				if(techs.getGenetics() && objects.getProduction() >= 1600 && objects.getGold() >= 800 && objects.getFood() >= 1600)
				{
					if(objects.getUsedLand() + 9 < objects.getTotalLand())
					{
						objects.loseProduction(1600);
						objects.loseGold(800);
						objects.loseFood(1600);
						objects.setGMcropFarms();
						totalGMcropFarms.setText("GM Crop Farms: " + objects.getGMcropFarms());
						objects.setUsedLand(10);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Genetics, 1600 Production, 800 Gold, and 1600 Food to build a Genetically Modified Crop Farm.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(source == buildMine)
			{
				if(techs.getMining() && objects.getProduction() >= 35 && objects.getGold() >= 10 && objects.getFood() >= 5)
				{
					if(objects.getUsedLand() < objects.getTotalLand())
					{
						objects.loseProduction(35);
						objects.loseGold(10);
						objects.loseFood(5);
						objects.setMines();
						totalMines.setText("Mines: " + objects.getMines());
						objects.setUsedLand();
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Mining, 35 Production, 10 Gold, and 5 Food to build a Mine.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildIronMine)
			{
				if(techs.getIronWorking() && objects.getProduction() >= 140 && objects.getGold() >= 40 && objects.getFood() >= 20)
				{
					if(objects.getUsedLand() + 2 < objects.getTotalLand())
					{
						objects.loseProduction(140);
						objects.loseGold(40);
						objects.loseFood(20);
						objects.setIronMines();
						totalIronMines.setText("Iron Mines: " + objects.getIronMines());
						objects.setUsedLand(3);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Iron Working, 140 Production, 40 Gold, and 20 Food to build a Iron Mine.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildCoalMine)
			{
				if(techs.getSteamPower() && objects.getProduction() >= 700 && objects.getGold() >= 200 && objects.getFood() >= 100)
				{
					if(objects.getUsedLand() + 4 < objects.getTotalLand())
					{
						objects.loseProduction(700);
						objects.loseGold(200);
						objects.loseFood(100);
						objects.setCoalMines();
						totalCoalMines.setText("Coal Mines: " + objects.getCoalMines());
						objects.setUsedLand(5);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Steam Power, 700 Production, 200 Gold, and 100 Food to build a Coal Mine.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildUraniumMine)
			{
				if(techs.getFission() && objects.getProduction() >= 2800 && objects.getGold() >= 800 && objects.getFood() >= 400)
				{
					if(objects.getUsedLand() + 9 < objects.getTotalLand())
					{
						objects.loseProduction(2800);
						objects.loseGold(800);
						objects.loseFood(400);
						objects.setUraniumMines();
						totalUraniumMines.setText("Uranium Mines: " + objects.getUraniumMines());
						objects.setUsedLand(10);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Fission, 2800 Production, 800 Gold, and 400 Food to build a Uranium Mine.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(source == buildLibrary)
			{
				if(techs.getWriting() && objects.getProduction() >= 15 && objects.getGold() >= 20 && objects.getFood() >= 15)
				{
					if(objects.getUsedLand() < objects.getTotalLand())
					{
						objects.loseProduction(15);
						objects.loseGold(20);
						objects.loseFood(15);
						objects.setLibraries();
						totalLibraries.setText("Libraries: " + objects.getLibraries());
						objects.setUsedLand();
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Writing, 15 Production, 20 Gold, and 15 Food to build a Library.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildUniversity)
			{
				if(techs.getPaper() && objects.getProduction() >= 60 && objects.getGold() >= 80 && objects.getFood() >= 60)
				{
					if(objects.getUsedLand() + 2 < objects.getTotalLand())
					{
						objects.loseProduction(60);
						objects.loseGold(80);
						objects.loseFood(60);
						objects.setUniversities();
						totalUniversities.setText("Universities: " + objects.getUniversities());
						objects.setUsedLand(3);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Paper, 60 Production, 80 Gold, and 60 Food to build a University.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildPublicSchool)
			{
				if(techs.getEducation() && objects.getProduction() >= 300 && objects.getGold() >= 400 && objects.getFood() >= 300)
				{
					if(objects.getUsedLand() + 4 < objects.getTotalLand())
					{
						objects.loseProduction(300);
						objects.loseGold(400);
						objects.loseFood(300);
						objects.setPublicSchools();
						totalPublicSchools.setText("Public Schools: " + objects.getPublicSchools());
						objects.setUsedLand(5);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Education, 300 Production, 400 Gold, and 300 Food to build a Public School.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildResearchLab)
			{
				if(techs.getScientificMethod() && objects.getProduction() >= 1200 && objects.getGold() >= 1600 && objects.getFood() >= 1200)
				{
					if(objects.getUsedLand() + 9 < objects.getTotalLand())
					{
						objects.loseProduction(1200);
						objects.loseGold(1600);
						objects.loseFood(1200);
						objects.setResearchLabs();
						totalResearchLabs.setText("Research Labs: " + objects.getResearchLabs());
						objects.setUsedLand(10);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Scientific Method, 1200 Production, 1600 Gold, and 1200 Food to build a Research Lab.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(source == buildMonument)
			{
				if(techs.getMasonry() && objects.getProduction() >= 20 && objects.getGold() >= 20 && objects.getFood() >= 10)
				{
					if(objects.getUsedLand() < objects.getTotalLand())
					{
						objects.loseProduction(20);
						objects.loseGold(20);
						objects.loseFood(10);
						objects.setMonuments();
						totalMonuments.setText("Monuments: " + objects.getMonuments());
						objects.setUsedLand();
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Masonry, 20 Production, 20 Gold, and 10 Food to build a Monument.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildMonastery)
			{
				if(techs.getPhilosophy() && objects.getProduction() >= 80 && objects.getGold() >= 80 && objects.getFood() >= 40)
				{
					if(objects.getUsedLand() + 2 < objects.getTotalLand())
					{
						objects.loseProduction(80);
						objects.loseGold(80);
						objects.loseFood(40);
						objects.setMonasteries();
						totalMonasteries.setText("Monasteries: " + objects.getMonasteries());
						objects.setUsedLand(3);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Philosophy, 80 Production, 80 Gold, and 40 Food to build a Monastery.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildTheater)
			{
				if(techs.getDrama() && objects.getProduction() >= 400 && objects.getGold() >= 400 && objects.getFood() >= 200)
				{
					if(objects.getUsedLand() + 4 < objects.getTotalLand())
					{
						objects.loseProduction(400);
						objects.loseGold(400);
						objects.loseFood(200);
						objects.setTheaters();
						totalTheaters.setText("Theaters: " + objects.getTheaters());
						objects.setUsedLand(5);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Drama, 400 Production, 400 Gold, and 200 Food to build a Theater.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildBroadcastTower)
			{
				if(techs.getRadio() && objects.getProduction() >= 1600 && objects.getGold() >= 1600 && objects.getFood() >= 800)
				{
					if(objects.getUsedLand() + 9 < objects.getTotalLand())
					{
						objects.loseProduction(1600);
						objects.loseGold(1600);
						objects.loseFood(800);
						objects.setBroadcastTowers();
						totalBroadcastTowers.setText("Broadcast Towers: " + objects.getBroadcastTowers());
						objects.setUsedLand(10);
						landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					}
					else
						JOptionPane.showMessageDialog(null, "You need more land. Gain culture or win battles to grow your borders.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "You need Radio, 1600 Production, 1600 Gold, and 800 Food to build a Broadcast Tower.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			//builds military units when clicked, making sure prereqs are met and costs are deducted
			if(source == buildWarrior)
			{
				if(objects.getProduction() >= 10 && objects.getGold() >= 15 && objects.getFood() >= 25)
				{
					objects.loseProduction(10);
					objects.loseGold(15);
					objects.loseFood(25);
					objects.setMilitaryStrength(1);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
				else
					JOptionPane.showMessageDialog(null, "You need 10 Production, 15 Gold, and 25 Food to build a Warrior.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildSwordsman)
			{
				if(techs.getMetalCasting() && objects.getProduction() >= 35 && objects.getGold() >= 35 && objects.getFood() >= 80)
				{
					objects.loseProduction(35);
					objects.loseGold(35);
					objects.loseFood(80);
					objects.setMilitaryStrength(5);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
				else
					JOptionPane.showMessageDialog(null, "You need Metal Casting, 35 Production, 35 Gold, and 80 Food to build a Swordsman.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildKnight)
			{
				if(techs.getChivalry() && objects.getProduction() >= 150 && objects.getGold() >= 150 && objects.getFood() >= 200)
				{
					objects.loseProduction(150);
					objects.loseGold(150);
					objects.loseFood(200);
					objects.setMilitaryStrength(25);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
				else
					JOptionPane.showMessageDialog(null, "You need Chivalry, 150 Production, 150 Gold, and 200 Food to build a Knight.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildInfantryman)
			{
				if(techs.getGunpowder() && objects.getProduction() >= 450 && objects.getGold() >= 675 && objects.getFood() >= 1375)
				{
					objects.loseProduction(450);
					objects.loseGold(675);
					objects.loseFood(1375);
					objects.setMilitaryStrength(175);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
				else
					JOptionPane.showMessageDialog(null, "You need Gunpowder, 450 Production, 675 Gold, and 1375 Food to build a Infantryman.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			if(source == buildTank)
			{
				if(techs.getIndustrialization() && objects.getProduction() >= 4000 && objects.getGold() >= 4000 && objects.getFood() >= 2000)
				{
					objects.loseProduction(4000);
					objects.loseGold(4000);
					objects.loseFood(2000);
					objects.setMilitaryStrength(725);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
				else
					JOptionPane.showMessageDialog(null, "You need Industrialization, 4000 Production, 4000 Gold, and 2000 Food to build a Tank.", "Requirements Not Met", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			//calculates casualty figures battles (1 Strength for 1 Strength, no force concentration multipliers factored in), checks result of battle and acts accordingly
			//loss means destruction of entire army, win means land gain
			if(source == invadeOutpost)
			{
				int difference = objects.getMilitaryStrength() - 15;
				if(difference > 0)
				{
					JOptionPane.showMessageDialog(null, "You won! You gained 2 Land.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.setTotalLand(2);
					landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					objects.loseMilitaryStrength(15);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.loseMilitaryStrength(objects.getMilitaryStrength());
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
			}
			if(source == invadeTribe)
			{
				int difference = objects.getMilitaryStrength() - 50;
				if(difference > 0)
				{
					JOptionPane.showMessageDialog(null, "You won! You gained 5 Land.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.setTotalLand(5);
					landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					objects.loseMilitaryStrength(50);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
					
				
				else
				{
					JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.loseMilitaryStrength(objects.getMilitaryStrength());
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
			}
			if(source == invadeVillage)
			{
				int difference = objects.getMilitaryStrength() - 500;
				if(difference > 0)
				{
					JOptionPane.showMessageDialog(null, "You won! You gained 25 Land.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.setTotalLand(25);
					landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					objects.loseMilitaryStrength(500);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
					
				
				else
				{
					JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.loseMilitaryStrength(objects.getMilitaryStrength());
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
			}
			if(source == invadeTown)
			{
				int difference = objects.getMilitaryStrength() - 5000;
				if(difference > 0)
				{
					JOptionPane.showMessageDialog(null, "You won! You gained 50 Land.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.setTotalLand(50);
					landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					objects.loseMilitaryStrength(5000);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
					
				
				else
				{
					JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.loseMilitaryStrength(objects.getMilitaryStrength());
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
			}
			if(source == invadeCity)
			{
				int difference = objects.getMilitaryStrength() - 25000;
				if(difference > 0)
				{
					JOptionPane.showMessageDialog(null, "You won! You gained 100 Land.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.setTotalLand(100);
					landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					objects.loseMilitaryStrength(25000);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
					
				
				else
				{
					JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.loseMilitaryStrength(objects.getMilitaryStrength());
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
			}
			if(source == invadeCityState)
			{
				int difference = objects.getMilitaryStrength() - 100000;
				if(difference > 0)
				{
					JOptionPane.showMessageDialog(null, "You won! You gained 250 Land.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.setTotalLand(250);
					landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					objects.loseMilitaryStrength(100000);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
					
				
				else
				{
					JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.loseMilitaryStrength(objects.getMilitaryStrength());
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
			}
			if(source == invadeCountry)
			{
				int difference = objects.getMilitaryStrength() - 400000;
				if(difference > 0)
				{
					JOptionPane.showMessageDialog(null, "You won! You gained 500 Land.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.setTotalLand(500);
					landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					objects.loseMilitaryStrength(400000);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
					
				
				else
				{
					JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.loseMilitaryStrength(objects.getMilitaryStrength());
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
			}
			if(source == invadeEmpire)
			{
				int difference = objects.getMilitaryStrength() - 1000000;
				if(difference > 0)
				{
					JOptionPane.showMessageDialog(null, "You won! You gained 1000 Land.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.setTotalLand(1000);
					landUse.setText("Land: " + objects.getUsedLand() + "/" + objects.getTotalLand());
					objects.loseMilitaryStrength(1000000);
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
					
				
				else
				{
					JOptionPane.showMessageDialog(null, "You lost. Your entire army has been wiped out.", "Battle Results", JOptionPane.INFORMATION_MESSAGE);
					objects.loseMilitaryStrength(objects.getMilitaryStrength());
					strength.setText("Military Strength: " + objects.getMilitaryStrength());
				}
			}
		}
	}
}

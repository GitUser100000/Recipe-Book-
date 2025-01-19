// imports all java libraries needed.
import java.text.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

// creates a class extending a JPanel implementing an ActionListener.
class RecipeSAT extends JPanel implements ActionListener 
// opens class.
{ 
	// defining objects.
	 JPanel panel = new JPanel();
	 JLabel selectionLabel, outputLabel, fillerLabel1,fillerLabel2, fillerLabel3, fillerLabel4, fillerLabel5, fillerLabel6, fillerLabel7, fillerLabel8, fillerLabel9, fillerLabel10, fillerLabel11, fillerLabel12, fillerLabel13, fillerLabel14, fillerLabel15, fillerLabel16, fillerLabel17, fillerLabel18, fillerLabel19, fillerLabel20;
	 JComboBox recipeSelection;
	 JButton nextOption, prevOption, showButton;

// calling the main method.
public static void main(String[] args)
	// Opens the main method.
	{
		// creates JFarame called frame with the title of "Recipe Book".
		JFrame frame = new JFrame("Recipe Book");
		// creating a constructor called RecipeSAT.
		RecipeSAT myButtonPanel = new RecipeSAT();
		// adds the buttonPanel to the frame.
		frame.add(myButtonPanel);

		// setting dimensions, colour and visibility to the frame.
		myButtonPanel.setBackground(Color.pink);
		frame.setSize(830,403);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//closes main method.
	}

	// calls constructor RecipeSAT.
	public  RecipeSAT() 
	 // opens constructor
	 { 
		// sets the panel colour.
		panel.setBackground(Color.pink);

		// initilises objects.
		selectionLabel = new JLabel("Select a recipe: ");
		showButton = new JButton("0");
		
		// creates an array with Strings referring to the recipes.
		String[] recipeList = {"Banana Bread", "Brownies", "Chocolate Chip Cookies", "Chocolate Mousse", "Chocolate Truffles", "Rocky Road", "Vanilla Slice"};
		// places the Strings of the array into a combo box.
		recipeSelection = new JComboBox(recipeList);
		
		// initilises objects.
		outputLabel = new JLabel("Page Number:");
		nextOption = new JButton("next step >>"); 
		prevOption = new JButton("<< previous step");
		
		// initilises objects.
		fillerLabel1 = new JLabel("0");
		fillerLabel2 = new JLabel();
		fillerLabel3 = new JLabel("Welcome to the");
		fillerLabel4 = new JLabel();
		fillerLabel5 = new JLabel("Recipe Book");
		fillerLabel6 = new JLabel("Steps will be shown here");
		fillerLabel7 = new JLabel();
		fillerLabel8 = new JLabel();
		fillerLabel9 = new JLabel();
		fillerLabel10 = new JLabel("Click \"Next Step\" to show the first step");
		fillerLabel11 = new JLabel();
		fillerLabel12 = new JLabel();
		fillerLabel13 = new JLabel();
		fillerLabel14 = new JLabel();
		fillerLabel15 = new JLabel();
		fillerLabel16 = new JLabel();
		fillerLabel17 = new JLabel();
		fillerLabel18 = new JLabel();
		fillerLabel19 = new JLabel();
		fillerLabel20 = new JLabel();
		
		// setting the panel to a grid layout 20(L) x 2(W). 
		panel.setLayout(new GridLayout(20,2,100,1)); 
		
		// adding ActionListener and index number to recipeSelection.
		recipeSelection.setSelectedIndex(1);
		recipeSelection.addActionListener(this);
		
		// adds ActionListener to objects.
		nextOption.addActionListener(this);
		prevOption.addActionListener(this);
		// sets font, size and to bold for objects.
		fillerLabel3.setFont (new Font("helvetica", Font.BOLD, 18));
		fillerLabel5.setFont (new Font("helvetica", Font.BOLD, 18));
		
		// adds objects to panel in order of position.
		panel.add(selectionLabel);
		panel.add(outputLabel);
		panel.add(recipeSelection);
		panel.add(showButton);
		panel.add(fillerLabel1);
		panel.add(fillerLabel2);
		panel.add(fillerLabel3);
		panel.add(fillerLabel4);
		panel.add(fillerLabel5);
		panel.add(fillerLabel6);
		panel.add(fillerLabel7);
		panel.add(fillerLabel8);
		panel.add(fillerLabel9);
		panel.add(fillerLabel10);
		panel.add(fillerLabel11);
		panel.add(fillerLabel12);
		panel.add(fillerLabel13);
		panel.add(fillerLabel14);
		panel.add(fillerLabel15);
		panel.add(fillerLabel16);
		panel.add(fillerLabel17);
		panel.add(fillerLabel18);
		panel.add(fillerLabel19);
		panel.add(fillerLabel20);
		panel.add(prevOption);
		panel.add(nextOption);
		
		// adds the panel to the frame.
		add(panel);

	// closes constructor.
	 }
	
	// opens an action event method taking in ac action event e.
	public void actionPerformed(ActionEvent e) 
	// opens the method.
	{
		// defines the event obect that corresponds to the ActionEvent.
		Object event = e.getSource();

		// creating a string called page, taking in the text of showButton.
		String page = showButton.getText();
		// placing the value of the String page in an int called pageNumber.
		int pageNumber = Integer.parseInt(page);
		// setting a String called setPageNumber to "NULL".
		String setPageNumber = "NULL";	
		
		// creating a string called choiceHolder, taking in the text of showButton.
		String choiceHolder = fillerLabel1.getText();
		// placing the choice of the String choiceHolder in an int called pageNumber.
		int choice = Integer.parseInt(choiceHolder);
		// setting a String called choiceSetter to "NULL".
		String choiceSetter = "NULL";
		
		// opening an if statement if event == recipe slection.
		if (event == recipeSelection) 
		{
			// if the satement is true, creates a JComboBox cb and gets the source of the recipe selected.
			JComboBox cb = (JComboBox)e.getSource();
			//places the source recipe in a string called msg.
			String msg = (String)cb.getSelectedItem();
			// validation in command prompt to check the contents of msg.
			System.out.println(msg);
			
			// opnes a switch based on msg.
			switch (msg)
			{
			
			// if msg is "Banana Bread", choice is 1 and the labels will be set to the following.
			case "Banana Bread": choice = 1;
					choiceSetter = Integer.toString(choice);
					fillerLabel1.setText(choiceSetter);
					System.out.println("choice is " + choice);
					fillerLabel7.setText("INGREDIENTS: Melted butter, 265g of self raising flour,");
					fillerLabel9.setText("40g of plain flour, 1 teaspoon of cinnamon,");
					fillerLabel11.setText("140g of brown sugar, 2 overripe mashed bananas,");
					fillerLabel13.setText("2 whisked eggs, 125ml of skim milk,");
					fillerLabel15.setText("50g of cool melted butter.");
				break;
			// if msg is "Brownies", choice is 2 and the labels will be set to the following.
			case "Brownies": choice = 2;
					choiceSetter = Integer.toString(choice);
					fillerLabel1.setText(choiceSetter);
					System.out.println("choice is " + choice);
					fillerLabel7.setText("INGREDIENTS: 125g of chopped butter,");
					fillerLabel9.setText("3 lightly whisked eggs, 335g of white sugar,");
					fillerLabel11.setText("115g of plain flower, 30g of cocoa powder,");
					fillerLabel13.setText("1 teaspoon of vanilla extract, a pinch of salt.");
					fillerLabel15.setText("");
				break;
			// if msg is "Chocolate Chip Cookies", choice is 3 and the labels will be set to the following.
			case "Chocolate Chip Cookies": choice = 3;
					choiceSetter = Integer.toString(choice);
					fillerLabel1.setText(choiceSetter);
					System.out.println("choice is " + choice);
					fillerLabel7.setText("INGREDIENTS: 150g butter, 1/2 cup of brown sugar,");
					fillerLabel9.setText("1/2 cup of caster sugar, 1 egg, 1 teasoppon of vanilla extract,");
					fillerLabel11.setText("1 and 1/3 cups of plain flower,");
					fillerLabel13.setText("1/2 cups of chocolate bits + one extra tablesoon.");
					fillerLabel15.setText("");
				break;
			// if msg is "Chocolate Mousse", choice is 4 and the labels will be set to the following.
			case "Chocolate Mousse": choice = 4;
					choiceSetter = Integer.toString(choice);
					fillerLabel1.setText(choiceSetter);
					System.out.println("choice is " + choice);
					fillerLabel7.setText("INGREDIENTS: 300g dark chocolate,");
					fillerLabel9.setText("3 room temperature eggs, 55g of caster sugar,");
					fillerLabel11.setText("1 tablesoppn of sifted cocoa powder,");
					fillerLabel13.setText("300ml thickened cream, grated chocolate.");
					fillerLabel15.setText("");
				break;
			// if msg is "Chocolate Truffles", choice is 5 and the labels will be set to the following.
			case "Chocolate Truffles": choice = 5;
					choiceSetter = Integer.toString(choice);
					fillerLabel1.setText(choiceSetter);
					System.out.println("choice is " + choice);
					fillerLabel7.setText("INGREDIENTS: 250g of plain biscuits, 1/3 cup of cocoa powder,");
					fillerLabel9.setText("1 cup of desiccated coconut,");
					fillerLabel11.setText("395g of condensed milk.");
					fillerLabel13.setText("");
					fillerLabel15.setText("");
				break;
			// if msg is "Rocky Road", choice is 6 and the labels will be set to the following.
			case "Rocky Road": choice = 6;
					choiceSetter = Integer.toString(choice);
					fillerLabel1.setText(choiceSetter);
					System.out.println("choice is " + choice);
					fillerLabel7.setText("200g of milk chocolate, 75g of dark chocoalte,");
					fillerLabel9.setText("25g of butter, 50 mixed colour marshmallows,");
					fillerLabel11.setText("50g shortbread biscuits, chopped into bite size,");
					fillerLabel13.setText("50g of rasberry jelly candies.");
					fillerLabel15.setText("");
				break;
			// if msg is "Vanilla Slice", choice is 7 and the labels will be set to the following.
			case "Vanilla Slice": choice = 7;
					choiceSetter = Integer.toString(choice);
					fillerLabel1.setText(choiceSetter);
					System.out.println("choice is " + choice);
					fillerLabel7.setText("INGREDIENTS: 2 Puff pastry sheets, 250ml milk,");
					fillerLabel9.setText("1 vanilla bean, 3/4 cup of cornflower,");
					fillerLabel11.setText("1/2 cup custard powder, 1 cup caster sugar, 3 cups of");
					fillerLabel13.setText("thickened cream, 50g butter, 3 egg yolks, icing sugar.");
				break;

			}
		// ends switch.
		} 
	
	// if event == nextOption then the following will run.
	if (event == nextOption)
	{
		// testing for choice and page number in command prompt.
		System.out.println("choice is "+ choice);
		System.out.println("PN: " + pageNumber);
		System.out.print("next step");

		// grabs the contents of showButton and turns it into an integer.
		page = showButton.getText();
		pageNumber = Integer.parseInt(page);
		
		// if pageNumber is less than zero the following will run.
		if (pageNumber < 0)
		{
			// validation for out of bounds area.
			pageNumber = 1;
			setPageNumber = Integer.toString(pageNumber);
			showButton.setText(setPageNumber);
		}
		// else if pageNumber is larger than 6 the following will run.
		else if (pageNumber > 6)
		{	
			// validation for out of bounds area.
			pageNumber = 6;
			setPageNumber = Integer.toString(pageNumber);
			showButton.setText(setPageNumber);
		} 

			// if choice is 1, then the following will run.
			if (choice == 1) 
			{
				System.out.println("choice is 1");
				// if the page number is 0, then the following will run.
				if (pageNumber == 0)
				{
					// sets the labels to shown the step.
					fillerLabel7.setText("INGREDIENTS: Melted butter, 265g of self raising flour,");
					fillerLabel9.setText("40g of plain flour, 1 teaspoon of cinnamon,");
					fillerLabel11.setText("140g of brown sugar, 2 overripe mashed bananas,");
					fillerLabel13.setText("2 whisked eggs, 125ml of skim milk,");
					fillerLabel15.setText("50g of cool melted butter.");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 1, then the following will run.
				else if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 1: Preheat oven to 180°C. Brush an 11 x 21cm");
					fillerLabel6.setText("(base measurement) loaf pan with melted dairy spread");
					fillerLabel8.setText("to lightly grease.");
					fillerLabel10.setText("Line the base and 2 opposite sides with non-stick");
					fillerLabel12.setText("baking paper, allowing it to overhang.");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: Melted butter, 265g of self raising flour,");
					fillerLabel9.setText("40g of plain flour, 1 teaspoon of cinnamon,");
					fillerLabel11.setText("140g of brown sugar, 2 overripe mashed bananas,");
					fillerLabel13.setText("2 whisked eggs, 125ml of skim milk,");
					fillerLabel15.setText("50g of cool melted butter.");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 2: Sift the combined flours and cinnamon into a");
					fillerLabel6.setText("large bowl. Stir in the sugar and make a well");
					fillerLabel8.setText("in the centre. Mash bananas in a medium bowl.");
					fillerLabel10.setText("Add the eggs, milk, and melted butter,");
					fillerLabel12.setText("and stir until well combined. ");
					fillerLabel10.setText("Add the banana mixture to the flour mixture and stir");
					fillerLabel12.setText("just combined. Spoon the mixture");
					fillerLabel14.setText("into the prepared pan and smooth the surface.");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: Melted butter, 265g of self raising flour,");
					fillerLabel9.setText("40g of plain flour, 1 teaspoon of cinnamon,");
					fillerLabel11.setText("140g of brown sugar, 2 overripe mashed bananas,");
					fillerLabel13.setText("2 whisked eggs, 125ml of skim milk,");
					fillerLabel15.setText("50g of cool melted butter.");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 3: Bake in preheated oven for 45-50 minutes");
					fillerLabel6.setText("or until a skewer inserted into the centre");
					fillerLabel8.setText("comes out clean.");
					fillerLabel10.setText("Remove from oven and set aside in the pan for 5 minutes.");
					fillerLabel12.setText("Turn onto a wire rack to cool completely.");
					fillerLabel12.setText("Cut into slices to serve.");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: Melted butter, 265g of self raising flour,");
					fillerLabel9.setText("40g of plain flour, 1 teaspoon of cinnamon,");
					fillerLabel11.setText("140g of brown sugar, 2 overripe mashed bananas,");
					fillerLabel13.setText("2 whisked eggs, 125ml of skim milk,");
					fillerLabel15.setText("50g of cool melted butter.");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 4, then the following will run.
				else if (pageNumber == 4)
				{
					pageNumber = 0;
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					System.out.println(pageNumber);
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
			}
		
			else if (choice == 2) 
			{
				System.out.println("choice is 2");
				// if the page number is 0, then the following will run.
				if (pageNumber == 0)
				{
					fillerLabel7.setText("INGREDIENTS: 125g of chopped butter,");
					fillerLabel9.setText("3 lightly whisked eggs, 335g of white sugar,");
					fillerLabel11.setText("115g of plain flower, 30g of cocoa powder,");
					fillerLabel13.setText("1 teaspoon of vanilla extract, a pinch of salt.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 1, then the following will run.
				else if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 1: Preheat oven to 180C/160C fan forced.");
					fillerLabel6.setText("Grease a 20cm (base measurement) square cake pan");
					fillerLabel8.setText("and line with baking paper.");
					fillerLabel10.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 125g of chopped butter,");
					fillerLabel9.setText("3 lightly whisked eggs, 335g of white sugar,");
					fillerLabel11.setText("115g of plain flower, 30g of cocoa powder,");
					fillerLabel13.setText("1 teaspoon of vanilla extract, a pinch of salt.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 2: Place butter and chocolate in a heatproof bowl");
					fillerLabel6.setText("over a saucepan of simmering water");
					fillerLabel8.setText("(don't let the bowl touch the water).");
					fillerLabel10.setText("Stir with a metal spoon until melted. Remove from heat.");
					fillerLabel12.setText("Quickly stir in egg, sugar, flour, cocoa powder,");
					fillerLabel14.setText("vanilla and salt until just combined.");
					fillerLabel16.setText("Pour into prepared pan. Bake for 30 minutes or until");
					fillerLabel18.setText("a skewer inserted in the centre comes out with moist");
					fillerLabel20.setText("crumbs clinging. Set aside to cool completely.");
					fillerLabel7.setText("INGREDIENTS: 125g of chopped butter,");
					fillerLabel9.setText("3 lightly whisked eggs, 335g of white sugar,");
					fillerLabel11.setText("115g of plain flower, 30g of cocoa powder,");
					fillerLabel13.setText("1 teaspoon of vanilla extract, a pinch of salt.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					pageNumber = 0;
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 125g of chopped butter,");
					fillerLabel9.setText("3 lightly whisked eggs, 335g of white sugar,");
					fillerLabel11.setText("115g of plain flower, 30g of cocoa powder,");
					fillerLabel13.setText("1 teaspoon of vanilla extract, a pinch of salt.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
				
			}

			if (choice == 3) 
			{	
				// if the page number is 0, then the following will run.
				if (pageNumber == 0)
				{
					fillerLabel7.setText("INGREDIENTS: 150g butter, 1/2 cup of brown sugar,");
					fillerLabel9.setText("1/2 cup of caster sugar, 1 egg, 1 teasoppon of vanilla extract,");
					fillerLabel11.setText("1 and 1/3 cups of plain flower,");
					fillerLabel13.setText("1/2 cups of chocolate bits + one extra tablesoon.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 1, then the following will run.
				else if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 1: Preheat oven to 180C or 160C fan-forced.");
					fillerLabel6.setText("Line 2 baking trays with baking paper.");
					fillerLabel8.setText("Using an electric mixer or whisking by hand,");
					fillerLabel10.setText("beat butter and sugars and 1-2 minutes or until");
					fillerLabel12.setText("smooth and well combined.");
					fillerLabel14.setText("Beat in egg and vanilla until combined.");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 150g butter, 1/2 cup of brown sugar,");
					fillerLabel9.setText("1/2 cup of caster sugar, 1 egg, 1 teasoppon of vanilla extract,");
					fillerLabel11.setText("1 and 1/3 cups of plain flower,");
					fillerLabel13.setText("1/2 cups of chocolate bits + one extra tablesoon.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 2: Stir in flour. Stir in dark and milk choc bits.");
					fillerLabel6.setText("Roll 2 level tablespoonfuls of mixture into balls");
					fillerLabel8.setText("and place on prepared trays, 3cm apart.");
					fillerLabel10.setText("Press down slightly. Decorate with extra choc bits.");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 150g butter, 1/2 cup of brown sugar,");
					fillerLabel9.setText("1/2 cup of caster sugar, 1 egg, 1 teasoppon of vanilla extract,");
					fillerLabel11.setText("1 and 1/3 cups of plain flower,");
					fillerLabel13.setText("1/2 cups of chocolate bits + one extra tablesoon.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 3: Bake for 15-18 minutes or until");
					fillerLabel6.setText("light golden and cooked. Transfer to a wire rack to cool.");
					fillerLabel8.setText("Store in an airtight container for up to 1 week.");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 150g butter, 1/2 cup of brown sugar,");
					fillerLabel9.setText("1/2 cup of caster sugar, 1 egg, 1 teasoppon of vanilla extract,");
					fillerLabel11.setText("1 and 1/3 cups of plain flower,");
					fillerLabel13.setText("1/2 cups of chocolate bits + one extra tablesoon.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 4, then the following will run.
				else if (pageNumber == 4)
				{
					pageNumber = 0;
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 150g butter, 1/2 cup of brown sugar,");
					fillerLabel9.setText("1/2 cup of caster sugar, 1 egg, 1 teasoppon of vanilla extract,");
					fillerLabel11.setText("1 and 1/3 cups of plain flower,");
					fillerLabel13.setText("1/2 cups of chocolate bits + one extra tablesoon.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
			}

			if (choice == 4) 
			{
				// if the page number is 0, then the following will run.
				if (pageNumber == 0)
				{
					fillerLabel7.setText("INGREDIENTS: 300g dark chocolate,");
					fillerLabel9.setText("3 room temperature eggs, 55g of caster sugar,");
					fillerLabel11.setText("1 tablesoppn of sifted cocoa powder,");
					fillerLabel13.setText("300ml thickened cream, grated chocolate.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 1, then the following will run.
				else if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 1: Preheat oven to 180°C. Brush an 11 x 21cm");
					fillerLabel6.setText("(base measurement) loaf pan with melted dairy spread");
					fillerLabel8.setText("to lightly grease.");
					fillerLabel10.setText("Line the base and 2 opposite sides with non-stick");
					fillerLabel12.setText("baking paper, allowing it to overhang.");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 300g dark chocolate,");
					fillerLabel9.setText("3 room temperature eggs, 55g of caster sugar,");
					fillerLabel11.setText("1 tablesoppn of sifted cocoa powder,");
					fillerLabel13.setText("300ml thickened cream, grated chocolate.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 2: Place eggs and sugar in a large bowl");
					fillerLabel6.setText("and beat with electric beaters for 5 minutes,");
					fillerLabel8.setText("or until mixture is pale, thick and doubled in volume.");
					fillerLabel10.setText("Fold in cocoa powder and cooled chocolate until combined.");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 300g dark chocolate,");
					fillerLabel9.setText("3 room temperature eggs, 55g of caster sugar,");
					fillerLabel11.setText("1 tablesoppn of sifted cocoa powder,");
					fillerLabel13.setText("300ml thickened cream, grated chocolate.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 3: In a separate bowl, whip cream until thickened");
					fillerLabel6.setText("(be careful not to over-beat). Use a large metal spoon");
					fillerLabel8.setText("to carefully fold the cream into the chocolate mixture,");
					fillerLabel10.setText("trying to keep the mixture as light as possible. Spoon into");
					fillerLabel12.setText("6 serving glasses and chill in fridge for at least 1 hour.");
					fillerLabel14.setText("Remove from fridge 15 minutes before serving, then top");
					fillerLabel16.setText("with extra whipped cream and grated chocolate to serve.");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 300g dark chocolate,");
					fillerLabel9.setText("3 room temperature eggs, 55g of caster sugar,");
					fillerLabel11.setText("1 tablesoppn of sifted cocoa powder,");
					fillerLabel13.setText("300ml thickened cream, grated chocolate.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 4, then the following will run.
				else if (pageNumber == 4)
				{
					pageNumber = 0;
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 300g dark chocolate,");
					fillerLabel9.setText("3 room temperature eggs, 55g of caster sugar,");
					fillerLabel11.setText("1 tablesoppn of sifted cocoa powder,");
					fillerLabel13.setText("300ml thickened cream, grated chocolate.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
			}

			if (choice == 5) 
			{
				// if the page number is 0, then the following will run.
				if (pageNumber == 0)
				{
					fillerLabel7.setText("INGREDIENTS: 250g of plain biscuits, 1/3 cup of cocoa powder,");
					fillerLabel9.setText("1 cup of desiccated coconut,");
					fillerLabel11.setText("395g of condensed milk.");
					fillerLabel13.setText("");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 1, then the following will run.
				else if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 1: Put the biscuits into a plastic bag");
					fillerLabel6.setText("and hit with a rolling pin until crushed into small pieces.");
					fillerLabel8.setText("Transfer to a bowl. Add cocoa powder and 1/4 of the coconut.");
					fillerLabel10.setText("Make a well in the centre.");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 250g of plain biscuits, 1/3 cup of cocoa powder,");
					fillerLabel9.setText("1 cup of desiccated coconut,");
					fillerLabel11.setText("395g of condensed milk.");
					fillerLabel13.setText("");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 2: Add the condensed milk.");
					fillerLabel6.setText("Mix together with a wooden spoon until evenly moistened.");
					fillerLabel8.setText("Chill for 30 mins.");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 250g of plain biscuits, 1/3 cup of cocoa powder,");
					fillerLabel9.setText("1 cup of desiccated coconut,");
					fillerLabel11.setText("395g of condensed milk.");
					fillerLabel13.setText("");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 3: Spread the remaining coconut onto a plate.");
					fillerLabel6.setText("Roll level tablespoons of the mixture into balls");
					fillerLabel8.setText("then make slightly egg shaped. Roll in the coconut.");
					fillerLabel10.setText("Keep in an airtight container in the fridge.");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 250g of plain biscuits, 1/3 cup of cocoa powder,");
					fillerLabel9.setText("1 cup of desiccated coconut,");
					fillerLabel11.setText("395g of condensed milk.");
					fillerLabel13.setText("");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 4, then the following will run.
				else if (pageNumber == 4)
				{
					pageNumber = 0;
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 250g of plain biscuits, 1/3 cup of cocoa powder,");
					fillerLabel9.setText("1 cup of desiccated coconut,");
					fillerLabel11.setText("395g of condensed milk.");
					fillerLabel13.setText("");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
			}

			if (choice == 6) 
			{
				// if the page number is 0, then the following will run.
				if (pageNumber == 0)
				{
					fillerLabel7.setText("200g of milk chocolate, 75g of dark chocoalte,");
					fillerLabel9.setText("25g of butter, 50 mixed colour marshmallows,");
					fillerLabel11.setText("50g shortbread biscuits, chopped into bite size,");
					fillerLabel13.setText("50g of rasberry jelly candies.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 1, then the following will run.
				else if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("Step 1: Line a 3cm-deep, 8 x 25cm bar pan");
					fillerLabel6.setText("with plastic wrap. Place the milk and dark chocolates");
					fillerLabel8.setText("with the butter in a heatproof bowl over a pan");
					fillerLabel10.setText("of simmering water (don't let the bowl touch the water),");
					fillerLabel12.setText("baking paper, allowing it to overhang.");
					fillerLabel14.setText("then stir until melted. Stir marshmallows");
					fillerLabel16.setText("into chocolate with remaining ingredients.");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("200g of milk chocolate, 75g of dark chocoalte,");
					fillerLabel9.setText("25g of butter, 50 mixed colour marshmallows,");
					fillerLabel11.setText("50g shortbread biscuits, chopped into bite size,");
					fillerLabel13.setText("50g of rasberry jelly candies.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("Step 2: Spread into pan, chill in fridge for");
					fillerLabel6.setText("2 hours or until hard. Slice in the pan.");
					fillerLabel8.setText("");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("200g of milk chocolate, 75g of dark chocoalte,");
					fillerLabel9.setText("25g of butter, 50 mixed colour marshmallows,");
					fillerLabel11.setText("50g shortbread biscuits, chopped into bite size,");
					fillerLabel13.setText("50g of rasberry jelly candies.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					pageNumber = 0;
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("200g of milk chocolate, 75g of dark chocoalte,");
					fillerLabel9.setText("25g of butter, 50 mixed colour marshmallows,");
					fillerLabel11.setText("50g shortbread biscuits, chopped into bite size,");
					fillerLabel13.setText("50g of rasberry jelly candies.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
			}

			if (choice == 7) 
			{
				// if the page number is 0, then the following will run.
				if (pageNumber == 0)
				{
					fillerLabel7.setText("INGREDIENTS: 2 Puff pastry sheets, 250ml milk,");
					fillerLabel9.setText("1 vanilla bean, 3/4 cup of cornflower,");
					fillerLabel11.setText("1/2 cup custard powder, 1 cup caster sugar, 3 cups of");
					fillerLabel13.setText("thickened cream, 50g butter, 3 egg yolks, icing sugar.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 1, then the following will run.
				else if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 1: Preheat oven to 210°C. Line a 23cm");
					fillerLabel6.setText("square pan with aluminium foil, so that the foil");
					fillerLabel8.setText("comes up over the sides");
					fillerLabel10.setText("(this allows you to lift out the slice).");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 2 Puff pastry sheets, 250ml milk,");
					fillerLabel9.setText("1 vanilla bean, 3/4 cup of cornflower,");
					fillerLabel11.setText("1/2 cup custard powder, 1 cup caster sugar, 3 cups of");
					fillerLabel13.setText("thickened cream, 50g butter, 3 egg yolks, icing sugar.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 2: Place each pastry sheet on a baking tray");
					fillerLabel6.setText("lined with non-stick baking paper, then bake");
					fillerLabel8.setText("for 8-10 minutes or until golden brown.");
					fillerLabel10.setText("Set aside to cool. Once cool, place 1 pastry sheet,");
					fillerLabel12.setText("cooked-side up, in bottom of pan.");
					fillerLabel10.setText("(You may need to trim it slightly to fit).");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 2 Puff pastry sheets, 250ml milk,");
					fillerLabel9.setText("1 vanilla bean, 3/4 cup of cornflower,");
					fillerLabel11.setText("1/2 cup custard powder, 1 cup caster sugar, 3 cups of");
					fillerLabel13.setText("thickened cream, 50g butter, 3 egg yolks, icing sugar.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 3: Place milk in a pan over medium heat.");
					fillerLabel6.setText("Scrape in vanilla seeds and add bean too.");
					fillerLabel8.setText("Warm gently, then set aside for 10 minutes.");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 2 Puff pastry sheets, 250ml milk,");
					fillerLabel9.setText("1 vanilla bean, 3/4 cup of cornflower,");
					fillerLabel11.setText("1/2 cup custard powder, 1 cup caster sugar, 3 cups of");
					fillerLabel13.setText("thickened cream, 50g butter, 3 egg yolks, icing sugar.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 4, then the following will run.
				else if (pageNumber == 4)
				{
					fillerLabel2.setText("STEP 4: Place cornflour, custard powder");
					fillerLabel4.setText("and caster sugar in a pan. Strain milk, discarding bean,");
					fillerLabel6.setText(" into pan with cornflour and whisk until smooth.");
					fillerLabel8.setText("Add cream, then return to heat, stirring constantly,");
					fillerLabel10.setText("over low heat until the mixture thickens and boils.");
					fillerLabel12.setText("Add butter, stirring well to combine, then remove from heat");
					fillerLabel14.setText("and whisk in egg yolks, one at a time, until smooth. Pour into");
					fillerLabel16.setText("pastry-lined pan and set aside to cool slightly before placing");
					fillerLabel18.setText("other piece of pastry, cooked-side up,");
					fillerLabel20.setText("on top. Refrigerate overnight.");
					fillerLabel7.setText("INGREDIENTS: 2 Puff pastry sheets, 250ml milk,");
					fillerLabel9.setText("1 vanilla bean, 3/4 cup of cornflower,");
					fillerLabel11.setText("1/2 cup custard powder, 1 cup caster sugar, 3 cups of");
					fillerLabel13.setText("thickened cream, 50g butter, 3 egg yolks, icing sugar.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 5, then the following will run.
				else if (pageNumber == 5)
				{
					fillerLabel2.setText("STEP 5: Remove from pan, cut into squares");
					fillerLabel4.setText("and dust with icing sugar.");
					fillerLabel6.setText("");
					fillerLabel8.setText("");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					fillerLabel7.setText("INGREDIENTS: 2 Puff pastry sheets, 250ml milk,");
					fillerLabel9.setText("1 vanilla bean, 3/4 cup of cornflower,");
					fillerLabel11.setText("1/2 cup custard powder, 1 cup caster sugar, 3 cups of");
					fillerLabel13.setText("thickened cream, 50g butter, 3 egg yolks, icing sugar.");
					fillerLabel15.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 6, then the following will run.
				else if (pageNumber == 6)
				{
					pageNumber = 0;
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// adds pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber + 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
			}
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if (event == prevOption)
		{
			System.out.println("choice is "+ choice);
			System.out.println("PN: " + pageNumber);
			page = showButton.getText();
			pageNumber = Integer.parseInt(page);
		 
		 // if pageNumber is less than zero the following will run.
		if (pageNumber < 0)
		{
			// validation for 
			pageNumber = 1;
			setPageNumber = Integer.toString(pageNumber);
			showButton.setText(setPageNumber);
		}
		else if (pageNumber > 6)
		{	
			pageNumber = 6;
			setPageNumber = Integer.toString(pageNumber);
			showButton.setText(setPageNumber);
		}

			if (choice == 1) 
			{
				// if the page number is 1, then the following will run.
				if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 1: Preheat oven to 180°C. Brush an 11 x 21cm");
					fillerLabel6.setText("(base measurement) loaf pan with melted dairy spread");
					fillerLabel8.setText("to lightly grease.");
					fillerLabel10.setText("Line the base and 2 opposite sides with non-stick");
					fillerLabel12.setText("baking paper, allowing it to overhang.");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 2: Sift the combined flours and cinnamon into a");
					fillerLabel6.setText("large bowl. Stir in the sugar and make a well");
					fillerLabel8.setText("in the centre. Mash bananas in a medium bowl.");
					fillerLabel10.setText("Add the eggs, milk, and melted butter,");
					fillerLabel12.setText("and stir until well combined. ");
					fillerLabel10.setText("Add the banana mixture to the flour mixture and stir");
					fillerLabel12.setText("just combined. Spoon the mixture");
					fillerLabel14.setText("into the prepared pan and smooth the surface.");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 3: Bake in preheated oven for 45-50 minutes");
					fillerLabel6.setText("or until a skewer inserted into the centre");
					fillerLabel8.setText("comes out clean.");
					fillerLabel10.setText("Remove from oven and set aside in the pan for 5 minutes.");
					fillerLabel12.setText("Turn onto a wire rack to cool completely.");
					fillerLabel12.setText("Cut into slices to serve.");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 4, then the following will run.
				else if (pageNumber == 4)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
			}
		
			else if (choice == 2) 
			{
				// if the page number is 1, then the following will run.
				if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 1: Preheat oven to 180C/160C fan forced.");
					fillerLabel6.setText("Grease a 20cm (base measurement) square cake pan");
					fillerLabel8.setText("and line with baking paper.");
					fillerLabel10.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 2: Place butter and chocolate in a heatproof bowl");
					fillerLabel6.setText("over a saucepan of simmering water");
					fillerLabel8.setText("(don't let the bowl touch the water).");
					fillerLabel10.setText("Stir with a metal spoon until melted. Remove from heat.");
					fillerLabel12.setText("Quickly stir in egg, sugar, flour, cocoa powder,");
					fillerLabel14.setText("vanilla and salt until just combined.");
					fillerLabel16.setText("Pour into prepared pan. Bake for 30 minutes or until");
					fillerLabel18.setText("a skewer inserted in the centre comes out with moist");
					fillerLabel20.setText("crumbs clinging. Set aside to cool completely.");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
				
			}

			if (choice == 3) 
			{
				// if the page number is 1, then the following will run.
				if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 1: Preheat oven to 180C or 160C fan-forced.");
					fillerLabel6.setText("Line 2 baking trays with baking paper.");
					fillerLabel8.setText("Using an electric mixer or whisking by hand,");
					fillerLabel10.setText("beat butter and sugars and 1-2 minutes or until");
					fillerLabel12.setText("smooth and well combined.");
					fillerLabel14.setText("Beat in egg and vanilla until combined.");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					// sets page number to a String and then sets it to the object showButton.
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 2: Stir in flour. Stir in dark and milk choc bits.");
					fillerLabel6.setText("Roll 2 level tablespoonfuls of mixture into balls");
					fillerLabel8.setText("and place on prepared trays, 3cm apart.");
					fillerLabel10.setText("Press down slightly. Decorate with extra choc bits.");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 3: Bake for 15-18 minutes or until");
					fillerLabel6.setText("light golden and cooked. Transfer to a wire rack to cool.");
					fillerLabel8.setText("Store in an airtight container for up to 1 week.");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 4, then the following will run.
				else if (pageNumber == 4)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
			}

			if (choice == 4) 
			{
				// if the page number is 1, then the following will run.
				if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 1: Preheat oven to 180°C. Brush an 11 x 21cm");
					fillerLabel6.setText("(base measurement) loaf pan with melted dairy spread");
					fillerLabel8.setText("to lightly grease.");
					fillerLabel10.setText("Line the base and 2 opposite sides with non-stick");
					fillerLabel12.setText("baking paper, allowing it to overhang.");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 2: Place eggs and sugar in a large bowl");
					fillerLabel6.setText("and beat with electric beaters for 5 minutes,");
					fillerLabel8.setText("or until mixture is pale, thick and doubled in volume.");
					fillerLabel10.setText("Fold in cocoa powder and cooled chocolate until combined.");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 3: In a separate bowl, whip cream until thickened");
					fillerLabel6.setText("(be careful not to over-beat). Use a large metal spoon");
					fillerLabel8.setText("to carefully fold the cream into the chocolate mixture,");
					fillerLabel10.setText("trying to keep the mixture as light as possible. Spoon into");
					fillerLabel12.setText("6 serving glasses and chill in fridge for at least 1 hour.");
					fillerLabel14.setText("Remove from fridge 15 minutes before serving, then top");
					fillerLabel16.setText("with extra whipped cream and grated chocolate to serve.");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 4, then the following will run.
				else if (pageNumber == 4)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
			}

			if (choice == 5) 
			{
				// if the page number is 1, then the following will run.
				if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 1: Put the biscuits into a plastic bag");
					fillerLabel6.setText("and hit with a rolling pin until crushed into small pieces.");
					fillerLabel8.setText("Transfer to a bowl. Add cocoa powder and 1/4 of the coconut.");
					fillerLabel10.setText("Make a well in the centre.");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 2: Add the condensed milk.");
					fillerLabel6.setText("Mix together with a wooden spoon until evenly moistened.");
					fillerLabel8.setText("Chill for 30 mins.");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 3: Spread the remaining coconut onto a plate.");
					fillerLabel6.setText("Roll level tablespoons of the mixture into balls");
					fillerLabel8.setText("then make slightly egg shaped. Roll in the coconut.");
					fillerLabel10.setText("Keep in an airtight container in the fridge.");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 4, then the following will run.
				else if (pageNumber == 4)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
			}

			if (choice == 6) 
			{
				// if the page number is 1, then the following will run.
				if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("Step 1: Line a 3cm-deep, 8 x 25cm bar pan");
					fillerLabel6.setText("with plastic wrap. Place the milk and dark chocolates");
					fillerLabel8.setText("with the butter in a heatproof bowl over a pan");
					fillerLabel10.setText("of simmering water (don't let the bowl touch the water),");
					fillerLabel12.setText("baking paper, allowing it to overhang.");
					fillerLabel14.setText("then stir until melted. Stir marshmallows");
					fillerLabel16.setText("into chocolate with remaining ingredients.");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("Step 2: Spread into pan, chill in fridge for");
					fillerLabel6.setText("2 hours or until hard. Slice in the pan.");
					fillerLabel8.setText("");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

				}
			}

			if (choice == 7) 
			{
				// if the page number is 1, then the following will run.
				if (pageNumber == 1)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 1: Preheat oven to 210°C. Line a 23cm");
					fillerLabel6.setText("square pan with aluminium foil, so that the foil");
					fillerLabel8.setText("comes up over the sides");
					fillerLabel10.setText("(this allows you to lift out the slice).");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 2, then the following will run.
				else if (pageNumber == 2)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 2: Place each pastry sheet on a baking tray");
					fillerLabel6.setText("lined with non-stick baking paper, then bake");
					fillerLabel8.setText("for 8-10 minutes or until golden brown.");
					fillerLabel10.setText("Set aside to cool. Once cool, place 1 pastry sheet,");
					fillerLabel12.setText("cooked-side up, in bottom of pan.");
					fillerLabel10.setText("(You may need to trim it slightly to fit).");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 3, then the following will run.
				else if (pageNumber == 3)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("STEP 3: Place milk in a pan over medium heat.");
					fillerLabel6.setText("Scrape in vanilla seeds and add bean too.");
					fillerLabel8.setText("Warm gently, then set aside for 10 minutes.");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 4, then the following will run.
				else if (pageNumber == 4)
				{
					fillerLabel2.setText("STEP 4: Place cornflour, custard powder");
					fillerLabel4.setText("and caster sugar in a pan. Strain milk, discarding bean,");
					fillerLabel6.setText(" into pan with cornflour and whisk until smooth.");
					fillerLabel8.setText("Add cream, then return to heat, stirring constantly,");
					fillerLabel10.setText("over low heat until the mixture thickens and boils.");
					fillerLabel12.setText("Add butter, stirring well to combine, then remove from heat");
					fillerLabel14.setText("and whisk in egg yolks, one at a time, until smooth. Pour into");
					fillerLabel16.setText("pastry-lined pan and set aside to cool slightly before placing");
					fillerLabel18.setText("other piece of pastry, cooked-side up,");
					fillerLabel20.setText("on top. Refrigerate overnight.");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 5, then the following will run.
				else if (pageNumber == 5)
				{
					fillerLabel2.setText("STEP 5: Remove from pan, cut into squares");
					fillerLabel4.setText("and dust with icing sugar.");
					fillerLabel6.setText("");
					fillerLabel8.setText("");
					fillerLabel10.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);
				}
				// else if the page number is 6, then the following will run.
				else if (pageNumber == 6)
				{
					fillerLabel2.setText("");
					fillerLabel4.setText("");
					fillerLabel6.setText("DONE :)");
					fillerLabel8.setText("");
					fillerLabel10.setText("Click \"Next Step\" to show the first step");
					fillerLabel12.setText("");
					fillerLabel12.setText("");
					fillerLabel14.setText("");
					fillerLabel16.setText("");
					fillerLabel18.setText("");
					fillerLabel20.setText("");
					System.out.println(pageNumber);
					// minus pagenumber by one, and sets it to a string and places it in the pageNumber object.
					pageNumber = pageNumber - 1;
					setPageNumber = Integer.toString(pageNumber);
					showButton.setText(setPageNumber);

			
				}
			// closes if.
			}
		// closes if.
		}
	// closes method.
	}
//closes class.
}
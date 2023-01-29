
//Create a Custom Class (anything you want - car, phone, holiday, etc.). 
//
//Requirements: 
//
//Minimum 3 private instance variables 
//An empty constructor 
//A constructor that uses only 2 of your 3 variables
//A constructor that uses all 3 of your instance variables 
//Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables 
//A method that returns a Boolean 
//A method that returns a String

class Widget {
	
	private String widgetName;
	private String widgetType;
	private int widgetAmount;
	
	public Widget() {
		System.out.println("Empty");
	}
	
	public Widget(String widgetName, int WidgetAmount) {
		this.widgetName = widgetName;
		this.widgetAmount = widgetAmount;
		
		System.out.println("Our new widget is " + widgetName + " and we have " + widgetAmount + " left");
	}
	
	public Widget(String widgetName, String widgetType, int widgetAmount) {
		this.widgetName = widgetName;
		this.widgetType = widgetType;
		this.widgetAmount = widgetAmount;
		
		if(widgetAmount >= 1) {
			return;
		}
		return;
	}
	
	
}

public class CustomClass {

	public static void main(String[] args) {
		

		Widget thisWidget = new Widget();
		
		Widget thisWidgetOrder = new Widget("Wonder Gear", 12);
		
		Widget thisWidgetAsk = new Widget("Wonder Gear", "turbos", 0);
		
		

	}

}

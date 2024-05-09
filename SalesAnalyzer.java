package org.retailStore;

public class SalesAnalyzer {
	private double[] sales;
	private int days;
	public SalesAnalyzer(int days) {
		this.sales = new double[days];
		this.days = days;
	}
	public void addSale(int day, double saleAmount) {
		if (day < 1 || day > sales.length) {
			System.out.println("Error: please enter valid day");
		}
		sales[day - 1] = saleAmount;
	}
	public double calculateTotalSales() {
		double totalsales = 0;
		for (double sale : sales)  {
			if (sales.length <= 0) {
				
			}
			totalsales +=sale;
		}
		return totalsales;
		 
	}
	public double calculateAvarageDailySales() {
		double total = calculateTotalSales();
		return total / sales.length;
	}
	public String findBestSalesDay() {
		double bestSale = sales[0];
		int bestDay = 1;
		for (int i = 1; i < sales.length; i++)  {
			if (sales[i] > bestSale)  {
				bestSale = sales[i];
				bestDay = i;
			}
		}
		if(bestDay==1)
			return "monday";
		if(bestDay==2)
			return "tuesday";
		if(bestDay==3)
			return "wednesday";
		if(bestDay==4)
			return "thursday";
		if(bestDay==5)
			return "friday";
		if(bestDay==6)
			return "saturday";
		if(bestDay==7)
			return "sunday";
		return "Not Found";
	
	}
	public String findWorstSalesDay() {
		double worstSale = sales[0];
		int worstDay = 1;
		for (int i = 1; i < sales.length; i++)  {
			if (sales[i] > worstSale)  {
				worstSale = sales[i];
				worstDay = i;
			}
		}
		if(worstDay==1)
			return "monday";
		if(worstDay==2)
			return "tuesday";
		if(worstDay==3)
			return "wednesday";
		if(worstDay==4)
			return "thursday";
		if(worstDay==5)
			return "friday";
		if(worstDay==6)
			return "saturday";
		if(worstDay==7)
			return "sunday";
		return "Not Found";
		
	}
	public void displaySalesReport() {
		System.out.println("Total Sales: Rs: "+calculateTotalSales());
		System.out.println("Average Daily Sales: Rs: "+calculateAvarageDailySales());
		System.out.println("Best Sales Day: "+findBestSalesDay());
		System.out.println("Worst Sales Day: "+findWorstSalesDay());
		
	}
	public static void main(String[] args) {
		SalesAnalyzer analyzer = new SalesAnalyzer(7);
		analyzer.addSale(1, 3000.00);
		analyzer.addSale(2, 1500.00);
		analyzer.addSale(3, 5000.00);
		analyzer.addSale(4, 2500.00);
		analyzer.addSale(5, 4000.00);
		analyzer.addSale(6, 2000.00);
		analyzer.addSale(7, 1000.00);
		analyzer.displaySalesReport();
	}
	
}

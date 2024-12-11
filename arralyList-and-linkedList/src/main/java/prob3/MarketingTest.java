package prob3;

import java.util.ArrayList;
import java.util.List;

public class MarketingTest {
    public static void main(String[] args) {
        List<Marketing> marketers = new ArrayList<>();
        // Add some marketers to the list
        marketers.add(new Marketing("Amadu Jallo", "Samsung S20", 999.99));
        marketers.add(new Marketing("Ben Davies", "Huawei P20", 2999.99));
        marketers.add(new Marketing("Jane Smith", "Google Pixel 5", 899.99));
        marketers.add(new Marketing("Alex Kisekka", "IPhone 15", 2999.99));
        marketers.add(new Marketing("John Doe", "IPhone 12", 1299.99));
        System.out.println(marketers);
        // delete an object from Marketing by passing instance object
        marketers.remove(new Marketing("Alex Kisekka", "IPhone 15", 2999.99));
        // print all marketers
        for (Marketing marketer : marketers) {
            System.out.println(marketer);
        }
        // Print the size of the list
        System.out.println("Size of the list: " + marketers.size());
        // Retrieve a Marketing object by its position.(get())
        System.out.println("Marketer at position 2: " + marketers.get(2));
        // Update the details of a Marketing object by passing its position. (Set())
         marketers.set(2, new Marketing("Jane Smith", "Google Pixel 5", 1999.99));
        System.out.println(marketers);
       // Sort the list in natural order for the field salesamount using comparator
        sortBySalesAmount(marketers);
        System.out.println("Sorted list by salesamount: " + marketers);
        // Filter list of marketers who have salesamount more than $1000
        List<Marketing> marketersMoreThan1000 = listMoreThan1000(marketers);
        System.out.println("Marketers with salesamount more than $1000: " + marketersMoreThan1000);
        sortByEmployeeName(marketersMoreThan1000);
        System.out.println("Marketers with salesamount more than $1000 Sorted by employeename: " + marketersMoreThan1000);
    }
    public static List<Marketing>  listMoreThan1000(List<Marketing> list){
        // Implement a body
        List<Marketing> marketersMoreThan1000 = new ArrayList<>();
        for(Marketing marketer: list){
            if(marketer != null && marketer.getSalesamount() > 1000.00){
                marketersMoreThan1000.add(marketer);
            }
        }
        return marketersMoreThan1000;
    }
    public static void sortBySalesAmount(List<Marketing> marketers){
        marketers.sort((m1, m2) -> {     // or use Collections.sort
            int result = Double.compare(m1.getSalesamount(), m2.getSalesamount());
            if (result == 0) {
                result = m1.getEmployeename().compareTo(m2.getEmployeename());
            }
            if (result == 0) {
                result = m1.getProductname().compareTo(m2.getProductname());
            }
            return result;
        });
    }
    public static void sortByEmployeeName(List<Marketing> marketers){
        marketers.sort((m1, m2) -> {    // or use Collections.sort
            int result = m1.getEmployeename().compareTo(m2.getEmployeename());
            if (result == 0) {
                result = m1.getProductname().compareTo(m2.getProductname());
            }
            if (result == 0) {
                result = Double.compare(m1.getSalesamount(), m2.getSalesamount());
            }
            return result;
        });
    }
}

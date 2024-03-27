/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valentin
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
                
        // Set the initial balance as the initial balance of the warehouse, 
        // as well as the first value of the change history.
    }

    public String history() {
        return this.history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(getBalance());
        
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double value = super.takeFromWarehouse(amount);
        this.history.add(getBalance());
        return value;
            
    }
    
    public void printAnalysis() {
        System.out.println(
                  "Product: " + getName() + "\n + "
                + "History: " + history() + "\n + "
                + "Largest amount of product: " + this.history.maxValue() + "\n + "
                + "Smallest amount of product: " + this.history.minValue() + "\n + "
                + "Average: " + this.history.average());
    }
}

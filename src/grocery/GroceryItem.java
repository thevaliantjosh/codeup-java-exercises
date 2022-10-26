package grocery;

import java.util.ArrayList;

public class GroceryItem {
    private String name;

    private String category;

    private int quantity;

    //Getters and Setters

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //Constructors
    public GroceryItem(){

    }

    public GroceryItem(String category, String name, int quantity ){
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

}

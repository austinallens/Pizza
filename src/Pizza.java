/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 5.2
 * File Name: Pizza.java
 */

/*Tells the price of pizza while certain toppings are selected, can't figure out
 *why it doesn't work
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Pizza extends Application {
    public void start(Stage s){
        //Creates CheckBoxes
        CheckBox checkBox1 = new CheckBox("Pepperoni");
        CheckBox checkBox2 = new CheckBox("Mushroom");
        CheckBox checkBox3 = new CheckBox("Sausage");
        CheckBox checkBox4 = new CheckBox("Black olives");
        CheckBox checkBox5 = new CheckBox("Cheese");
        CheckBox checkBox6 = new CheckBox("Cheese but not");
                
        //Pizza price original
        double pizzaPrice = 10;
        
        //Adds Toppings to Pizza Price
        if(checkBox1.isSelected()){
            pizzaPrice += 0.50;
        }
        if(checkBox2.isSelected()){
            pizzaPrice += 0.50;
        }
        if(checkBox3.isSelected()){
            pizzaPrice += 0.50;
        }
        if(checkBox4.isSelected()){
            pizzaPrice += 0.50;
        }
        if(checkBox5.isSelected()){
            pizzaPrice += 0.50;
        }
        if(checkBox6.isSelected()){
            pizzaPrice += 0.50;
        }
        
        //Makes text
        Text t = new Text("The pizza price is " + pizzaPrice + ".");

        //Sets Scene
        Label l = new Label("Select Toppings:");
        
        VBox vBox = new VBox(5);
        vBox.setPadding(new Insets(5, 5, 5, 50));
        vBox.getChildren().addAll(l, checkBox1, checkBox2,
                checkBox3, checkBox4, checkBox5, checkBox6, t);
        
        Scene scene = new Scene(vBox, 595, 200, Color.BEIGE);
        s.setTitle("Pizza Toppings");
        s.setScene(scene);
        s.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
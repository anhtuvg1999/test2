/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package period2_1;

/**
 *
 * @author MSI
 */
public class FanColor extends Fan{
 private String Color ;

    public FanColor() {
    }

    public FanColor(String Color, int ID, int Speed, int Price, String Name) {
        super(ID, Speed, Price, Name);
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "FanColor{" + "Color=" + Color +" ID "+ getID()+"Name "+ getName()+ "Speed "+getSpeed()+ "Price "+ getPrice()+'}';
    }
 
}

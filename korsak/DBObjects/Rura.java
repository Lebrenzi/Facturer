/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package korsak.DBObjects;

/**
 *
 * @author lebrenzi
 */
public class Rura extends DBObject {
    
    Rura(int primary_size, String material){
        super("Rura", primary_size, material);
    }

    @Override
    public String toString() {
        if(this.getPrimary_size() != 0)
            return "Rura: Materiał " + this.getMaterial() + ", o średnicy: " + this.getPrimary_size() + " mm";
        return "Rura: Materiał " + this.getMaterial() + ", o średnicy: " + this.getInches_size()+ " \"";
    }
    
    
}

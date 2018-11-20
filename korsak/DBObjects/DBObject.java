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
abstract class DBObject {
 private String type;
 private int primary_size;
 private float inches_size;
 private String material;
 
 DBObject(){};
 
 DBObject(String type, int primary_size, float inches_size, String material)
 {
     this.type = type;
     this.primary_size = primary_size;
     this.inches_size = inches_size;
     this.material = material;
     
 };

    public void setType(String type) {
        this.type = type;
    }

    public void setPrimary_size(int primary_size) {
        this.primary_size = primary_size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setInches_size(float inches_size) {
        this.inches_size = inches_size;
    }

    public String getType() {
        return type;
    }

    public int getPrimary_size() {
        return primary_size;
    }

    public String getMaterial() {
        return material;
    }

    public float getInches_size() {
        return inches_size;
    }
 
  DBObject(String type, int primary_size, String material)
 {
     this.type = type;
     this.primary_size = primary_size;
     this.material = material;
     
 };

    @Override
    public String toString() {
        return "Position : " + type + ", średnica" + primary_size +  ", materiał=" + material;
    }
 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.floormasteryproject.DTO;

/**
 *
 * @author apprentice
 */
public class Product {
    
    private String producType = "";
    private double costPerSqrFoot = 0;
    private double laborcost = 0;
    private String id ="";
    
    public String getProducType() {
        return producType;
    }

    public void setProducType(String producType) {
        this.producType = producType;
    }

    public double getCostPerSqrFoot() {
        return costPerSqrFoot;
    }

    public void setCostPerSqrFoot(double costPerSqrFoot) {
        this.costPerSqrFoot = costPerSqrFoot;
    }

    public double getLaborcost() {
        return laborcost;
    }

    public void setLaborcost(double laborcost) {
        this.laborcost = laborcost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}

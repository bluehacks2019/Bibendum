package com.bibendum.bluehacks.bibendum;

import java.util.ArrayList;

public class Stronghold {

    private int strength, nCitizens, nSpirit, nEmoPsych, nPhys, nSoc, nOccup, nIntell;
    private ArrayList<Item> items = new ArrayList<Item>();

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void addStrength(int moreStrength){
        this.strength += moreStrength;
    }

    public int getNCitizens() {
        return nCitizens;
    }

    public void setNCitizens(int nCitizens) {
        this.nCitizens = nCitizens;
    }

    public void addCitizens(int newCitizens){
        this.nCitizens += newCitizens;
    }

    public int getNSpirit() {
        return nSpirit;
    }

    public void setNSpirit(int nSpirit) {
        this.nSpirit = nSpirit;
    }

    public void addNSpirit(int moreSpirit){
        this.nSpirit += moreSpirit;
    }

    public int getNEmoPsych() {
        return nEmoPsych;
    }

    public void setNEmoPsych(int nEmoPsych) {
        this.nEmoPsych = nEmoPsych;
    }

    public void addNEmoPsych(int moreEmoPsych){
        this.nEmoPsych += moreEmoPsych;
    }

    public int getNPhys() {
        return nPhys;
    }

    public void setNPhys(int nPhys) {
        this.nPhys = nPhys;
    }

    public void addNPhys(int morePhys){
        this.nPhys += morePhys;
    }

    public int getNSoc() {
        return nSoc;
    }

    public void setNSoc(int nSoc) {
        this.nSoc = nSoc;
    }

    public void addNSoc(int moreSoc){
        this.nSoc += moreSoc;
    }

    public int getNOccup() {
        return nOccup;
    }

    public void setNOccup(int nOccup) {
        this.nOccup = nOccup;
    }

    public void addNOccup(int moreOccup){
        this.nOccup += moreOccup;
    }

    public int getNIntell() {
        return nIntell;
    }

    public void setNIntell(int nIntell) {
        this.nIntell = nIntell;
    }

    public void addNIntell(int moreIntell){
        this.nIntell += moreIntell;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}

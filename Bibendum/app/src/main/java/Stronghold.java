public class Stronghold {

    private int strength, nCitizens, nSpirit, nEmoPsych, nPhys, nSoc, nOccup, nIntell;
    private ArrayList<Item> items = new ArrayList<Item>();

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
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

    public int getNEmoPsych() {
        return nEmoPsych;
    }

    public void setNEmoPsych(int nEmoPsych) {
        this.nEmoPsych = nEmoPsych;
    }

    public int getNPhys() {
        return nPhys;
    }

    public void setNPhys(int nPhys) {
        this.nPhys = nPhys;
    }

    public int getNSoc() {
        return nSoc;
    }

    public void setNSoc(int nSoc) {
        this.nSoc = nSoc;
    }

    public int getNOccup() {
        return nOccup;
    }

    public void setNOccup(int nOccup) {
        this.nOccup = nOccup;
    }

    public int getNIntell() {
        return nIntell;
    }

    public void setNIntell(int nIntell) {
        this.nIntell = nIntell;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}

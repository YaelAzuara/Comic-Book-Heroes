public class Hero {
    
    private String name;
    private int powerLevel;
    private Affiliation affiliation;

    public Hero(String name, int powerLevel, Affiliation affiliation) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;
    }

    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Power Level: " + powerLevel + ", Affiliation: " + affiliation;
    }
}

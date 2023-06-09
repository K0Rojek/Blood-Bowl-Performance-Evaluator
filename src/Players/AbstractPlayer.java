package Players;

import java.util.List;

public abstract class AbstractPlayer {
    private int MA; // Movement Allowance
    private int ST; // Strength
    private int AG; // Agility
    private int PA; // Passing Ability
    private int AV; // Armor Value
    private List<Skill> skills; // List of skills

    private double srMA;
    private double srST;
    private double srAG;
    private double srPA;
    private double srAV;
    private double srBrute;
    private double srTough;
    private double srMobility;
    private double srPassing;
    private double srBallHandling;
    private double srDefence;
    private final List<SkillType> primaryAccess;
    private final List<SkillType> secondaryAccess;
    private int amountOfNigglingInjuries = 0;

    public AbstractPlayer(int MA, int ST, int AG, int PA, int AV, List<Skill> skills, List<SkillType> primaryAccess, List<SkillType> secondaryAccess) {
        this.MA = MA;
        this.ST = ST;
        this.AG = AG;
        this.PA = PA;
        this.AV = AV;
        this.skills = skills;
        this.primaryAccess = primaryAccess;
        this.secondaryAccess = secondaryAccess;

    }

    //skillUp method, injury method

    public int getMA() {
        return MA;
    }

    public void setMA(int MA) {
        this.MA = MA;
    }

    public int getST() {
        return ST;
    }

    public void setST(int ST) {
        this.ST = ST;
    }

    public int getAG() {
        return AG;
    }

    public void setAG(int AG) {
        this.AG = AG;
    }

    public int getPA() {
        return PA;
    }

    public void setPA(int PA) {
        this.PA = PA;
    }

    public int getAV() {
        return AV;
    }

    public void setAV(int AV) {
        this.AV = AV;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public double getSrMA() {
        return srMA;
    }

    public void setSrMA() {
        this.srMA = (this.MA - 1)/1.3;
    }

    public double getSrST() {
        return srST;
    }

    public void setSrST(double srST) {
        this.srST = Math.max(0, Math.min(5, this.ST) + Math.max(0, (this.ST - 5) * 0.5));
    }

    public double getSrAG() {
        return srAG;
    }

    public void setSrAG(double srAG) {
        int oldAG = 6 - this.AG;
        this.srAG = Math.min(5, oldAG) + Math.max(0, (oldAG - 4) * 0.6);
    }

    public double getSrPA() {
        return srPA;
    }

    public void setSrPA(double srPA) {
        int oldPA = 6 - this.PA;
        //this.srAG = Math.min(5, oldAG) + Math.max(0, (oldAG - 4) * 0.6);
    }

    public double getSrAV() {
        return srAV;
    }

    public void setSrAV(double srAV) {
        this.srAV = srAV;
    }

    public double getSrBrute() {
        return srBrute;
    }

    public void setSrBrute(double srBrute) {
        this.srBrute = srBrute;
    }

    public double getSrTough() {
        return srTough;
    }

    public void setSrTough(double srTough) {
        this.srTough = srTough;
    }

    public double getSrMobility() {
        return srMobility;
    }

    public void setSrMobility(double srMobility) {
        this.srMobility = srMobility;
    }

    public double getSrPassing() {
        return srPassing;
    }

    public void setSrPassing(double srPassing) {
        this.srPassing = srPassing;
    }

    public double getSrBallHandling() {
        return srBallHandling;
    }

    public void setSrBallHandling(double srBallHandling) {
        this.srBallHandling = srBallHandling;
    }

    public double getSrDefence() {
        return srDefence;
    }

    public void setSrDefence(double srDefence) {
        this.srDefence = srDefence;
    }
}

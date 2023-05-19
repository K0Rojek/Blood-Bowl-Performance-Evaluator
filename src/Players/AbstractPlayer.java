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
    private List<SkillType> primaryAccess;
    private List<SkillType> secondaryAccess;

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

    //skillUp method
}

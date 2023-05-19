package Players;

public class Skill {
    private String skillName;
    private double srBrute;
    private double srTough;
    private double srMobility;
    private double srPassing;
    private double srBallHandling;
    private double srDefence;
    private enum Type {
        GENERAL,
        STRENGTH,
        AGILITY,
        PASSING,
        MUTATION,
        EXTRAORDINARY
    }

    public Skill(String skillName, double srBrute, double srTough, double srMobility, double srPassing, double srBallHandling, double srDefence) {
        this.skillName = skillName;
        this.srBrute = srBrute;
        this.srTough = srTough;
        this.srMobility = srMobility;
        this.srPassing = srPassing;
        this.srBallHandling = srBallHandling;
        this.srDefence = srDefence;
    }

    public String getSkillName() {
        return skillName;
    }

    public double getSrBrute() {
        return srBrute;
    }

    public double getSrTough() {
        return srTough;
    }

    public double getSrMobility() {
        return srMobility;
    }

    public double getSrPassing() {
        return srPassing;
    }

    public double getSrBallHandling() {
        return srBallHandling;
    }

    public double getSrDefence() {
        return srDefence;
    }

    @Override
    public String toString() {
        return  "skillName: " + skillName +
                ", srBrute: " + srBrute +
                ", srTough: " + srTough +
                ", srMobility: " + srMobility +
                ", srPassing: " + srPassing +
                ", srBallHandling: " + srBallHandling +
                ", srDefence: " + srDefence;
    }
}

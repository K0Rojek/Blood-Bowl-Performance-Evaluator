package Players;

public class Skill {
    private final String skillName;
    private final double srBrute;
    private final double srTough;
    private final double srMobility;
    private final double srPassing;
    private final double srBallHandling;
    private final double srDefence;
    private final SkillType skillType;


    private boolean isValidType(SkillType type) {
        return type == SkillType.EXTRAORDINARY || type == SkillType.MUTATION ||
                type == SkillType.GENERAL || type == SkillType.PASSING ||
                type == SkillType.AGILITY || type == SkillType.STRENGTH;
    }
    public Skill(String skillName, double srBrute, double srTough, double srMobility, double srPassing, double srBallHandling, double srDefence, SkillType skillType) {
        if (!isValidType(skillType)) {
            throw new IllegalArgumentException("Invalid skill category.");
        }
        this.skillName = skillName;
        this.srBrute = srBrute;
        this.srTough = srTough;
        this.srMobility = srMobility;
        this.srPassing = srPassing;
        this.srBallHandling = srBallHandling;
        this.srDefence = srDefence;
        this.skillType = skillType;
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

    public SkillType getSkillType() {
        return skillType;
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

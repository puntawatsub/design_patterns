public class Character {
    private CharacterState level;
    private String name;
    private int experiencePoints;
    private int healthPoints;

    public Character(String name) {
        this.name = name;
        this.level = new NoviceState();
    }

    public CharacterState getLevel() {
        return level;
    }

    public void setLevel(CharacterState level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void printStatus() {
        String levelString;
        if (level instanceof NoviceState) {
            levelString = "Novice";
        } else if (level instanceof IntermediateState) {
            levelString = "Intermediate";
        } else {
            levelString = "Expert";
        }
        System.out.printf("Name: %s%n", name);
        System.out.printf("Level: %s%n", levelString);
        System.out.printf("Experience Points: %d%n", experiencePoints);
        System.out.printf("Health Points: %d%n", healthPoints);
    }

    public void train() {
        level.train(this);
    }

    public void meditate() {
        level.meditate(this);
    }

    public void fight() {
        level.fight(this);
    }
}

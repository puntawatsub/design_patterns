public class ExpertState implements CharacterState {
    @Override
    public void train(Character c) {
        c.setExperiencePoints(c.getExperiencePoints() + 1);
        if (c.getExperiencePoints() >= 70) {
            System.out.println("Player won, reached master level.");
            System.exit(0);
        }
    }

    @Override
    public void meditate(Character c) {
        c.setHealthPoints(c.getHealthPoints() + 5);
    }

    @Override
    public void fight(Character c) {
        c.setHealthPoints(c.getHealthPoints() - 10);
        c.setExperiencePoints(c.getExperiencePoints() + 10);
        if (c.getHealthPoints() <= 0) {
            System.out.println("Player lost.");
            System.exit(0);
        }
        if (c.getExperiencePoints() >= 70) {
            System.out.println("Player won, reached master level.");
            System.exit(0);
        }
    }
}

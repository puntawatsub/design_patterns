public class IntermediateState implements CharacterState {
    @Override
    public void train(Character c) {
        c.setExperiencePoints(c.getExperiencePoints() + 1);
        if (c.getExperiencePoints() >= 30) {
            c.setLevel(new ExpertState());
        }
    }

    @Override
    public void meditate(Character c) {
        c.setHealthPoints(c.getHealthPoints() + 5);
    }

    @Override
    public void fight(Character c) {
        System.out.println("Cannot fight yet.");
    }
}

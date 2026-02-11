public class NoviceState implements CharacterState {

    @Override
    public void train(Character c) {
        c.setExperiencePoints(c.getExperiencePoints() + 1);
        if (c.getExperiencePoints() >= 10) {
            c.setLevel(new IntermediateState());
        }
    }

    @Override
    public void meditate(Character c) {
        System.out.println("Cannot meditate yet");
    }

    @Override
    public void fight(Character c) {
        System.out.println("Cannot fight yet");
    }
}

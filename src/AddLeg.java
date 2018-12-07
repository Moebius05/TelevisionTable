public class AddLeg implements Step{
    @Override
    public void perform(Furniture furniture) {
        furniture.add("Leg");
    }
}

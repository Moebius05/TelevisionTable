public class AddTop implements Step{
    @Override
    public void perform(Furniture furniture) {
        furniture.add("Top");
    }
}

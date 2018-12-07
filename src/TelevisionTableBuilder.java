import java.util.Arrays;
import java.util.List;

public class TelevisionTableBuilder {private List<Step> steps    = getSteps();

    public TelevisionTable build(){
        TelevisionTable televisionTable = new TelevisionTable();
        for (Step step : steps) {
            step.perform(televisionTable);
        }
        return televisionTable;
    }
    public List<Step> getSteps() {
        AddShelf    shelf   =   new AddShelf();
        AddTop      top     =   new AddTop();
        AddLeg      leg     =   new AddLeg();
        List<Step> steps = Arrays.asList(leg, leg, leg, leg, top, shelf);
        return steps;
    }
}

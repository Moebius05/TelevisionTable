import java.util.ArrayList;
import java.util.List;

public class TelevisionTable implements Furniture{
    List<String> parts =   new ArrayList<>();

    @Override
    public void add(String part){
        parts.add(part);
    }

    @Override
    public String toString() {
        return "" + parts;
    }

    public List<String> getParts(){
        return parts;
    }
}
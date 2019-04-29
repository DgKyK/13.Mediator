import java.util.ArrayList;
import java.util.List;

public class Alcatraz implements IPrison {
    private List<ICage> cages = new ArrayList<>();

    @Override
    public void caution(ICage cage, String message) {
        for (ICage k : cages){
            k.inform(cage.getId(), message);
        }
    }

    public void addCage(ICage cage) {
        cages.add(cage);
    }
}

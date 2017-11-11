import java.util.ArrayList;
import java.util.List;

public class MemoryPalace {
  private List<Loci> locis;
  private String name;

  public MemoryPalace(String name) {
    locis = new ArrayList<>();
    this.name = name;
  }

  public int getSize() {
    return locis.size();
  }

  public ArrayList<Loci> getLocis() {
    return locis;
  }

  public String getName() {
    return name;
  }

  public void addLoci(String place, String image) {
    // FIXME: 11/10/2017 Not working properly, fix when I get home
    int firstEmptyLocation = locis.size();
    Loci lociToBeAdded = new Loci(place, image);
    locis.add(firstEmptyLocation, lociToBeAdded);
  }

}


public class MemoryPalace {
  private int size;
  private Loci[] locis;
  private String name;

  public MemoryPalace(int size, String name) {
    this.size = size;
    locis = new Loci[size];
    this.name = name;
  }

  public int getSize() {
    return size;
  }

  public Loci[] getLocis() {
    return locis;
  }

  public String getName() {
    return name;
  }
}

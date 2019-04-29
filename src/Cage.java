public class Cage implements ICage  {
    private int id;
    private IPrison prison;

    public Cage(int id, IPrison prison) {
        this.id = id;
        this.prison = prison;
    }

    @Override
    public void escape() {
        prison.caution(this, "ESCAPE in cage ->" + id);
    }

    @Override
    public void inform(int cageId , String message) {
        System.out.println("Cage " + id + " informed : " + message);
    }

    public int getId() {
        return id;
    }
}

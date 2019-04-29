public class TestClass {
    public static void main(String[] args) {
        Alcatraz alcatraz = new Alcatraz();
        ICage cage1 = new Cage(1, alcatraz);
        ICage cage2 = new Cage(2, alcatraz);
        ICage cage3 = new Cage(3, alcatraz);
        ICage cage4 = new Cage(4, alcatraz);
        ICage cage5 = new Cage(5, alcatraz);

        alcatraz.addCage(cage1);
        alcatraz.addCage(cage2);
        alcatraz.addCage(cage3);
        alcatraz.addCage(cage4);
        alcatraz.addCage(cage5);

        cage3.escape();

    }
}

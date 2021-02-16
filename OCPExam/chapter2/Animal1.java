package OCPExam.chapter2;

public class Animal1 {
    private String species;
    private boolean canWalk;
    private boolean canSwim;

    public Animal1(String speciesName, boolean walk, boolean swimmer) {
        species = speciesName;
        canWalk = walk;
        canSwim = swimmer;
    }

    public boolean canWalk() {
        return canWalk;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }

    // public interface CheckTrait{
    // public boolean test(Animal a);
    // }

}

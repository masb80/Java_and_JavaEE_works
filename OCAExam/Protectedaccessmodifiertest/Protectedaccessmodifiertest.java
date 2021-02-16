package OCAExam.Protectedaccessmodifiertest;

public class Protectedaccessmodifiertest {

    protected int x;

    protected void Protectedmethod1() { // protected class in class A
        System.out
                .println("In the Protected method in class Protectedaccessdmodifiertestclass which is in another file");
    }

    // page 184 OCA
    public static int count;

    public static void addGorilla() {
        count++;
    }

    public void babyGorilla() {
        count++;
    }

    public void annountceBabies() {
        addGorilla();
        babyGorilla();
    }

    public static void annountceBabiesToEveryone() {
        addGorilla();
        // babyGorilla();
    }
    
    public static int total;
    public static int average = total / count;
}

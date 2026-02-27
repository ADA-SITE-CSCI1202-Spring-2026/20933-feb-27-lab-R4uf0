package Task_8;

public class Main {
    public static void main(String[] args) {

        // --- Test Person ---
        Person p1 = new Person("Rauf", "Asadli", "Male");
        Person p2 = new Person("Rashad", "Asadli", "Male");
        Person p3 = new Person("Nigar", "Ismayilova", "Female");

        System.out.println("=== Person Test ===");
        System.out.println(p1);
        System.out.println("P1 equals P2? " + p1.equals(p2));
        System.out.println("P1 equals P3? " + p1.equals(p3));

        System.out.println();

        // --- Test Teacher ---
        String[] courses1 = {"Mathematics", "Physics 2", "Chemistry"};
        String[] courses2 = {"Mathematics", "Physics 2", "Chemistry"};
        String[] courses3 = {"Java", "OOP", "Data Structures"};

        Teacher t1 = new Teacher("Nargiz", "Abbasova", "Female", "Science", courses1);
        Teacher t2 = new Teacher("Nargiz", "Abbasova", "Female", "Science", courses2);
        Teacher t3 = new Teacher("Samir", "Abbasov", "Male", "Languages", courses3);

        System.out.println("=== Teacher Test ===");
        System.out.println(t1);
        System.out.println("T1 equals T2? " + t1.equals(t2));
        System.out.println("T1 equals T3? " + t1.equals(t3));
    }
}

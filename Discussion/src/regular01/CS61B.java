package regular01;

public class CS61B {
    public static String university = "UC Berkeley";
    public String semester;
    public CS61BStudent[] students;
    public int capacity;
    public CS61B(int capacity, CS61BStudent[] signups, String semester) {
        this.semester = semester;
        this.students = signups;
        this.capacity = capacity;
    }
// Methods (part c)
    /** Makes every CS61BStudent enrolled in this semester of the course watch lecture.
     Returns the total number of students who actually watched lecture.
     */
    public int makeStudentsWatchLecture() {
        int total = 0;
        for (int i = 0; i < capacity; i++) {
            boolean watched = students[i].watchLecture();
            if (watched) {
                total += 1;
            }
        }
        return total;
    }

    /** Expands the course to the given capacity. */
    public void expand(int newCapacity) {
        this.capacity = newCapacity;
    }
}

package regular01;

public class CS61BStudent {
    public int idNumber; // 实例变量
    public int grade;
    public static String instructor = "Hug"; // 类（静态）变量

    public CS61BStudent(int id) { // 构造函数
        this.idNumber = id;
        this.grade = 100;
    }

    public boolean watchLecture() { // 实例方法
        return Math.random() > 0.3; // 模拟 70% 的概率观看讲座
    }

    public static String getInstructor() { // 静态方法
        return instructor;
    }

    public static void changeInstructor(String newInstructor) {
        instructor = newInstructor;
    }
}

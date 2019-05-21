/**
 * This is Description
 *
 * @author 周振宇
 * @date 2018/12/24
 */
public class Student {

    private String name;
    private int age;
    private int gender; //性别 男1 女2

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("周振宇");
        student.setAge(18);
        student.setGender(1);

        System.out.println(student);

    }
}

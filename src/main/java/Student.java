public class Student {
    private String name;
    private int age;
    private double schoolAvarage;
    private boolean isWooman;

    public Student(String name, int age, double schoolAvarage, boolean isWooman) {
        this.name = name;
        this.age = age;
        this.schoolAvarage = schoolAvarage;
        this.isWooman = isWooman;
    }

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

    public double getSchoolAvarage() {
        return schoolAvarage;
    }

    public void setSchoolAvarage(double schoolAvarage) {
        this.schoolAvarage = schoolAvarage;
    }

    public boolean isWooman() {
        return isWooman;
    }

    public void setWooman(boolean wooman) {
        isWooman = wooman;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolAvarage=" + schoolAvarage +
                ", isWooman=" + isWooman +
                '}';
    }
}

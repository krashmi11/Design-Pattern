public class Student implements Prototype {
    String name;
    int roll;
    double cgpa;
    String phone;

    Student(String name, int roll, double cgpa, String phone) {

        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
        this.phone = phone;
    }

    @Override
    public Prototype getclone() {
        return new Student(this.name, this.roll, this.cgpa, this.phone);
    }

    @Override
    public void showRecord() {
        System.out.println("Name:" + this.name);
        System.out.println("Roll No:" + this.roll);
        System.out.println("CGPA:" + this.cgpa);
        System.out.println("Phone:" + this.phone);
    }

}
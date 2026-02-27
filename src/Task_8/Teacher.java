package Task_8;

import java.util.Arrays;

public class Teacher extends Person {

    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender,
                   String department, String[] courses) {

        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher Details:\n" +
                "-----------------\n" +
                "Name       : " + getFirstName() + " " + getLastName() + "\n" +
                "Gender     : " + getGender() + "\n" +
                "Department : " + department + "\n" +
                "Courses    : " + (courses != null ? Arrays.toString(courses) : "No courses assigned") +
                "\n";
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;

        if (!super.equals(t)) return false;

        if (!this.department.equals(t.department)) return false;

        if (this.courses.length != t.courses.length) return false;

        for (int i = 0; i < courses.length; i++) {
            if (!this.courses[i].equals(t.courses[i])) {
                return false;
            }
        }

        return true;
    }
}

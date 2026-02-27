package Task_8;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person Details:\n" +
                "-----------------\n" +
                "Name   : " + firstName + " " + lastName + "\n" +
                "Gender : " + gender + "\n";
    }

    public boolean equals(Person p) {
        return firstName.equals(p.getFirstName()) && lastName.equals(p.getLastName()) && gender.equals(p.getGender());
    }
}

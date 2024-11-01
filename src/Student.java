import java.time.LocalDate;

public class Student implements Study {
    private String name;
    private String surname;
    private String gender;
    private LocalDate dateOfStart;

    public Student(String james, String anderson, String male, LocalDate localDate, EducationCenter school) {
    }

    public Student(String name, String surname, String gender, LocalDate dateOfStart) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    @Override
    public void getStudentsEducationCenter() {

    }

    @Override
    public void getStudentsStudyingYear() {

    }
}
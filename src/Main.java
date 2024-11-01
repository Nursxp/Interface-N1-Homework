import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EducationCenter school = new School("The Lawrenceville School.", "New Jerse", LocalDate.of(1810, 4, 15));
        EducationCenter university = new University("Princeton University", "New Jerse", LocalDate.of(1746, 9, 22));
        EducationCenter college = new College("PeakSoft", "Kyrgyzstan", LocalDate.of(2017, 7, 7));
        Student student1 = new Student("James", "Anderson", "Male", LocalDate.of(2000, 15, 24), school);
        Student student2 = new Student("Michael", "Carter", "Male", LocalDate.of(2004, 7, 23), university);
        Student student3 = new Student("Emily", "Davis", "Female", LocalDate.of(2007, 1, 30), college);
        Student student4 = new Student("Daniel", "Evans", "Male", LocalDate.of(2008, 3, 5), university);
        Student student5 = new Student("Olivia", "Foster", "Female", LocalDate.of(2005, 9, 12), college);
        Student student6 = new Student("David", "Green", "Male", LocalDate.of(2003, 5, 27), school);
        Student student7 = new Student("Emma", "Harris", "Female", LocalDate.of(1999, 8, 19), college);
        Student student8 = new Student("Ryan", "Johnson", "Male", LocalDate.of(2005, 12, 2), university);
        Student student9 = new Student("Grace", "King", "Male", LocalDate.of(2003, 10, 10), university);
        Student student10 = new Student("Emily", " Davis", "Female", LocalDate.of(2000, 10, 1), university);
        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student8, student9, student10};
    }
}
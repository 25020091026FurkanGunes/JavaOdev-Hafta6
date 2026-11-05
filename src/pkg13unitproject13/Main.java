/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13unitproject13;

// ==========================================
// 1. Course Sınıfı (Cloneable & Derin Kopyalama)
// ==========================================
class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    public void clear() {
        students = new String[100];
        numberOfStudents = 0;
    }

    /** 
     * Cloneable arayüzünün uygulanması:
     * students dizisinin bağımsız kopyasını oluşturarak derin kopyalama (deep copy) sağlar.
     */
    @Override
    public Object clone() {
        try {
            // Nesnenin yüzeysel kopyası oluşturulur
            Course courseClone = (Course) super.clone();
            // students dizisinin bellekte yeni ve bağımsız kopyası oluşturulur
            courseClone.students = this.students.clone();
            return courseClone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}

// ==========================================
// 2. Main Sınıfı (Test Alanı)
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("=== COURSE DERİN KOPYALAMA TESTİ ===");

        // Orijinal kurs oluşturuluyor ve öğrenci ekleniyor
        Course course1 = new Course("Veri Yapıları");
        course1.addStudent("Ahmet");
        course1.addStudent("Mehmet");

        // course1 klonlanarak course2 üretiliyor
        Course course2 = (Course) course1.clone();

        // Klonlanan kursa yeni bir öğrenci ekleniyor
        course2.addStudent("Ayşe");

        // Sonuçların yazdırılması
        System.out.println("Orijinal Kurs (" + course1.getCourseName() + ") Öğrenci Sayısı: " + course1.getNumberOfStudents());
        System.out.print("Orijinal Kurs Öğrencileri: ");
        printStudents(course1);

        System.out.println("\n----------------------------------------");

        System.out.println("Klonlanmış Kurs (" + course2.getCourseName() + ") Öğrenci Sayısı: " + course2.getNumberOfStudents());
        System.out.print("Klonlanmış Kurs Öğrencileri: ");
        printStudents(course2);
    }

    private static void printStudents(Course course) {
        String[] students = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.print(students[i] + (i < course.getNumberOfStudents() - 1 ? ", " : ""));
        }
        System.out.println();
    }
}
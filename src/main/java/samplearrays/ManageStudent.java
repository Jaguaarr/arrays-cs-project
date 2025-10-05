package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest = students[0];
        for (Student student : students) {
            if (student.getAge() > oldest.getAge()) {
                oldest = student;
            }
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int counter =  0;
        for (Student student : students) {
            if (student.getAge() >= 18) {
                counter++;
            }
        }
        return counter;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        int sumgrades = 0;
        for (Student student : students) {
            sumgrades += student.getGrade();
        }
        double averagegrade = (double)sumgrades / (double)students.length;
        return averagegrade;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for(int j = i + 1; j < students.length; j++) {
                if (students[j].getGrade()>students[i].getGrade()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for (Student student : students) {
            if (student.getGrade()>= 15) {
                System.out.println(student.toString());
            }
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setGrade(newGrade);
                return true;
            }
        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        int[] counts = new int[students.length];
        for (int i = 0; i < students.length; i++) {
            counts[i] = 0;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].getName().equals(students[i].getName())) {
                    counts[i]++;
                }
            }

        }
        int sum = 0;
        for (int i = 0; i < counts.length; i++) {
            sum += counts[i];
        }
        return sum > 0;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[students.length] = newStudent;
        return newStudents;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr = new Student[5];
        arr[0] = new Student(1, "GOGO", 18, 14);
        arr[1] = new Student(2, "Vijita", 19, 19);
        arr[2] = new Student(3, "tchintchinhan", 20, 13);
        arr[3] = new Student(4, "korilin", 17, 5);
        arr[4] = new Student(5, "Majinbo", 22, 2);

        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        Student oldest = findOldest(arr);
        System.out.println("Oldest: " + oldest);


        // 3) Count adults
        System.out.println("There are " + countAdults(arr) + " Adults");

        // 4) Average grade
        System.out.println("Average Grade: " + averageGrade(arr));

        // 5) Find by name
        System.out.println("Is there a student with name GOGO: " + findStudentByName(arr, "GOGO"));

        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        sortByGradeDesc(arr);
        for (Student s : arr) {
            System.out.println(s.toString());
        }

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        boolean updated = updateGrade(arr, 5, 15);
        // function
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names
        boolean thereisduplicatednames = hasDuplicateNames(arr);

        System.out.println("Is there any duplicated names?  " + thereisduplicatednames);



        // 10) Append new student

        Student newStudent = new Student(1, "Gohan", 18, 20);


        Student[] newStudents = appendStudent(arr, newStudent);

        System.out.println("=======All the students=========");
        for (Student s : newStudents) System.out.println(s.toString());

    }
}


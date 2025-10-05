package samplearrays;


public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int[] updatedCourses = CourseNumbersArray.addnewcourse(1000,  registeredCourses);
        CourseNumbersArray.printArray(updatedCourses);
        System.out.println(CourseNumbersArray.checkcourses(registeredCourses, 1010));
    }
    public static int[] addnewcourse(int course, int[] registeredCourses){
        int[] updatedCourses = new int[registeredCourses.length+1];
        for(int i=0; i<registeredCourses.length; i++){
            updatedCourses[i] = registeredCourses[i];
        }
        updatedCourses[registeredCourses.length] = course;

        return updatedCourses;
    }
    public static void printArray(int[] registeredCourses){
        for(int i=0; i<registeredCourses.length; i++){
            System.out.print(registeredCourses[i] + " ");

        }
        System.out.println();
    }
    public static boolean checkcourses(int[] registeredCourses, int course){
        for(int i=0; i<registeredCourses.length; i++){
            if(registeredCourses[i] == course){
                return true;
            }

        }
        return false;
    }

}

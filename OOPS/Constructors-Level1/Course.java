public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName="ABC Institute";
    public Course(String courseName,int duration,double fee){
        this.courseName=courseName; this.duration=duration; this.fee=fee;
    }
    public void displayCourseDetails(){ System.out.println(courseName+" "+duration+" "+fee+" "+instituteName); }
    public static void updateInstituteName(String name){ instituteName=name; }
}

abstract class Course {
    private String courseName;
    private int duration;
    Course(String courseName, int duration){ this.courseName = courseName; this.duration = duration; }
    String info(){ return courseName + " for " + duration + " days"; }
}

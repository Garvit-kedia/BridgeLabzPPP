class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;
    OnlineCourse(String name,int dur,String platform,boolean rec){
        super(name,dur); this.platform = platform; this.isRecorded = rec;
    }
    String details(){ return info() + " on " + platform + " Recorded:" + isRecorded; }
}

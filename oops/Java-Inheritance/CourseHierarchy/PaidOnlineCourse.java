class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;
    PaidOnlineCourse(String name,int dur,String platform,boolean rec,double fee,double discount){
        super(name,dur,platform,rec); this.fee = fee; this.discount = discount;
    }
    double finalFee(){ return fee - discount; }
}

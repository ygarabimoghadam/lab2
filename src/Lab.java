public class Lab {

    private int capacity;
    private int avg;
    private String day;
    private Student [] students;
    private int currentSize;

    public Lab(int cap,String day){
        capacity = cap;
        this.day = day;
        this.students = new Student[capacity];
    }

    /**
     *
     * @param std
     * add student into the lab
     */
    public void enrollStudent(Student std){
        if(currentSize<capacity){
            students[currentSize] = std;
        currentSize++;}
        else
            System.out.println("LAb is full!");
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getAvg() {
        return avg;
    }

    /**
     * calculate avarge of all the student's grade.
     */
    public void calculateAvg(){
        int i = 0;
        int av=0;
        for(i=0 ; i<currentSize ; i++){
             av +=students[i].getGrade();
           // System.out.println(av);
        }
        avg = av/currentSize;

    }

    public void print(){
        int i =0;
        for(i=0 ; i<currentSize; i++){
            System.out.println("std fname: "+students[i].getFirstname()+", std id: "+students[i].getId()+", std Grade: "+students[i].getGrade());
        }
        System.out.println("lab avg : "+avg);
    }
}

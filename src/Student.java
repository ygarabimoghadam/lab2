public class Student {
    private  String firstname;
    private String lastname;
    private  String id;
    private int grade;

    public Student(String fname, String lname, String sid ){
        firstname = fname;
        lastname = lname;
        id = sid;
        grade = 0;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void print(){
        System.out.println(lastname+ ", Student ID: "+id+", Grade: "+grade);
    }
}

/**
*@author ygarabimoghadam
 * @version  1
 * @since 2020
 */
public class Student {
    private  String firstname;
    private String lastname;
    private  String id;
    private int grade;

    /**
     *
     * @param fname
     * @param lname
     * @param sid
     * /initializing fields
     */

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

    /**
     * print fields or studendet's fields
     */
    public void print(){
        System.out.println(lastname+ ", Student ID: "+id+", Grade: "+grade);
    }
}

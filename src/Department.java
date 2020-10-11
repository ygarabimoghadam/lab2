import java.util.ArrayList;
import java.util.Iterator;

public class Department {
    private String name;
    private ArrayList<Teachers> teachers;

    public Department(String name) {
        this.name = name;
        teachers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Teachers> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teachers> teachers) {
        this.teachers = teachers;
    }

    /**
     * adding and removing teachers from the department .
     * @param l
     */
    public void add(Teachers l){
        int i = 0;
        if(i==0){
            teachers.add(l);
            i=1;
        }
        if(i!=1){

        for(Teachers t : teachers){
            String n = t.getName();
            String m = l.getName();
            if(m==n)
                System.out.println("cannot add");
            else
                teachers.add(l);
        }}
    }
    public void remove(Teachers l ){
        Iterator<Teachers> iterator = teachers.iterator();
        while (iterator.hasNext()) {
            Teachers t = iterator.next();
            String name =t.getName();
            String n =l.getName();
            if(name==n)
                iterator.remove();
        }}
     public void print(){
        for(Teachers t : teachers){
            System.out.println(name+" ,"+t.getName());
            System.out.println();
        }
     }




}

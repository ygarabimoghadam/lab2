import java.util.ArrayList;
import java.util.Iterator;

public class Teachers {

    private String name;
    private ArrayList<Lab> myLabs;

    public Teachers(String name){
        this.name = name;
        myLabs = new ArrayList<Lab>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Lab> getMyLab() {
        return myLabs;
    }

    public void setMyLabs(ArrayList<Lab> myLabs) {
        this.myLabs = myLabs;
    }

    /**
     * adding lab to the teacher 's courses.
     * @param l
     */
    public void add(Lab l){
        int i = 0 ;
        if(i==0){
        myLabs.add(l);
        i++;}
        if(i!=1){
        for(Lab lab : myLabs){
            String d = lab.getDay();
            String n = l.getDay();
            if(n!=d) {
                System.out.println("hi");
                myLabs.add(l);}
            else{ System.out.println("cannot add");
            }
        }
    }}

    /**
     * remove the lab frome the courses list .
     * @param l
     */
    public void remove(Lab l ){
        Iterator<Lab> iterator = myLabs.iterator();
        while (iterator.hasNext()) {
            Lab lab = iterator.next();
            String name =lab.getDay();
            String n =l.getDay();
        if(name==n)
            iterator.remove();
        }}

    public void  print(){

        for(Lab lab : myLabs){
            System.out.println(name +","+lab.getDay());
        }


    }
}

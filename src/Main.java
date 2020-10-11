public class Main {
    /**
     * testing other classes.
     * @param args
     */

    public static void main(String[] args) {
        Student std1 = new Student("ali","rezai","9731073");
        Student std2 = new Student("yeganeh","arabi","9731041");
        Student std3 = new Student("sara","kheriolahi","9731081");
        std1.print();
        std1.setGrade(15);
        std1.print();
        std2.print();
        std2.setGrade(17);
        std2.print();
        std3.print();
        std3.setLastname("moghadam");
        std3.setGrade(10);
        std3.print();
        Lab ap = new Lab(2,"monday");
        ap.enrollStudent(std1);
        ap.enrollStudent(std2);
        ap.enrollStudent(std3);
        ap.calculateAvg();
        ap.print();
        Teachers t1 = new Teachers("akbari");
        t1.add(ap);
        t1.print();
        Department d = new Department("computer");
        d.add(t1);
        d.print(); }
}

import java.util.ArrayList;
import java.util.List;

public class Repo {
    private List<Student> students;

    public  Repo() {
        students=new ArrayList<Student>();

        students.add(new Student("Tanuló Tekla",16,4.56,true));
        students.add(new Student("Ötös Ödön",17,3.95,false));
        students.add(new Student("Stréber Szilárd",17,4.95,false));
        students.add(new Student("Iskolakerülő Iván",15,2.45,false));
        students.add(new Student("Pontos Petra",17,3.51,true));
        students.add(new Student("Felhő Ferenc",17,4.45,false));
    }
}

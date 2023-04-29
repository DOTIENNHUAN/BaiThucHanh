import java.util.ArrayList;
import java.util.ListIterator;

public class Slide19{
    public static void main(String[] args){
        ArrayList<Character> arrc = new ArrayList<>();

        arrc.add('a');
        arrc.add('b');
        arrc.add('c');
        arrc.add('d');

        ListIterator<Character> listIterator = arrc.listIterator();

        System.out.println("Cac phan tu co trong arrc la: ");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
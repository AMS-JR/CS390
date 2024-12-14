package Prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> result = new HashMap<>();
		for(Student s : students) {
            Key k = new Key(s.getFirstName(), s.getLastName());
            result.put(k, s);
        }
		return result;
	}
}

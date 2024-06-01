import java.util.LinkedList;
import java.util.Queue;

public class NumberofStudentsUnabletoEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queueStudents = new LinkedList<>();
        for (int student : students) {
            queueStudents.add(student);
        }

        for (int i = 0; i < sandwiches.length; i++) {
            int count = 0;
            int curr = sandwiches[i];
            while (true) {
                int currStudent = queueStudents.poll();
                if (currStudent == curr) {
                    break;
                } else {
                    queueStudents.add(currStudent);
                    count++;
                    if (count >= queueStudents.size()) {
                        return count;
                    }
                }
            }
        }
        return 0;
    }
}

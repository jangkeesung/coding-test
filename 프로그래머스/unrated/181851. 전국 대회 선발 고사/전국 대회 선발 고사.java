import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Student> list = new ArrayList<Student>();
        for (int i=0; i<rank.length; i++) {
            Student st = new Student(i, rank[i], attendance[i]);
            list.add(st);
        }
        int temp = 10000;
        
        Collections.sort(list);
        for (Student st : list) {
            if (st.getAttendance()) {
                answer+= st.getIndex() * temp;
                temp /= 100;
                if (temp == 1/100) {
                    return answer;
                }
            }
        }
        return answer;
    }
}
class Student implements Comparable<Student> {
    private int index;
    private int rank;
    private boolean attendance;
    
    Student(int index, int rank, boolean attendance) {
        this.index = index;
        this.rank = rank;
        this.attendance = attendance;
    }
    
    public int getIndex() {
        return this.index;
    }
    public int getRank() {
        return this.rank;
    }
    public boolean getAttendance() {
        return this.attendance;
    }
    
    public void setIndex(int index) {
        this.index = index;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public void setRank(boolean attendance) {
        this.attendance = attendance;
    }
    
    @Override
    public int compareTo(Student st) {
        return  getRank() - st.getRank();
    }
}
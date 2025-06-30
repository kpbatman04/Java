package Challenges;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.PriorityQueue;

class studentPriorityqueue {
    public static void main(String[] args) {
        PriorityQueue<student> queue = new PriorityQueue<>(new Comparator<student>() {
            @Override
            public int compare(student s1, student t1) {
                return s1.grade - t1.grade;
            }
        });
        queue.offer(new student("Krish",'B'));
        queue.offer(new student("Bruce",'C'));
        queue.offer(new student("Prish",'A'));
        queue.offer(new student("Srish",'D'));
        queue.offer(new student("Mrish",'A'));
        queue.offer(new student("Trish",'E'));

//        System.out.printf("Queues is %s\n",queue);
        System.out.printf("%s\n",queue.poll());
        System.out.printf("%s\n",queue.poll());
        System.out.printf("%s\n",queue.poll());
        System.out.printf("%s\n",queue.poll());
        System.out.printf("%s\n",queue.poll());
        System.out.printf("%s\n",queue.poll());

    }
    private static class student{

        private final String name;

        private final char grade;

    public student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

        @Override
        public String toString() {
            return  name + ": " + grade;
        }
    }
}

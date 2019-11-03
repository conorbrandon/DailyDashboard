package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class GetPlanner {
    static PriorityQueue<Task> tasksList;
    static ArrayList<Task> tasksArrayList;

    public static void main(String[] args) {
        tasksList = new PriorityQueue<>();
        tasksArrayList = new ArrayList<>();
        File file = new File("/Users/conorbrandon/IntelliJProjects/CSE260Project/src/sample/tasks.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String name = s.substring(0, s.length()-2);
                int priority = Integer.parseInt(s.substring(s.length()-1));
                Task task = new Task(name, priority);
                tasksList.add(task);
                tasksArrayList.add(task);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void updateFile() {
        File file = new File("/Users/conorbrandon/IntelliJProjects/CSE260Project/src/sample/tasks.txt");
        System.out.println(tasksArrayList.toString());
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (int i = 0; i < tasksArrayList.size(); i++) {
                Task current = tasksArrayList.get(i);
                printWriter.println(current.getName() + " " + current.getPriority());
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Task implements Comparable {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int compareTo(Object o) {
        Task t = (Task)o;
        if (this.priority > t.priority) return 1;
        if (this.priority == t.priority) return 0;
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Task task = (Task)o;
        return (task.getName().equals(getName()) && task.getPriority() == getPriority());
    }

    public String toString() {
        return name + ": " + priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}

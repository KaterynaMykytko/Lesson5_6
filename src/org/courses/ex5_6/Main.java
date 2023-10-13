package org.courses.ex5_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachersList = new ArrayList<>();

        teachersList.add("Oksana Ivanivna");
        teachersList.add("Larisa Ivanivna");
        teachersList.add("Tetiana Ivanivna");
        teachersList.add("Natalia Dmitrievna");
        teachersList.add("Svetlana Anatolievna");

        System.out.println("Best teacher = " + teachersList.indexOf("Oksana Ivanivna"));
        System.out.println("Bad teacher = " + teachersList.indexOf("Svetlana Anatolievna"));
    }
}

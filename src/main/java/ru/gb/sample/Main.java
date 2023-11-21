package ru.gb.sample;
import ru.gb.BiologyTeacher;
import ru.gb.Teacher;
import ru.gb.TeacherGroup;
public class Main {
    /**
    Создать класс Учитель;
    Создать класс УчительГруппа и реализовать с параметризацией;
    Создать наследника класса учитель и использовать его с УчительГруппой

     javac -sourcepath ./java -d out java/sample/Main.java
     java -classpath ./out sample.Main

     FROM bellsoft/liberica-openjdk-alpine:11.0.16
     COPY ./java ./src
     RUN mkdir ./out
     RUN javac -sourcepath ./src -d out src/ru/gb/sample/Main.java
     CMD java -classpath ./out ru.gb.sample.Main


     docker --version
     docker build . -t mysample:v1
     docker run mysample:v1
     docker run --rm mysample:v1

    **/
    public static void main(String[] args) {
        TeacherGroup<Teacher> teachers = new TeacherGroup("teachers");
        teachers.add(new BiologyTeacher("Кретинина", "Елена", "Анатольевна"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }
    }
}



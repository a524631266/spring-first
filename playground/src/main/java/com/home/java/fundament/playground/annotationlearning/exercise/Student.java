package com.home.java.fundament.playground.annotationlearning.exercise;

@HomeTable("tb_student_name")
public class Student {
    @HomeField(columnName = "age", datatype = "int", length = 10)
    private int age;
    @HomeField(columnName = "sname", datatype = "string", length = 20)
    private String studentName;
    @HomeField(columnName = "id", datatype = "int", length = 5)
    private int id;

    public Student() {
    }

    public Student(int age, String studentName, int id) {
        this.age = age;
        this.studentName = studentName;
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student age(int age) {
        this.age = age;
        return this;
    }

    public Student studentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public Student id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " age='" + getAge() + "'" + ", studentName='" + getStudentName() + "'" + ", id='" + getId() + "'"
                + "}";
    }

}
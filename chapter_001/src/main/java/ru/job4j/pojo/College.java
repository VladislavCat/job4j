package ru.job4j.pojo;

public class College {
    public static void main(String[]args){
        Student student= new Student();
        student.setFIO("Котов Владислав Васильевич");
        student.setGroup("Первая группа");
        student.setReceiptDate("12.09.2091");

        System.out.println(student.getFIO()+ " поступил в "+ student.getGroup()+ " в "+ student.getReceiptDate());
    }

}

package zaichenko.edu.course.model;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import java.time.LocalDateTime;
import java.util.Objects;

public class WorkLoad {
    private String id;
    private Group group;
    private Teacher teacher;
    private String subject;
    private int amountOfHours;
    private double payment;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public WorkLoad() {
    }

    public WorkLoad(Group group, Teacher teacher, String subject, int amountOfHours, double payment) {
        this.group = group;
        this.teacher = teacher;
        this.subject = subject;
        this.amountOfHours = amountOfHours;
        this.payment = payment;
    }

    public WorkLoad(String id, Group group, Teacher teacher, String subject, int amountOfHours, double payment) {
        this.id = id;
        this.group = group;
        this.teacher = teacher;
        this.subject = subject;
        this.amountOfHours = amountOfHours;
        this.payment = payment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAmountOfHours() {
        return amountOfHours;
    }

    public void setAmountOfHours(int amountOfHours) {
        this.amountOfHours = amountOfHours;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "WorkLoad{" +
                "id='" + id + '\'' +
                ", group=" + group +
                ", teacher=" + teacher +
                ", subject='" + subject + '\'' +
                ", amountOfHours=" + amountOfHours +
                ", payment=" + payment +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkLoad workLoad = (WorkLoad) o;
        return Objects.equals(id, workLoad.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

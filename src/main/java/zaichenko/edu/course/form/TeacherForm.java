package zaichenko.edu.course.form;/*
 @author Vladyslav Zaichenko
 @since 11 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

public class TeacherForm {
    private String id;
    private String name;
    private String surname;
    private String description;
    private String telephone;
    private int experience;

    public TeacherForm() {
    }

    public TeacherForm(String name, String surname, String description, String telephone, int experience) {
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.telephone = telephone;
        this.experience = experience;
    }

    public TeacherForm(String id, String name, String surname, String description, String telephone, int experience) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.telephone = telephone;
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "TeacherForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", description='" + description + '\'' +
                ", telephone='" + telephone + '\'' +
                ", experience=" + experience +
                '}';
    }
}

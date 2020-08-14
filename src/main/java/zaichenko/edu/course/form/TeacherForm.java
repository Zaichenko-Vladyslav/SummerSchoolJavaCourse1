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
    private String description;
    private String telephone;

    public TeacherForm() {
    }

    public TeacherForm(String name, String description, String telephone) {
        this.name = name;
        this.description = description;
        this.telephone = telephone;
    }

    public TeacherForm(String id, String name, String description, String telephone) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.telephone = telephone;
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

    @Override
    public String toString() {
        return "TeacherForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}

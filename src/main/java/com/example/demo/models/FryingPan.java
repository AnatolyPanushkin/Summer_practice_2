package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fryingPan")
public class FryingPan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "registration_date")
    private Date registrationDate = new Date();

    @ManyToOne
    public Material material;
    @ManyToOne
    public Chef chef;

    public FryingPan(String name, Material material, Chef chef) {
        this.name = name;
        this.material = material;
        this.chef=chef;
    }

    public FryingPan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "FryingPan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", registrationDate=" + registrationDate + ", material: " + material.getName()+", chef: " + chef.getNameChef() +
                '}';
    }
}

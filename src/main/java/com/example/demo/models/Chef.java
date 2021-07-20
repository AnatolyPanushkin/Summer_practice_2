package com.example.demo.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Chef")
public class Chef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name",length = 50,nullable = false)
    private String nameChef;

    @OneToMany(mappedBy = "chef")
    private Set<FryingPan> fryingPans=new HashSet<>();

    public Chef(String name ){
        this.nameChef=name;
    }

    public Chef(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameChef() {
        return nameChef;
    }

    public void setNameChef(String nameChef) {
        this.nameChef = nameChef;
    }
}

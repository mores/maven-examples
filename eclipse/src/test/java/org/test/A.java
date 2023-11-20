package org.test;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class A {
    @Id
    private int id;

    @ManyToOne(optional = false)
    @JoinColumn(columnDefinition = "int NOT NULL")
    private S s;

    public A() {
    }

    public A(int id, S s) {
        this.id = id;
        this.s = s;
    }

    public int getId() {
        return id;
    }

    public S getS() {
        return s;
    }
}

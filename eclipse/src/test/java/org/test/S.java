package org.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class S {
    @Id
    private int id;

    @OneToMany
    @JoinColumn(name = "S_ID")
    private java.util.Set<A> as = new java.util.HashSet<A>();

    public S() {
    }

    public S(int id) {
        this.id = id;
    }
}

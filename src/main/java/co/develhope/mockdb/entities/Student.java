package co.develhope.mockdb.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

}
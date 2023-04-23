package com.miguel.chinook;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "EmployeeId", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "LastName", nullable = false, length = 20)
    private String lastName;

    @Size(max = 20)
    @NotNull
    @Column(name = "FirstName", nullable = false, length = 20)
    private String firstName;

    @Size(max = 30)
    @Column(name = "Title", length = 30)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ReportsTo")
    private Employee reportsTo;

    @Column(name = "BirthDate")
    private Instant birthDate;

    @Column(name = "HireDate")
    private Instant hireDate;

    @Size(max = 70)
    @Column(name = "Address", length = 70)
    private String address;

    @Size(max = 40)
    @Column(name = "City", length = 40)
    private String city;

    @Size(max = 40)
    @Column(name = "State", length = 40)
    private String state;

    @Size(max = 40)
    @Column(name = "Country", length = 40)
    private String country;

    @Size(max = 10)
    @Column(name = "PostalCode", length = 10)
    private String postalCode;

    @Size(max = 24)
    @Column(name = "Phone", length = 24)
    private String phone;

    @Size(max = 24)
    @Column(name = "Fax", length = 24)
    private String fax;

    @Size(max = 60)
    @Column(name = "Email", length = 60)
    private String email;

}
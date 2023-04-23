package com.miguel.chinook;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "CustomerId", nullable = false)
    private Integer id;

    @Size(max = 40)
    @NotNull
    @Column(name = "FirstName", nullable = false, length = 40)
    private String firstName;

    @Size(max = 20)
    @NotNull
    @Column(name = "LastName", nullable = false, length = 20)
    private String lastName;

    @Size(max = 80)
    @Column(name = "Company", length = 80)
    private String company;

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
    @NotNull
    @Column(name = "Email", nullable = false, length = 60)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SupportRepId")
    private Employee supportRep;

}
package com.miguel.chinook;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @Column(name = "InvoiceId", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CustomerId", nullable = false)
    private Customer customer;

    @NotNull
    @Column(name = "InvoiceDate", nullable = false)
    private Instant invoiceDate;

    @Size(max = 70)
    @Column(name = "BillingAddress", length = 70)
    private String billingAddress;

    @Size(max = 40)
    @Column(name = "BillingCity", length = 40)
    private String billingCity;

    @Size(max = 40)
    @Column(name = "BillingState", length = 40)
    private String billingState;

    @Size(max = 40)
    @Column(name = "BillingCountry", length = 40)
    private String billingCountry;

    @Size(max = 10)
    @Column(name = "BillingPostalCode", length = 10)
    private String billingPostalCode;

    @NotNull
    @Column(name = "Total", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

}
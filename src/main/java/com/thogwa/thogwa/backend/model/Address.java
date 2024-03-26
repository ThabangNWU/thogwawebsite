package com.thogwa.thogwa.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 5, message = "Street name must contain at least 5 characters")
    private String street;

//    @NotBlank
//    @Size(min = 5, message = "Building name must contain atleast 5 characters")
//    private String buildingName;

    @NotBlank
    @Size(min = 4, message = "City name must contain at least 4 characters")
    private String city;

    @NotBlank
    @Size(min = 2, message = "State name must contain at least 2 characters")
    private String state;

    @NotBlank
    @Size(min = 2, message = "Country name must contain at least 2 characters")
    private String country;

    @NotBlank
    @Size(min = 6, message = "Pin code must contain at least 6 characters")
    private String pincode;

    @ManyToOne()
    @JoinColumn(name = "address",insertable = false,updatable = false)
    private User customers ;
    private Long CustomerId;
    @OneToOne
    private Order order;


}

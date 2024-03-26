package com.thogwa.thogwa.backend.dto.dto;


import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
//    @Size(min = 3, max = 10, message = "First name contains 3-10 characters")
    private String firstName;

//    @Size(min = 3, max = 10, message = "Last name contains 3-10 characters")
    private String lastName;
    private String username;
//    @Size(min = 3, max = 15, message = "Password contains 3-10 characters")
    private String password;





}
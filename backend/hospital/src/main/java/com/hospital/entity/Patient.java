package com.hospital.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "patients")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String dateOfBirth;

   
    private String address;

   
    private String city;

    
    private String state;

   
    private String country;

    @Column(nullable = false)
    private String password; // This should be encrypted using BCrypt

    @CreationTimestamp
    private LocalDateTime registrationDate;

    @Column(nullable = false)
    private boolean isActive = true;

	public void setFirstName(Object firstName2) {
		// TODO Auto-generated method stub
		
	}

	public void setPhoneNumber(Object phoneNumber2) {
		// TODO Auto-generated method stub
		
	}

	public void setGender(Object gender2) {
		// TODO Auto-generated method stub
		
	}

	public void setLastName(Object lastName2) {
		// TODO Auto-generated method stub
		
	}

	public void setDateOfBirth(Object dateOfBirth2) {
		// TODO Auto-generated method stub
		
	}

	public void setCity(Object city2) {
		// TODO Auto-generated method stub
		
	}

	public void setState(Object state2) {
		// TODO Auto-generated method stub
		
	}

	public void setCountry(Object country2) {
		// TODO Auto-generated method stub
		
	}

	public void setUserId(Object id) {
		// TODO Auto-generated method stub
		
	}
}


package com.api.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class PromoCodes {
	@Id
	@Column(name="code")
	private String code;
	
	@NotNull
	@Column(name="discount_percentage")
	private Float discountPercentage;
	
	@Column(name="active")
	private boolean active=true;
	
	@Column(name="valid_until")
	private LocalDate validUntil;

}

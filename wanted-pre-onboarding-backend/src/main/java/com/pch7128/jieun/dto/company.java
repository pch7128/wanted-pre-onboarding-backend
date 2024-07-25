package com.pch7128.jieun.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class company {
	
	@Id
    @SequenceGenerator(sequenceName="SEQ_CM", allocationSize=1, name="SEQ_CM")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_CM")	
	private int cm_num;
	
	private String cm_id;
	
	private String cm_company;
	
	private String cm_country;
	
	private String cm_area;
	
	private String cm_email;
	

}

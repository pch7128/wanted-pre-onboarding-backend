package com.pch7128.jieun.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="recruit_notice")
@Data
@RequiredArgsConstructor
public class Notice {
	
	@Id
    @SequenceGenerator(sequenceName="SEQ_NT", allocationSize=1, name="SEQ_NT")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_NT")	
	private int r_num;
	
	private String r_position;
	
	private int r_reward;
	
	private String r_stack;
	
	private String r_content;

	@ManyToOne
	@JoinColumn(name="cm_num")
	private Company company;
}

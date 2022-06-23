package com.perfios.dbJsonCol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonType;

import lombok.Data;

@Data
@Entity
@Table(name = "InputFiles")

@TypeDefs({ @TypeDef(name = "json", typeClass = JsonType.class) })

public class InputData {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	@Type(type = "json")
	@Column(columnDefinition = "json")
	private String inputFiles;

	public InputData() {

	}

	public InputData(String inputFiles) {
		this.inputFiles = inputFiles;
	}

}

package com.perfios.dbJsonCol.reqBeans;

import java.beans.JavaBean;
import java.util.List;

import lombok.Data;

@JavaBean
@Data
public class Input {

	List<Files> files;

	public Input() {

	}

//	public List<Files> getFiles() {
//		return files;
//	}

}

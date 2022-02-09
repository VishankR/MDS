package com.mds.dtos;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@ToString
public class ContactDTO {
	
	private String homeContact;
	
	private String officeContact;
	
	private String mobileContact;
	
}

package com.mds.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//JPA Annotation
@Embeddable
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@ToString
public class Contact {
	
	@Column(name = "home_contact")
	private String homeContact;
	
	@Column(name = "office_contact")
	private String officeContact;

	@Column(nullable = false, name = "mobile_contact")
	private String mobileContact;
	
}

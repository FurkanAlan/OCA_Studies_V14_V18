package com.syntax.class20;

public class Doctor {
	int doctorId;
	String name;
}

class Dentist extends Doctor {

	String cert;

	Dentist(String name, int doctorId, String cert) {
		super.name = name;
		super.doctorId = doctorId;
		this.cert = cert;
	}
}
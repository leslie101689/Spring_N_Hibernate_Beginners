package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	
	private String favouriteLanguage;
	
	private String operatingSystem;
	
	private LinkedHashMap<String, String> favouriteLanguageOptions;
	
	private LinkedHashMap<String, String> operatingSystemOptions;
	
	Student() {
		
		//populate favourite language options
		favouriteLanguageOptions = new LinkedHashMap<>();
		
		//populate operating system options
		operatingSystemOptions = new LinkedHashMap<>();
		
		//parameter order: value, display label
		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("C#", "C#");
		favouriteLanguageOptions.put("PHP", "PHP");
		favouriteLanguageOptions.put("Ruby", "Ruby");
		
		operatingSystemOptions.put("Linux", "Linux");
		operatingSystemOptions.put("Mac OS", "Mac Os");
		operatingSystemOptions.put("MS Windows", "MS Windows");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}

	public LinkedHashMap<String, String> getOperatingSystemOptions() {
		return operatingSystemOptions;
	}
	
}

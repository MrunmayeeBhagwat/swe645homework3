package com.example.demo.entity;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Survey {

	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	   
	    private String firstName;

	
	    private String lastName;

	  
	    private String streetAddress;

	    
	    private String city;

	   
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public String getStreetAddress() {
			return streetAddress;
		}

		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		public String getTelephoneNumber() {
			return telephoneNumber;
		}

		public void setTelephoneNumber(String telephoneNumber) {
			this.telephoneNumber = telephoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Date getSurveyDate() {
			return surveyDate;
		}

		public void setSurveyDate(Date surveyDate) {
			this.surveyDate = surveyDate;
		}

		public String getLikedMost() {
			return likedMost;
		}

		public void setLikedMost(String likedMost) {
			this.likedMost = likedMost;
		}

		public String getInterestedInUniversity() {
			return interestedInUniversity;
		}

		public void setInterestedInUniversity(String interestedInUniversity) {
			this.interestedInUniversity = interestedInUniversity;
		}

		public String getLikelihoodToRecommend() {
			return likelihoodToRecommend;
		}

		public void setLikelihoodToRecommend(String likelihoodToRecommend) {
			this.likelihoodToRecommend = likelihoodToRecommend;
		}

		private String state;


	    private String zip;

	  
	    private String telephoneNumber;

	
	    private String email;

	    @Temporal(TemporalType.DATE)
	    private Date surveyDate;

	    // Liked most about the campus (students, location, campus, atmosphere, dorm rooms, sports)
	    
	    private String likedMost;

	    // How they became interested in the university (friends, television, Internet, other)
	   
	    private String interestedInUniversity;

	    // Likelihood of recommending the school (Very Likely, Likely, Unlikely)
	   
	    private String likelihoodToRecommend;

	    // Getters and Setters
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

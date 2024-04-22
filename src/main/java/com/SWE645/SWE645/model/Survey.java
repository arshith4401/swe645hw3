package com.SWE645.SWE645.model;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name="survey")
public class Survey {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name="username")
    private String username;

	@Column(name="Month")
    private String month;

	@Column(name="Year")
    private int year;

	@Column(name="street_address")
    private String streetAddress;

	@Column(name="city")
    private String city;

	@Column(name="zip")
    private int zip;

	@Column(name="telephone")
    private int telephone;	

	@Column(name="email")
    private String email;

	@Column(name="Date")
    private Date date;

	@Column(name="campus_likes")
    private String campusLikes;

	@Column(name="university_discovery")
    private String universityDiscovery;

	@Column(name="likelihood_recommendations")
    private String likelihoodRecommendations;

	@Column(name="raffle_numbers")
    private int raffleNumbers;

	@Column(name="other_comments")
    private String otherComments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCampusLikes() {
		return campusLikes;
	}

	public void setCampusLikes(String campusLikes) {
		this.campusLikes = campusLikes;
	}

	public String getUniversityDiscovery() {
		return universityDiscovery;
	}

	public void setUniversityDiscovery(String universityDiscovery) {
		this.universityDiscovery = universityDiscovery;
	}

	public String getLikelihoodRecommendations() {
		return likelihoodRecommendations;
	}

	public void setLikelihoodRecommendations(String likelihoodRecommendations) {
		this.likelihoodRecommendations = likelihoodRecommendations;
	}

	public int getRaffleNumbers() {
		return raffleNumbers;
	}

	public void setRaffleNumbers(int raffleNumbers) {
		this.raffleNumbers = raffleNumbers;
	}

	public String getOtherComments() {
		return otherComments;
	}

	public void setOtherComments(String otherComments) {
		this.otherComments = otherComments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(campusLikes, city, date, email, id, likelihoodRecommendations, month, otherComments,
				raffleNumbers, streetAddress, telephone, universityDiscovery, username, year, zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Survey other = (Survey) obj;
		return Objects.equals(campusLikes, other.campusLikes) && Objects.equals(city, other.city)
				&& Objects.equals(date, other.date) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id)
				&& Objects.equals(likelihoodRecommendations, other.likelihoodRecommendations)
				&& Objects.equals(month, other.month) && Objects.equals(otherComments, other.otherComments)
				&& raffleNumbers == other.raffleNumbers && Objects.equals(streetAddress, other.streetAddress)
				&& telephone == other.telephone && Objects.equals(universityDiscovery, other.universityDiscovery)
				&& Objects.equals(username, other.username) && year == other.year && zip == other.zip;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", username=" + username + ", month=" + month + ", year=" + year
				+ ", streetAddress=" + streetAddress + ", city=" + city + ", zip=" + zip + ", telephone=" + telephone
				+ ", email=" + email + ", date=" + date + ", campusLikes=" + campusLikes + ", universityDiscovery="
				+ universityDiscovery + ", likelihoodRecommendations=" + likelihoodRecommendations + ", raffleNumbers="
				+ raffleNumbers + ", otherComments=" + otherComments + "]";
	}
	
}

package com.sapient.ofd.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "restaurant_odf")
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer restaurantId;
	@NotBlank(message = "Restaurant name cannot be blank")
	private String restaurantName;
	private String restaurantType;
	private LocalTime openingTime;
	private LocalTime closingTime;
	private LocalDate establishedDate;
	@Range(min=1,max=7,message="Hotel rating between 1 and 7")
	private Integer rating;
	@NotNull(message="Address cannot be null")
	private String address;
	private Long contactNumber;
	
/*	public Restaurant() {
		
	}

	public Restaurant(Integer restaurantId, String restaurantName, String restaurantType, LocalTime openingTime,
			LocalTime closingTime, Integer rating, String address, Long contactNumber) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantType = restaurantType;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.rating = rating;
		this.address = address;
		this.contactNumber = contactNumber;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantType() {
		return restaurantType;
	}

	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}

	public LocalTime getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(LocalTime openingTime) {
		this.openingTime = openingTime;
	}

	public LocalTime getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public LocalDate getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(LocalDate establishedDate) {
		this.establishedDate = establishedDate;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", restaurantType="
				+ restaurantType + ", openingTime=" + openingTime + ", closingTime=" + closingTime
				+ ", establishedDate=" + establishedDate + ", rating=" + rating + ", address=" + address
				+ ", contactNumber=" + contactNumber + "]";
	}*/

	
	
	
	
}

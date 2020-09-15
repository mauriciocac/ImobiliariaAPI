package br.com.imobiliariaapi.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	private String _id;
	private String budget;
	private Integer age;
	private Nome name;
	private String company;
	private String email;
	private String phone;
	private String address;
	private String about;
	private String registered;
	private String latitude;
	private String longitude;
	private String channel;
	private List<Pictures> pictures;
	private List<ContactTimeline> contactTimeline;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getRegistered() {
		return registered;
	}

	public void setRegistered(String registered) {
		this.registered = registered;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Nome getName() {
		return name;
	}

	public void setName(Nome name) {
		this.name = name;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}


	public List<Pictures> getPictures() {
		return pictures;
	}

	public void setPictures(List<Pictures> pictures) {
		this.pictures = pictures;
	}

	public List<ContactTimeline> getContactTimeline() {
		return contactTimeline;
	}

	public void setContactTimeline(List<ContactTimeline> contactTimeline) {
		this.contactTimeline = contactTimeline;
	}

	@Override
	public String toString() {
		return name.toString() + ": " + company + " : " + email + " : " + channel +" : " +contactTimeline.toString();
	}
}

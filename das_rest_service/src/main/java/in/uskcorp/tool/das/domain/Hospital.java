package in.uskcorp.tool.das.domain;

import java.util.Date;

public class Hospital {

	private int id;
	private String name;
	private String availableFacilities;
	private int departmentId;
	private String departmentName;
	private String hospitalRegistrationNumber;
	private Date hospitalEstablishmentDate;
	private String startTime;
	private String endTime;
	private String contact;
	private String area;
	private String district;
	private String state;
	private Date createdDate;
	private Date updatedDate;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvailableFacilities() {
		return availableFacilities;
	}

	public void setAvailableFacilities(String availableFacilities) {
		this.availableFacilities = availableFacilities;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getHospitalRegistrationNumber() {
		return hospitalRegistrationNumber;
	}

	public void setHospitalRegistrationNumber(String hospitalRegistrationNumber) {
		this.hospitalRegistrationNumber = hospitalRegistrationNumber;
	}

	public Date getHospitalEstablishmentDate() {
		return hospitalEstablishmentDate;
	}

	public void setHospitalEstablishmentDate(Date hospitalEstablishmentDate) {
		this.hospitalEstablishmentDate = hospitalEstablishmentDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

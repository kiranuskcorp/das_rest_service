package in.uskcorp.tool.das.domain;

import java.util.Date;

public class User {

	private int id;
	private String name;
	private String email;
	private String password;
	private String phone;
	private String alternatePhone;
	private Date dob;
	private String gender;
	private String address;
	private int roleId;
	private String roleName;
	private String departmentName;
	private String specializationName;
	private String hospitalName;
	private int hospitalId;
	private int departmentId;
	private int specializationId;
	private float rating;
	private int experience;
	private String masterSlot;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAlternatePhone() {
		return alternatePhone;
	}

	public void setAlternatePhone(String alternatePhone) {
		this.alternatePhone = alternatePhone;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getSpecializationName() {
		return specializationName;
	}

	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getSpecializationId() {
		return specializationId;
	}

	public void setSpecializationId(int specializationId) {
		this.specializationId = specializationId;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getMasterSlot() {
		return masterSlot;
	}

	public void setMasterSlot(String masterSlot) {
		this.masterSlot = masterSlot;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email
				+ ", password=" + password + ", phone=" + phone
				+ ", alternatePhone=" + alternatePhone + ", dob=" + dob
				+ ", gender=" + gender + ", address=" + address + ", roleId="
				+ roleId + ", roleName=" + roleName + ", departmentName="
				+ departmentName + ", specializationName=" + specializationName
				+ ", hospitalName=" + hospitalName + ", hospitalId="
				+ hospitalId + ", departmentId=" + departmentId
				+ ", specializationId=" + specializationId + ", rating="
				+ rating + ", experience=" + experience + ", masterSlot="
				+ masterSlot + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", description="
				+ description + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getEmail()=" + getEmail() + ", getPassword()="
				+ getPassword() + ", getPhone()=" + getPhone()
				+ ", getAlternatePhone()=" + getAlternatePhone()
				+ ", getDob()=" + getDob() + ", getGender()=" + getGender()
				+ ", getAddress()=" + getAddress() + ", getRoleId()="
				+ getRoleId() + ", getRoleName()=" + getRoleName()
				+ ", getDepartmentName()=" + getDepartmentName()
				+ ", getSpecializationName()=" + getSpecializationName()
				+ ", getHospitalName()=" + getHospitalName()
				+ ", getHospitalId()=" + getHospitalId()
				+ ", getDepartmentId()=" + getDepartmentId()
				+ ", getSpecializationId()=" + getSpecializationId()
				+ ", getRating()=" + getRating() + ", getExperience()="
				+ getExperience() + ", getMasterSlot()=" + getMasterSlot()
				+ ", getCreatedDate()=" + getCreatedDate()
				+ ", getUpdatedDate()=" + getUpdatedDate()
				+ ", getDescription()=" + getDescription() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}

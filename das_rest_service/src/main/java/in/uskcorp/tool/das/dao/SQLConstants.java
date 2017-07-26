package in.uskcorp.tool.das.dao;

public class SQLConstants {

	public static final String SPECIALIZATION_SELECT = "SELECT sp.*, department_name FROM specialization sp, department dp where dp.id=sp.department_id AND sp.active_flag=0 ORDER BY sp.id desc";
	public static final String SPECIALIZATION_SELECT_BY_ID = "SELECT * FROM specialization where id = ?";
	public static final String SPECIALIZATION_INSERT = "INSERT INTO specialization(name, department_id,created_date, description) VALUES (?,?,?,?)";
	public static final String SPECIALIZATION_UPDATE = "UPDATE specialization set name=?, department_id=? ,updated_date=?,description=? WHERE id = ?";
	public static final String SPECIALIZATION_DELETE = "UPDATE specialization set active_flag=1 WHERE id = ?";
	public static final String SPECIALIZATION_READ_BY_ID = "select * from specialization where department_id=? and active_flag=0";

	public static final String USER_SELECT = "SELECT u.*, role_name FROM roles r, user u where r.id=u.role_id AND u.active_flag=0 ORDER BY u.id desc";
	public static final String USER_INSERT = "INSERT INTO user(name, email, password,phone, alternate_phone, date_of_birth, gender,address, role_id,department_id, specialization_id, hospital_id, created_date, rating, experience, master_slot, description) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String USER_DELETE = "UPDATE user set active_flag=1 WHERE id = ?";
	public static final String USER_UPDATE = "UPDATE user set name=?, email=?, password=?, phone=?, alternate_phone=?, date_of_birth= ?, gender=?, address=?,role_id=?,department_id=?, specialization_id=?,hospital_id=?, updated_date=?, rating=?, experience=?, master_slot=?,description=? WHERE id = ?";
	public static final String USER_SELECT_BY_ID = "SELECT * FROM user where id = ?";
	public static final String USER_ROLEUPDATE = "UPDATE user set name=?, email=?, password=?, phone=?, alternate_phone=?, date_of_birth= ?, gender=?, address=?,role_id=?,department_id=?, specialization_id=?,hospital_id=?, updated_date=?, rating=?, experience=?, master_slot=?,description=? WHERE role_id = ?";
	public static final String CHECK_EMAIL = "SELECT COUNT(email) FROM user where email= ?";

	public static final String DEPARTMENT_SELECT = "SELECT * FROM department where active_flag=0 ORDER by id desc";
	public static final String DEPARTMENT_INSERT = "INSERT INTO department(department_name, created_date, description) VALUES (?,?,?)";
	public static final String DEPARTMENT_DELETE = "UPDATE department set active_flag=1 WHERE id = ?";
	public static final String DEPARTMENT_UPDATE = "UPDATE department set department_name=?, updated_date=?, description=? WHERE id = ?";
	public static final String DEPARTMENT_SELECT_BY_ID = "SELECT * FROM department where id = ?";

	public static final String HOSPITAL_SELECT = "SELECT hp.*, GROUP_CONCAT(dp.department_name) FROM hospital hp, department dp WHERE hp.active_flag=0 and FIND_IN_SET(dp.id, hp.department_id) GROUP BY hp.department_id ORDER by id desc";
	public static final String HOSPITAL_SELECT_BY_ID = "SELECT * FROM hospital where id = ?";
	public static final String HOSPITAL_INSERT = "INSERT INTO hospital(name, available_facilities, department_id, hospital_registration_number, hospital_establishment_date, start_time,end_time,contact,area, district, state, created_date,description) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?) ";
	public static final String HOSPITAL_UPDATE = "UPDATE hospital set name=?, available_facilities=?, department_id=?, hospital_registration_number=?, hospital_establishment_date=?, start_time=?,end_time=?, contact=?, area=?, district=?,state=?,updated_date=?, description=? WHERE id = ?";
	public static final String HOSPITAL_DELETE = "UPDATE hospital set active_flag=1 WHERE id = ?";

	public static final String DOCTOR_SELECT = "SELECT d.*, dp.department_name as department_name, sp.name as specializaiton_name, hp.name as hospital_name FROM user d, hospital hp, department dp, specialization sp where dp.id= d.department_id AND sp.id = d.specialization_id AND hp.id= d.hospital_id and d.role_id=8 and d.active_flag=0 ORDER by id desc";
	public static final String DOCTOR_SELECT_BY_ID = "SELECT * FROM doctor where id = ?";
	public static final String DOCTOR_INSERT = "INSERT INTO doctor(name, email, password,phone, alternate_phone, date_of_birth, gender,address, role_id,department_id, specialization_id, hospital_id, created_date, rating, experience, master_slot, description) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String DOCTOR_UPDATE = "UPDATE doctor set name=?, email=?, phone=?, alternate_phone=?, date_of_birth= ?, gender=?, department_id=?, specialization_id=?, hospital_id=?, updated_date=?, rating=?, experience=?, master_slot=?,description=? WHERE id = ?";
	public static final String DOCTOR_DELETE = "UPDATE doctor set active_flag=1 WHERE id = ?";
	public static final String DOCTOR_READ_BY_ID = "select * from doctor where hospital_id=? and active_flag=0";

	public static final String APPOINTMENT_SELECT = "SELECT a.*,di.name as diseases_name ,d.name as doctorName,h.name as hospitalName FROM appointment a,doctor d,hospital h, diseases di where d.id=a.doctor_id and h.id = a.hospital_id AND a.diseases = di.id and a.active_flag=0 ORDER by id desc";
	public static final String APPOINTMENT_SELECT_BY_ID = "SELECT * FROM appointment where id = ?";
	public static final String APPOINTMENT_INSERT = "INSERT INTO appointment(patient_name, diseases, appointment_date, doctor_id, hospital_id, phone_number, registration_id, dob, time, email, area, city, state, pincode, created_date, description) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String APPOINTMENT_UPDATE = "UPDATE appointment set patient_name=?, diseases=?, appointment_date=?, doctor_id=?, hospital_id=?, phone_number=?, registration_id=?, dob=?,time=?, email=?,area=?, city=?, state=?, pincode=?, updated_date=?,description=? WHERE id = ?";
	public static final String APPOINTMENT_DELETE = "UPDATE appointment set active_flag=1 WHERE id = ?";
	public static final String HOSPITAL_READ_BY_ID = "select * from hospital where id=? and active_flag=0";
	public static final String SELECT_STATE = "SELECT DISTINCT state FROM states_cities";
	public static final String SELECT_CITY_BY_STATEWISE = "SELECT city_name FROM states_cities where state=?";

	public static final String ROLE_SELECT = "SELECT * from roles where active_flag=0 ORDER by id desc";
	public static final String ROLE_SELECT_BY_ID = "SELECT * FROM roles where id = ?";
	public static final String ROLE_INSERT = "INSERT INTO roles(role_name, created_date, description) VALUES (?,?,?)";
	public static final String ROLE_UPDATE = "UPDATE roles set role_name=?,updated_date=?, description=? WHERE id = ?";
	public static final String ROLE_DELETE = "UPDATE roles set active_flag=1 WHERE id = ?";

	public static final String DISEASES_SELECT = "SELECT d.*, department_name FROM department dp, diseases d where dp.id=d.department_id AND d.active_flag=0 ORDER BY d.id desc";
	public static final String DISEASES_SELECT_BY_ID = "SELECT * FROM diseases where id = ?";
	public static final String DISEASES_INSERT = "INSERT INTO diseases(name, department_id, created_date, description) VALUES (?,?,?,?)";
	public static final String DISEASES_UPDATE = "UPDATE diseases set name=?,department_id=?,updated_date=?, description=? WHERE id = ?";
	public static final String DISEASES_DELETE = "UPDATE diseases set active_flag=1 WHERE id = ?";
	// public static final String DISEASES_READ_BY_ID =
	// "select * from specialization where department_id=? and active_flag=0 ORDER BY `id` DESC";

	public static final String LOGIN_CREDENTIALS = "select user.*,role.role_name from user user , roles role where name= ? AND password = ? AND role.id = user.role_id";

	public static final String REPORTING_All = "SELECT a.*,d.name as doctorName,h.name as hospitalName FROM appointment a,doctor d,hospital h where d.id=a.doctor_id and h.id = a.hospital_id and a.active_flag=0 ORDER by id desc";
	public static final String REPORTING_BY_DOCTOR = "SELECT a.*,d.name as doctorName,h.name as hospitalName FROM appointment a,doctor d,hospital h";
	public static final String DUPLICATE_EMAIL = "select * from user where email= ?";

}

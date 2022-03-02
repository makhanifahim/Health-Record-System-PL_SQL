create table person 

( 

	person_id int primary key, 

	first_name varchar(25), 

	last_name varchar(25), 

	birthdate date, 

	gender varchar(10), 

	email varchar(50), 

	mobilno varchar(25) 

); 

create table address 

( 

	address_id int primary key, 

	state varchar(25), 

	city varchar(25), 

	area varchar(25), 

	nearby varchar(25), 

	pincode varchar(10) 

); 

create table users 

( 

	user_id int primary key, 

	person_id int references person(person_id), 

	address_id int references address(address_id), 

	has_insurance int 

); 

create table insuranceDetails 

( 

	insurance_id int primary key, 

	user_id int references users(user_id), 

	insurance_name varchar(50), 

	insurance_no varchar(50), 

	insurance_limit varchar(50), 

	insurance_type varchar(50), 

	company_help_no varchar(50) 

); 

create table contact_details 

( 

	contact_id int primary key, 

	user_id int references users(user_id), 

	person_id int references person(person_id), 

	relation varchar(25), 

	address_id int references address(address_id) 

); 

create table doctor_details 

( 

	doctor_id int primary key, 

	address_id int references address(address_id), 

	person_id int references person(person_id), 

	qualification varchar(50), 

	position varchar(25), 

	description varchar(100) 

); 

create table working_days 

( 

	days_id int primary key, 

	monday int, 

	tuesday int, 

	wednesday int, 

	thursday int, 

	friday int, 

	saturday int, 

	sunday int 

); 

create table clinic 

( 

	clinic_id int primary key, 

	doctor_id int references doctor_details(doctor_id), 

	name varchar(50), 

	address_id int references address(address_id), 

	timing varchar(10), 

	days_id int references working_days(days_id), 

	description varchar(200) 

); 

create table hospital 

( 

	hospital_id int primary key, 

	hospital_name varchar(50), 

	hospital_type varchar(25), 

	address_id int references address(address_id), 

	description varchar(100) 

  

); 

create table labs 

( 

	lab_id int primary key, 

	lab_name varchar(25), 

	lab_type varchar(25), 

	address_id int references address(address_id), 

	description varchar(100) 

); 

create table lab_testes 

( 

	test_id int primary key, 

	lab_id int references labs(lab_id), 

	name varchar(50), 

	charges int, 

	description varchar(100) 

); 

create table hospitalDoctors 

( 

	hdoctor_id int primary key, 

	hospital_id int references hospital(hospital_id), 

	doctor_id int references doctor_details(doctor_id) 

); 

create table workRecord 

( 

	wrecord_id int primary key, 

	doctor_id int references doctor_details(doctor_id), 

	area_type varchar(50), 

	working_as varchar(50), 

	hospital_id int, 

	clinic_id int, 

	time_from varchar(50), 

	time_to varchar(50), 

	days_id int references working_days(days_id) 

  

); 

create table blood_bank 

( 

	blood_bank_id int primary key, 

	name varchar(50), 

	address_id int references address(address_id) 

); 

create table blood_availability 

( 

	bavailable_id int primary key, 

	bloodbank_id int references blood_bank(blood_bank_id), 

	blood_group varchar(10), 

	blood_availability float 

); 

create table user_types 

( 

	utype_id int primary key, 

	user_type varchar(25) 

); 

create table credentials 

( 

	user_id int references users(user_id), 

	username varchar(20) primary key, 

	password varchar(5), 

	utype_id int references user_types(utype_id) 

); 

create table family_dcotor 

( 

	fdoctor_id int primary key, 

	user_id int references users(user_id), 

	doctor_id int references doctor_details(doctor_id) 

); 

create table checkup_remainder 

( 

	check_id int primary key, 

	user_id int references users(user_id), 

	doctor_id varchar(10), 

	lab_id varchar(50), 

	checkup_date_and_time varchar(50), 

	description varchar(50), 

	status varchar(25) 

); 

create table appointment_details 

( 

	appointment_id int primary key, 

	doctor_id int references doctor_details(doctor_id), 

	user_id int references users(user_id), 

	applying_date_time date, 

	appoint_date_time date, 

	status varchar(25), 

	description varchar(50), 

	prescription varchar(50) 

); 

create table reports 

( 

	report_id int primary key, 

	user_id int references users(user_id), 

	doctor_id varchar(40), 

	lab_id int, 

	report_priority varchar(50), 

	report_subject varchar(40), 

	report_description varchar(40), 

	report varchar(50) 

); 

create table appointment_reports 

( 

	app_report_id int primary key, 

	appointment_id int references appointment_details(appointment_id), 

	report_id int references reports(report_id) 

); 

create table permanent_diseases 

( 

	diseases_id int primary key, 

	user_id int references users(user_id), 

	diseases_name varchar(50), 

	status varchar(25), 

	stages varchar(25) 

); 

create table personal_diseases_reports 

( 

	pd_id int primary key, 

	diseases_id int references permanent_diseases(diseases_id), 

	report_id int references reports(report_id) 

); 
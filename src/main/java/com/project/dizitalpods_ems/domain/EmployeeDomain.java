package com.project.dizitalpods_ems.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class EmployeeDomain {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "slno")
		private long id;
		
		private String date;
		
		private String client;
		
		private String role;
		
		private String candidate_name;
		
		private String primary_contact;
		
		private String email;
		
		private String total_experience;
		
		private String CCTC;
		
		private String ECTC;
		
		private String official_NP;
		
		private String current_location;
		
		private String status;
		
		private String vaccination_status;
		
		private String recruiter;

		public EmployeeDomain() {
			super();
			// TODO Auto-generated constructor stub
		}

		public EmployeeDomain(long id, String date, String client, String role, String candidate_name,
				String primary_contact, String email, String total_experience, String cCTC, String eCTC,
				String official_NP, String current_location, String status, String vaccination_status,
				String recruiter) {
			super();
			this.id = id;
			this.date = date;
			this.client = client;
			this.role = role;
			this.candidate_name = candidate_name;
			this.primary_contact = primary_contact;
			this.email = email;
			this.total_experience = total_experience;
			CCTC = cCTC;
			ECTC = eCTC;
			this.official_NP = official_NP;
			this.current_location = current_location;
			this.status = status;
			this.vaccination_status = vaccination_status;
			this.recruiter = recruiter;
		}

		public long getSlno() {
			return id;
		}

		public void setSlno(long slno) {
			this.id = slno;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getClient() {
			return client;
		}

		public void setClient(String client) {
			this.client = client;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getCandidate_name() {
			return candidate_name;
		}

		public void setCandidate_name(String candidate_name) {
			this.candidate_name = candidate_name;
		}

		public String getPrimary_contact() {
			return primary_contact;
		}

		public void setPrimary_contact(String primary_contact) {
			this.primary_contact = primary_contact;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTotal_experience() {
			return total_experience;
		}

		public void setTotal_experience(String total_experience) {
			this.total_experience = total_experience;
		}

		public String getCCTC() {
			return CCTC;
		}

		public void setCCTC(String cCTC) {
			CCTC = cCTC;
		}

		public String getECTC() {
			return ECTC;
		}

		public void setECTC(String eCTC) {
			ECTC = eCTC;
		}

		public String getOfficial_NP() {
			return official_NP;
		}

		public void setOfficial_NP(String official_NP) {
			this.official_NP = official_NP;
		}

		public String getCurrent_location() {
			return current_location;
		}

		public void setCurrent_location(String current_location) {
			this.current_location = current_location;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVaccination_status() {
			return vaccination_status;
		}

		public void setVaccination_status(String vaccination_status) {
			this.vaccination_status = vaccination_status;
		}

		public String getRecruiter() {
			return recruiter;
		}

		public void setRecruiter(String recruiter) {
			this.recruiter = recruiter;
		}

		@Override
		public String toString() {
			return "EmployeeDomain [id=" + id + ", date=" + date + ", client=" + client + ", role=" + role
					+ ", candidate_name=" + candidate_name + ", primary_contact=" + primary_contact + ", email=" + email
					+ ", total_experience=" + total_experience + ", CCTC=" + CCTC + ", ECTC=" + ECTC + ", official_NP="
					+ official_NP + ", current_location=" + current_location + ", status=" + status
					+ ", vaccination_status=" + vaccination_status + ", recruiter=" + recruiter + "]";
		}
		
		
}


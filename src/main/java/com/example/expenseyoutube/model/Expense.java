package com.example.expenseyoutube.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_expenses")
@Setter
@Getter
@ToString
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "description")
	private String description;
	
	@Column(name = "amount")
	private BigDecimal amount;
	
	@Column(name = "note")
	private String note;

	
	@Column(name = "created_at")
	private Long createdAt;

	public String toString() {
		return "Expense{" + "id=" + id + ", expensename='" + description + '\'' + ", amount=" + amount + ", note='"
				+ note + '\'' + ", createdAt=" + createdAt + '}';
	}
	
	

	public String getDescription() {
		return description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public String getNote() {
		return note;
	}
	
	public Long getId() {
        return id;
    }

	public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
	public void setDescription(String description) {
		this.description = description;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public void setId(Long id) {
        this.id= id;
    }

	public void setNote(String note) {
		this.note = note;
	}

}

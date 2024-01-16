package com.example.expenseyoutube.model;

import java.math.BigDecimal;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="description")
	private String description;

	private BigDecimal amount;

	private String note;

	private Long createdAt;
	
	public String toString() {
        return "Expense{" +
                "id=" + id +
                ", expensename='" + description + '\'' +
                ", amount=" + amount +
                ", note='" + note + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
	
	public String getDescription() {
        return description;
    }
	
	public BigDecimal getAmount() {
        return amount;
    }


}

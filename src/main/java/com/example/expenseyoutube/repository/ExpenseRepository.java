package com.example.expenseyoutube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.expenseyoutube.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}

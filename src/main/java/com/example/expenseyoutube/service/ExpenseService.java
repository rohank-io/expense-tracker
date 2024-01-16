package com.example.expenseyoutube.service;

import java.util.List;

import com.example.expenseyoutube.model.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();

}

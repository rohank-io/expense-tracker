package com.example.expenseyoutube.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expenseyoutube.model.Expense;
import com.example.expenseyoutube.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;

	@Override
	public List<Expense> findAll() {
		// TODO Auto-generated method stub
		return expenseRepository.findAll();
	}

}

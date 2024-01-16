package com.example.expenseyoutube.service;

import java.math.BigDecimal;
import java.util.Date;
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

	@Override
	public void save(Expense expense) {
		// TODO Auto-generated method stub
		expense.setCreatedAt(System.currentTimeMillis());
		expenseRepository.save(expense);
	}
	
	public void saveExpense(String description, BigDecimal amount, String note) {
		Expense expense = new Expense();
		expense.setDescription(description);
		expense.setAmount(amount);
		expense.setNote(note);

		// The save method from the service will set the createdAt field
		save(expense);
	}

	@Override
	public Expense findById(Long id) {
		if(expenseRepository.findById(id).isPresent()){
			return expenseRepository.findById(id).get();
			
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		Expense expense = findById(id);
		expenseRepository.delete(expense);
		
	}
	
	
//	
//	public void save(Expense expense) {
//		expenseRepository.save(expense);
//	}
//	
	

}

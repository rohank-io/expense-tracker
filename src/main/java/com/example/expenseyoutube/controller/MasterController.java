package com.example.expenseyoutube.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.expenseyoutube.model.Expense;
import com.example.expenseyoutube.service.ExpenseService;

@Controller
public class MasterController {
	
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "List of expenses");
		List<Expense> expenses = expenseService.findAll();
		mav.addObject("expenses", expenses);
		return mav;
	}
}

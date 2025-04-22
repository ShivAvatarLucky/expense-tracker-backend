package com.nihar.expensetracker.expense_tracker_backend.repository;


import com.nihar.expensetracker.expense_tracker_backend.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}

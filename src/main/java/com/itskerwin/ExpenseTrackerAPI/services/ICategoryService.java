package com.itskerwin.ExpenseTrackerAPI.services;

import com.itskerwin.ExpenseTrackerAPI.domain.Category;
import com.itskerwin.ExpenseTrackerAPI.exception.EtBadRequestException;
import com.itskerwin.ExpenseTrackerAPI.exception.EtResourceNotFoundException;

import java.util.List;

public interface ICategoryService {

    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userID, Integer categoryID) throws EtResourceNotFoundException;

}

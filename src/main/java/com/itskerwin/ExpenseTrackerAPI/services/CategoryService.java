package com.itskerwin.ExpenseTrackerAPI.services;

import com.itskerwin.ExpenseTrackerAPI.domain.Category;
import com.itskerwin.ExpenseTrackerAPI.exception.EtBadRequestException;
import com.itskerwin.ExpenseTrackerAPI.exception.EtResourceNotFoundException;
import com.itskerwin.ExpenseTrackerAPI.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService implements ICategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> fetchAllCategories(Integer userId) {
        return null;
    }

    @Override
    public Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
        return null;
    }

    @Override
    public Category addCategory(Integer userId, String title, String description) throws EtBadRequestException {
        int categoryId = categoryRepository.create(userId, title, description);
        return categoryRepository.findByID(userId, categoryId);
    }

    @Override
    public void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException {

    }

    @Override
    public void removeCategoryWithAllTransactions(Integer userID, Integer categoryID) throws EtResourceNotFoundException {

    }
}

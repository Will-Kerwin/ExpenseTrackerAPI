package com.itskerwin.ExpenseTrackerAPI.repositories;

import com.itskerwin.ExpenseTrackerAPI.domain.Category;
import com.itskerwin.ExpenseTrackerAPI.exception.EtBadRequestException;
import com.itskerwin.ExpenseTrackerAPI.exception.EtResourceNotFoundException;

import java.util.List;

public interface ICategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findByID(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);
}

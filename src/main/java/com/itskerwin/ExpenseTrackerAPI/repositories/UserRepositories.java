package com.itskerwin.ExpenseTrackerAPI.repositories;

import com.itskerwin.ExpenseTrackerAPI.domain.User;
import com.itskerwin.ExpenseTrackerAPI.exception.EtAuthException;

public class UserRepositories {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}

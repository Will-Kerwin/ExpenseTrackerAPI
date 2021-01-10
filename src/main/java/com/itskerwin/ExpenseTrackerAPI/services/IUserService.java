package com.itskerwin.ExpenseTrackerAPI.services;

import com.itskerwin.ExpenseTrackerAPI.domain.User;
import com.itskerwin.ExpenseTrackerAPI.exception.EtAuthException;

public interface IUserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;


}


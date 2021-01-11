package com.itskerwin.ExpenseTrackerAPI.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/categories")
public class CategoryResource {

    @GetMapping("")
    public String getAllCategories(HttpServletRequest request){

        int userId = (int) request.getAttribute("userId");
        System.out.println(userId);
        return "Authenticated! UserId: " + userId;
    }
}

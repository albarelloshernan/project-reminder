package com.haa.todoer.service;

public interface LoginService {

    /** User ID and password validation.
     * @param userId
     * @param password
     * @return boolean
     */
    public boolean validateUser(String userId, String password);
}

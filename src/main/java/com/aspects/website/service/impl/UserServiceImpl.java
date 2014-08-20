package com.aspects.website.service.impl;

import com.aspects.website.dao.IUserDao;
import com.aspects.website.model.User;
import com.aspects.website.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of User Service
 *
 * Created on 20/08/2014
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService{

    /**
     * The User Dao
     */
    @Autowired
    private IUserDao userDao;

    /**
     * Save a user
     *
     * @param pUser the user to save
     */
    @Override
    public void saveUser(final User pUser){
        userDao.saveUser(pUser);
    }

    /**
     * Get a user by its id
     *
     * @param pUserId the user id
     * @return the user
     */
    @Override
    public User getUserById(final Integer pUserId){
        return userDao.getUserById(pUserId);
    }

    /**
     * Update a user
     *
     * @param pUser the user
     */
    @Override
    public void updateUser(final User pUser){
        userDao.updateUser(pUser);
    }

    /**
     * Delete a user
     *
     * @param pUser the user to delete
     */
    @Override
    public void deleteUser(final User pUser){
        userDao.deleteUser(pUser);
    }

}

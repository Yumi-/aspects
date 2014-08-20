package com.aspects.website.dao.impl;

import com.aspects.website.dao.IUserDao;
import com.aspects.website.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Implementation of User Dao
 *
 * Created on 20/08/2014
 */
@Repository
public class UserDaoImpl implements IUserDao {

    /**
     * The session factory
     */
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Save a user
     *
     * @param pUser the user to save
     */
    @Override
    public void saveUser(final User pUser){
        sessionFactory.getCurrentSession().persist(pUser);
    }

    /**
     * Get a user by its id
     *
     * @param pUserId the user id
     * @return the user
     */
    @Override
    public User getUserById(final Integer pUserId){
        return (User) sessionFactory.getCurrentSession().get(User.class, pUserId);
    }

    /**
     * Update a user
     *
     * @param pUser the user
     */
    @Override
    public void updateUser(final User pUser){
        sessionFactory.getCurrentSession().update(pUser);
    }

    /**
     * Delete a user
     *
     * @param pUser the user to delete
     */
    @Override
    public void deleteUser(final User pUser){
        sessionFactory.getCurrentSession().delete(pUser);
    }

}

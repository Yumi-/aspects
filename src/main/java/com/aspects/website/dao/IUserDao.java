package com.aspects.website.dao;

import com.aspects.website.model.User;

/**
 * Interface for User Dao
 *
 * Created on 20/08/2014
 */
public interface IUserDao {

    /**
     * Save a user
     *
     * @param pUser the user to save
     */
    void saveUser(final User pUser);

    /**
     * Get a user by its id
     *
     * @param pUserId the user id
     * @return the user
     */
    User getUserById(final Integer pUserId);

    /**
     * Update a user
     *
     * @param pUser the user
     */
    void updateUser(final User pUser);

    /**
     * Delete a user
     *
     * @param pUser the user to delete
     */
    void deleteUser(final User pUser);

}

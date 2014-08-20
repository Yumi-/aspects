package com.aspects.website.service;

import com.aspects.website.model.Recruit;

/**
 * Interface for Recruit service
 *
 * Created on 20/08/2014
 */
public interface IRecruitService {

    /**
     * Save a recruit
     *
     * @param pRecruit the recruit to save
     */
    void saveRecruit(final Recruit pRecruit);

    /**
     * Get a recruit by its id
     *
     * @param pRecruitId the recruit id
     * @return the recruit
     */
    Recruit getRecruitById(final Integer pRecruitId);

    /**
     * Update a recruit
     *
     * @param pRecruit the recruit
     */
    void updateRecruit(final Recruit pRecruit);

    /**
     * Delete a recruit
     *
     * @param pRecruit the recruit to delete
     */
    void deleteRecruit(final Recruit pRecruit);

}

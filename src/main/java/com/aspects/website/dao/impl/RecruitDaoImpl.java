package com.aspects.website.dao.impl;

import com.aspects.website.dao.IRecruitDao;
import com.aspects.website.model.Recruit;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Implementation of Recruit Dao
 *
 * Created on 20/08/2014
 */
@Repository
public class RecruitDaoImpl implements IRecruitDao {

    /**
     * The session factory
     */
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Save a recruit
     *
     * @param pRecruit the recruit to save
     */
    @Override
    public void saveRecruit(final Recruit pRecruit){
        sessionFactory.getCurrentSession().persist(pRecruit);
    }

    /**
     * Get a recruit by its id
     *
     * @param pRecruitId the recruit id
     * @return the recruit
     */
    @Override
    public Recruit getRecruitById(final Integer pRecruitId){
        return (Recruit) sessionFactory.getCurrentSession().get(Recruit.class, pRecruitId);
    }

    /**
     * Update a recruit
     *
     * @param pRecruit the recruit
     */
    @Override
    public void updateRecruit(final Recruit pRecruit){
        sessionFactory.getCurrentSession().update(pRecruit);
    }

    /**
     * Delete a recruit
     *
     * @param pRecruit the recruit to delete
     */
    @Override
    public void deleteRecruit(final Recruit pRecruit){
        sessionFactory.getCurrentSession().delete(pRecruit);
    }

}

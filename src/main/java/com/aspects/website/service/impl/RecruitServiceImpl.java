package com.aspects.website.service.impl;

import com.aspects.website.dao.IRecruitDao;
import com.aspects.website.model.Recruit;
import com.aspects.website.service.IRecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of Recruit Service
 *
 * Created on 20/08/2014
 */
@Service
@Transactional
public class RecruitServiceImpl implements IRecruitService {

    /**
     * The recruit dao
     */
    @Autowired
    private IRecruitDao recruitDao;

    /**
     * Save a recruit
     *
     * @param pRecruit the recruit to save
     */
    @Override
    public void saveRecruit(final Recruit pRecruit){
        recruitDao.saveRecruit(pRecruit);
    }

    /**
     * Get a recruit by its id
     *
     * @param pRecruitId the recruit id
     * @return the recruit
     */
    @Override
    public Recruit getRecruitById(final Integer pRecruitId){
        return recruitDao.getRecruitById(pRecruitId);
    }

    /**
     * Update a recruit
     *
     * @param pRecruit the recruit
     */
    @Override
    public void updateRecruit(final Recruit pRecruit){
        recruitDao.updateRecruit(pRecruit);
    }

    /**
     * Delete a recruit
     *
     * @param pRecruit the recruit to delete
     */
    @Override
    public void deleteRecruit(final Recruit pRecruit){
        recruitDao.deleteRecruit(pRecruit);
    }

}

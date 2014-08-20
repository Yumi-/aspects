package com.aspects.website.model;

import com.aspects.website.enums.EnumClass;
import com.aspects.website.enums.EnumRequirement;
import com.aspects.website.enums.EnumRole;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Recruit Entity
 *
 * Created on 20/08/2014
 */
@Entity
@Table(name = "RECRUIT")
public class Recruit implements Serializable {

    /**
     * Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    /**
     * Enum class
     */
    @Column(name = "CLASS")
    private EnumClass enumClass;

    /**
     * Enum role
     */
    @Column(name = "ROLE")
    private EnumRole enumRole;

    /**
     * Enum requirement
     */
    @Column(name = "REQUIREMENT")
    private EnumRequirement enumRequirement;

    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter for property 'id'.
     *
     * @param pId Value to set for property 'id'.
     */
    public void setId(final Integer pId) {
        id = pId;
    }

    /**
     * Getter for property 'enumClass'.
     *
     * @return Value for property 'enumClass'.
     */
    public EnumClass getEnumClass() {
        return enumClass;
    }

    /**
     * Setter for property 'enumClass'.
     *
     * @param pEnumClass Value to set for property 'enumClass'.
     */
    public void setEnumClass(final EnumClass pEnumClass) {
        enumClass = pEnumClass;
    }

    /**
     * Getter for property 'enumRole'.
     *
     * @return Value for property 'enumRole'.
     */
    public EnumRole getEnumRole() {
        return enumRole;
    }

    /**
     * Setter for property 'enumRole'.
     *
     * @param pEnumRole Value to set for property 'enumRole'.
     */
    public void setEnumRole(final EnumRole pEnumRole) {
        enumRole = pEnumRole;
    }

    /**
     * Getter for property 'enumRequirement'.
     *
     * @return Value for property 'enumRequirement'.
     */
    public EnumRequirement getEnumRequirement() {
        return enumRequirement;
    }

    /**
     * Setter for property 'enumRequirement'.
     *
     * @param pEnumRequirement Value to set for property 'enumRequirement'.
     */
    public void setEnumRequirement(final EnumRequirement pEnumRequirement) {
        enumRequirement = pEnumRequirement;
    }
}

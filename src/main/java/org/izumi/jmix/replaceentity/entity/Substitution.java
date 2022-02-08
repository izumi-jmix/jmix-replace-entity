package org.izumi.jmix.replaceentity.entity;

import io.jmix.core.entity.annotation.ReplaceEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.securitydata.entity.UserSubstitutionEntity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("Substitution")
@JmixEntity
@Entity(name = "Substitution")
@ReplaceEntity(UserSubstitutionEntity.class)
public class Substitution extends UserSubstitutionEntity {

    @Column(name = "ADDITIONAL")
    private String additional;

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }
}

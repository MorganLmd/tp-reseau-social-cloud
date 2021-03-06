package com.progparcomposant.reseausocial.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(InvitationId.class)
public class Invitation {

    @Id
    private Long firstUserId;
    @Id
    private Long secondUserId;
    private Timestamp invitationDate;

    public Long getFirstUserId() {
        return firstUserId;
    }

    public void setFirstUserId(Long firstUserId) {
        this.firstUserId = firstUserId;
    }

    public Long getSecondUserId() {
        return secondUserId;
    }

    public void setSecondUserId(Long secondUserId) {
        this.secondUserId = secondUserId;
    }

    public Timestamp getInvitationDate() {
        return invitationDate;
    }

    public void setInvitationDate(Timestamp invitationDate) {
        this.invitationDate = invitationDate;
    }
}

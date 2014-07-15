package org.keycloak.models.jpa.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author <a href="mailto:mposolda@redhat.com">Marek Posolda</a>
 */
@Entity
public class AuthenticationLinkEntity {

    @Id
    @GenericGenerator(name="keycloak_generator", strategy="org.keycloak.models.jpa.utils.JpaIdGenerator")
    @GeneratedValue(generator = "keycloak_generator")
    private String id;

    protected String authProvider;
    protected String authUserId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthProvider() {
        return authProvider;
    }

    public void setAuthProvider(String authProvider) {
        this.authProvider = authProvider;
    }

    public String getAuthUserId() {
        return authUserId;
    }

    public void setAuthUserId(String authUserId) {
        this.authUserId = authUserId;
    }
}

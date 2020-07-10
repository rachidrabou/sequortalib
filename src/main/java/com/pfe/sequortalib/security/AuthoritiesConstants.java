package com.pfe.sequortalib.security;

/**
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

    public static final String ADMIN = "ROLE_ADMIN";

    public static final String USER = "ROLE_USER";

    public static final String ETUDIANT = "ROLE_ETUDIANT";

    public static final String ENSEIGNANT = "ROLE_ENSEIGNANT";

    public static final String ANONYMOUS = "ROLE_ANONYMOUS";

    private AuthoritiesConstants() {
    }
        }
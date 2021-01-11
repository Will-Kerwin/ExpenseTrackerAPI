package com.itskerwin.ExpenseTrackerAPI;


import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;


public class Constants {

    // keys are mandated to be long enough for algo
    public static final SecretKey API_SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public static final long TOKEN_VALIDITY = 2 * 60 * 60 * 1000;
}

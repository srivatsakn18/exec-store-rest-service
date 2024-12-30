package com.grocery.store.util;

import java.util.Base64;

/**
 * Provider to decode basic auth credentials.
 */
public final class BasicAuthDecoder {

    private final String userid;
    private final String password;

    public BasicAuthDecoder(final String base64EncodedCredentials) {
        final String[] base64Decoded = new String(Base64.getDecoder().decode(base64EncodedCredentials.split("Basic ")[1])).split(":");
        this.userid = base64Decoded[0];
        this.password = base64Decoded[1];
    }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

}
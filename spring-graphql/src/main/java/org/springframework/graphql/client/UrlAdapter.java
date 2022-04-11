package org.springframework.graphql.client;

import org.springframework.web.util.DefaultUriBuilderFactory;

import java.net.URI;

public abstract class UrlAdapter {
    public static URI toURI(String url) {
        return new DefaultUriBuilderFactory().uriString(url).build();
    }
}
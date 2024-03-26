package com.samupert.common;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Produces("application/json")
@Consumes("application/json")
public @interface ApiResource {
}
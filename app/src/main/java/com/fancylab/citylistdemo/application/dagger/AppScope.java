package com.fancylab.citylistdemo.application.dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by David Liu on 14/5/18.
 * lyhmelbourne@gmail.com
 */

@Scope
@Retention(RetentionPolicy.CLASS)
public @interface AppScope {
}

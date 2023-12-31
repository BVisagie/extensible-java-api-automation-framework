package com.example.restful_booker.config;

import org.aeonbits.owner.Config;

/**
 * Why?
 * The class `RestfulBookerApiConfig` is the connection between the property file `restful_booker_api.properties` located within the resources package.
 * The `@Config.Sources` load the properties file and match the attributes with the `@Key`, so you automatically have the value.
 * You can see two sources.
 * The first one will get the property values from the system (as environment variables or from the command line) in the case you want to change it, for example, in a pipeline.
 * The second will load the `restful_booker_api.properties` file from the classpath.
 */
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:restful_booker_api.properties"})
public interface RestfulBookerApiConfig extends Config {
    @Key("api.base.uri")
    String baseUri();

    @Key("api.port")
    int apiPort();
}

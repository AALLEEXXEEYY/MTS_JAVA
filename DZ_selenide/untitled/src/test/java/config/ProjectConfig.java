package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/local.properties")
public interface ProjectConfig extends Config {
    @DefaultValue("https://www.booking.com/")
    String Url();
}



//    @DefaultValue("https://www.booking.com/")
//    String Url();
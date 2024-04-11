package readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.load("conf.properties");
    }

    String URL = readConfig().getString("url");
    String USER_EMAIL = readConfig().getString("email");
    String USER_PASSWORD =readConfig().getString("password");

}

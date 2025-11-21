package ex_30_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab250_REAL_EXAMPLE {
    public static void main(String[] args) {
        // Storing environment-specific config
        Map<String,String > envConfig = new HashMap<>();
        envConfig.put("production", "https://prod.api.com");
        envConfig.put("staging", "https://staging.api.com");

        // Managing user credentials
        Map<String,String > credentials = new HashMap<>();
        envConfig.put("admin", "admin123");
        envConfig.put("user", "https://staging.api.com");
    }
}

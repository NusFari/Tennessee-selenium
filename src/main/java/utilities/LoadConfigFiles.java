package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class LoadConfigFiles {
    private static final Logger LOGGER = LogManager.getLogger(LoadConfigFiles.class);

    public LoadConfigFiles() {
    }

    public Properties readPropertyValues() throws IOException {
        Properties prop = new Properties();
        InputStream inputStream = null;

        try {
            String propFileName = "config.properties";
            inputStream = this.getClass().getClassLoader().getResourceAsStream(propFileName);
            if (inputStream == null) {
                throw new FileNotFoundException("Property File " + propFileName + " not found in the classpath");
            }

            prop.load(inputStream);
        } catch (Exception var7) {
            LOGGER.error("Config File Load Exception: " + var7.getMessage());
        } finally {
            inputStream.close();
        }

        return prop;
    }
}

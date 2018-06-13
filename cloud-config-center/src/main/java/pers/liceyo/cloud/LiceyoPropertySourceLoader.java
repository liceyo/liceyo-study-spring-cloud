package pers.liceyo.cloud;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author liceyo
 * @version 2018/6/13
 */
@Configuration
@EnableAutoConfiguration
public class LiceyoPropertySourceLoader implements PropertySourceLoader {

    public LiceyoPropertySourceLoader() {
    }

    @Override
    public String[] getFileExtensions() {
        return new String[]{"properties"};
    }

    @Override
    public List<PropertySource<?>> load(String name, Resource resource) throws IOException {
        System.out.println(name);
        Map<String, ?> properties = this.loadProperties(resource);
        return properties.isEmpty() ? Collections.emptyList() : Collections.singletonList(new OriginTrackedMapPropertySource(name, properties));
    }

    private Map<String, ?> loadProperties(Resource resource) throws IOException {
        Properties props = new Properties();
        try (InputStream is = resource.getInputStream()) {
            props.load(new InputStreamReader(is, "UTF-8"));
        }
        return (Map)props;
    }
}

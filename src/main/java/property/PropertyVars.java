package property;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyVars {

    public static final String PATH_TO_PROPERTIES = "variables.properties";

    public static Values getProperty() {
        String url;
        long implicit_wait;
        long explicit_wait;
        Values values;

            Properties prop = new Properties();

            try (InputStream in = PropertyVars.class.getClassLoader().getResourceAsStream(PATH_TO_PROPERTIES)) {
                prop.load(in);
            }   catch (IOException ex) {
                System.out.println("Ошибка в программе: файл " + PATH_TO_PROPERTIES + " не обнаружено");
            }
            url = prop.getProperty("avito_url");
            implicit_wait = Long.parseLong((((prop.getProperty("implicit_wait")))));
            explicit_wait = Long.parseLong(((prop.getProperty("explicit_wait"))));

            values = new Values(url, implicit_wait, explicit_wait);

            return values;
        }
    }


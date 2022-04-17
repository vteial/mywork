@Grab('org.json:json:20220320')
import org.json.JSONObject;
import org.json.XML;
import org.json.XMLParserConfiguration;

@Component
class JsonJava implements CommandLineRunner {

    void run(String... args) {
        println "-----------App Started--------"

        JSONObject jsonObject = new JSONObject()
        jsonObject.put("id", 1L)
        jsonObject.put("name", "Kamil Khan")
        println jsonObject;

        jsonObject.put("content", "This is content")

        XMLParserConfiguration config = new XMLParserConfiguration()
        config = config.withcDataTagName(null)
        println XML.toString(jsonObject, "user", config)

        println "-----------App Finished--------"
    }
}

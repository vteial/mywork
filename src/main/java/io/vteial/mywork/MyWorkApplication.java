package io.vteial.mywork;

import org.json.JSONObject;
import org.json.XML;
import org.json.XMLParserConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyWorkApplication implements CommandLineRunner {

	private static final Logger _log = LoggerFactory.getLogger(MyWorkApplication.class);

	public static void main(String[] args) {
        SpringApplication.run(MyWorkApplication.class, args);
    }


    @Override
    public void run(String... args) {
		_log.info("*******App Started*********");

//		User u = User.builder().id(1L).name("Kamil Khan").build();
//		User u = new User();
//		u.setId(1L);
//		u.setName("Kamil Khan");
//		_log.info("{}", u);

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", 1L);
		jsonObject.put("name", "Kamil Khan");

		_log.info("{}", XML.toString(jsonObject));

		jsonObject.put("content", "This is content");

		XMLParserConfiguration config = new XMLParserConfiguration();
		config = config.withcDataTagName(null);
		_log.info("{}", XML.toString(jsonObject, "user", config));

		_log.info("*******App Finished*********");
	}

}


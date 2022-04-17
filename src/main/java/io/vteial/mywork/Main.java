package io.vteial.mywork;

import org.json.JSONObject;
import org.json.XML;

public class Main {

    public static void main(String[] args) {
        User u = new User();
        u.setId(1L);
        u.setName("Kamil Khan");
        System.out.println(u);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 1L);
        jsonObject.put("name", "Kamil Khan");

        System.out.println(XML.toString(jsonObject));
    }
}

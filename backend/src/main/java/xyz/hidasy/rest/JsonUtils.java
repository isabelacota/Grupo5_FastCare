package xyz.hidasy.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Caique Moreira caique.moreira@movile.com
 */
public class JsonUtils {

    private static final ObjectMapper OBJECT_MAPPER;

    static {
        OBJECT_MAPPER = new ObjectMapper();
        OBJECT_MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public static ObjectMapper getNewMapper() {
        return OBJECT_MAPPER.copy();
    }

    public static <T> T readFromJson(String value, Class<T> clazz) {
        return readFromJson(OBJECT_MAPPER, value, clazz);
    }

    public static <T> T readFromJson(ObjectMapper mapper, String value, Class<T> clazz) {

        try {
            if (value != null) {
                return mapper.readValue(value, clazz);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String writeToJson(Object obj) {
        return writeToJson(OBJECT_MAPPER, obj);
    }

    public static String writeToJson(ObjectMapper mapper, Object obj) {

        // avoid returning "null" string
        if (obj == null) {
            return null;
        }

        try {
            return mapper.writeValueAsString(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
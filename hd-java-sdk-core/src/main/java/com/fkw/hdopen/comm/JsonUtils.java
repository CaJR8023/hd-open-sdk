package com.fkw.hdopen.comm;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @author CAJR
 * @Description JACKSON JSON Utils
 * @date 2021/8/25 16:03
 */
public class JsonUtils {
    private static final Log log = LogFactory.getLog(JsonUtils.class);
    public static final ObjectMapper MAPPER = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            // 允许属性名称没有引号
            .configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true)
            // 低层级配置
            .configure(JsonParser.Feature.ALLOW_COMMENTS, true)
            //对于空的对象转json的时候不抛出错误
            .disable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
            //允许单引号
            .configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true)
            //视空字符传为null
            .enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

    public static String toString(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj.getClass() == String.class) {
            return (String) obj;
        }
        try {
            return MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("json parsing error: " + obj, e);
            return null;
        }
    }

    public static <T> T toBean(String json, Class<T> tClass) {
        try {
            return MAPPER.readValue(json, tClass);
        } catch (IOException e) {
            log.error("json parsing error: " + json, e);
            return null;
        }
    }

    /**
     * 将指定输入流解析为指定类型对象
     *
     * @param inputStream 输入流对象
     * @param tClass      指定类型
     * @return 返回一个指定类型对象
     */
    public static <T> T toBean(InputStream inputStream, Class<T> tClass) {
        try {
            return MAPPER.readValue(inputStream, tClass);
        } catch (IOException e) {
            log.error("json parsing error: " + inputStream, e);
            return null;
        }
    }

    public static <E> List<E> toList(String json, Class<E> eClass) {
        try {
            return MAPPER.readValue(json, MAPPER.getTypeFactory().constructCollectionType(List.class, eClass));
        } catch (IOException e) {
            log.error("json parsing error: " + json, e);
            return null;
        }
    }

    public static <K, V> Map<K, V> toMap(String json, Class<K> kClass, Class<V> vClass) {
        try {
            return MAPPER.readValue(json, MAPPER.getTypeFactory().constructMapType(Map.class, kClass, vClass));
        } catch (IOException e) {
            log.error("json parsing error: " + json, e);
            return null;
        }
    }

    public static <K, V> Map<K, V> toMap(Object obj, Class<K> kClass, Class<V> vClass) {
        return MAPPER.convertValue(obj, MAPPER.getTypeFactory().constructMapType(Map.class, kClass, vClass));
    }

    public static <T> T nativeRead(String json, TypeReference<T> type) {
        try {
            return MAPPER.readValue(json, type);
        } catch (IOException e) {
            log.error("json parsing error: " + json, e);
            return null;
        }
    }
}

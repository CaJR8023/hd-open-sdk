package com.fkw.hdopen.comm;

import java.util.Collection;
import java.util.Map;

/**
 * @author CAJR
 * @Description CollectionUtils
 * @date 2021/9/9 18:44
 */
public class CollectionUtils {
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }
}

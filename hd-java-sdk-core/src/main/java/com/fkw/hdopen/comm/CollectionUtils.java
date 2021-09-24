package com.fkw.hdopen.comm;

import java.util.Collection;
import java.util.Map;

/**
 * CollectionUtils
 *
 * @author CAJR
 * @version 1.0.0
 */
public class CollectionUtils {
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }
}

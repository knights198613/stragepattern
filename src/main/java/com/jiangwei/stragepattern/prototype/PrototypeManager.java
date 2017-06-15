package com.jiangwei.stragepattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by weijiang
 * Date: 2017/6/15
 * Desc: 原型管理器(饿汉单例模式)
 */
public class PrototypeManager {

    private Map<String, OfficeDocument> documentMap = new HashMap<String, OfficeDocument>();
    public static final PrototypeManager pm = new PrototypeManager();

    private PrototypeManager() {
    }

    public static PrototypeManager getInstance() {
        return pm;
    }

    public PrototypeManager addDocument(String key, OfficeDocument document) {
        documentMap.put(key, document);
        return this;
    }

    public OfficeDocument removeDocument(String key) {
        return documentMap.remove(key);
    }

    public OfficeDocument getDocument(String key) {
        return documentMap.get(key).cloneDocument();
    }
}

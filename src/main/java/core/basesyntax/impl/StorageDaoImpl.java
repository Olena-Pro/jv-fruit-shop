package core.basesyntax.impl;

import core.basesyntax.dao.StorageDao;
import core.basesyntax.db.Storage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StorageDaoImpl implements StorageDao {
    @Override
    public void putFruit(String key, Integer value) {
        Storage.FRUIT_STORAGE.put(key, value);
    }

    @Override
    public List<String> getAllFruits() {
        return new ArrayList<>(Storage.FRUIT_STORAGE.entrySet())
                .stream()
                .map(Object::toString)
                .toList();
    }

    @Override
    public Map<String, Integer> getMap() {
        return Storage.FRUIT_STORAGE;
    }
}

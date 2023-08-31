package service.operation;

import dao.StorageDao;
import model.FruitTransaction;

public class SupplyHandler implements OperationHandler {
    private final StorageDao storageDao;

    public SupplyHandler(StorageDao storageDao) {
        this.storageDao = storageDao;
    }

    @Override
    public void processTransaction(FruitTransaction record) {
        int value = record.getQuantity() + storageDao.getMap().get(record.getFruit());
        storageDao.putFruit(record.getFruit(),value);
    }
}

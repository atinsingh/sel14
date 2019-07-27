package co.pragra.b14;

import co.pragra.b14.co.pragra.b14.db.DataBaseManager;

public class MongoManage extends DataBaseManager {

    @Override
    public String getDbType() {
        return "MONGO";
    }
}

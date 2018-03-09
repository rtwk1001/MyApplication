package incture.com.myapplication;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by emb-sadabir on 7/2/17.
 */
public class TripApplication extends Application {

    private static TripApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Realm.init(this);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().name(
                "sample.realm").schemaVersion(0).deleteRealmIfMigrationNeeded().build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }

    public static TripApplication getInstance() {
        return instance;
    }
}

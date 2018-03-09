package incture.com.myapplication.db.interfaces;


import incture.com.myapplication.model.TripResponse;

/**
 * Created by Ritwik.Jain on 3/9/2018.
 */
public interface TripRepository {

    void addTripData(TripResponse student);

    void getAllData();

    void getOrderById(String id);
}

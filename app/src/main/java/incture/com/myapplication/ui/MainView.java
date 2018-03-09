package incture.com.myapplication.ui;

import incture.com.myapplication.model.TripResponse;

/**
 * Created by Ritwik.Jain on 3/9/2018.
 */

public interface MainView {

    void tripData(TripResponse tripData);

    void apiError();
}

package incture.com.myapplication.net;

import incture.com.myapplication.model.TripRequest;
import incture.com.myapplication.model.TripResponse;
import incture.com.myapplication.utils.Constants;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.PUT;

/**
 * Created by Ritwik.Jain on 3/9/2018.
 */

public interface TripService {

    @PUT(Constants.API_TRIP_DATA)
    Call<TripResponse> getTripData(@Header("Authorization") String authkey,
                                   @Body TripRequest request);
}

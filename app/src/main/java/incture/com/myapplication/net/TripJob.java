package incture.com.myapplication.net;

import org.greenrobot.eventbus.EventBus;

import incture.com.myapplication.model.TripRequest;
import incture.com.myapplication.model.TripResponse;
import incture.com.myapplication.utils.Constants;
import io.realm.RealmList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Ritwik.Jain on 3/9/2018.
 */

public class TripJob {

    private final String mAction;
    private final TripService mTripService;
    private final Object mRequest;

    public TripJob(String action, Object request) {
        this.mAction = action;
        mTripService = RestClient.getRetrofit().create(TripService.class);
        mRequest = request;
    }

    public void doApiCall() {
        if(mAction.equals(Constants.ACTION_GET_TRIP_DATA)){
            callTripData();
        }
    }

    private void callTripData() {
        Call<TripResponse> call = mTripService.getTripData(RestClient.getAuthToken(), (TripRequest) mRequest);
        call.enqueue(new Callback<TripResponse>() {
            @Override
            public void onResponse(Call<TripResponse> call, Response<TripResponse> response) {
                TripResponse tripResponse = response.body();
                if(tripResponse.isStatus()) {
                    EventBus.getDefault().post(new FinishedEvent(true, mAction, tripResponse));
                } else {
                    EventBus.getDefault().post(new FinishedEvent(false, mAction));
                }
            }

            @Override
            public void onFailure(Call<TripResponse> call, Throwable t) {
                EventBus.getDefault().post(new FinishedEvent(false, mAction));
            }
        });
    }

    public static class FinishedEvent {

        TripResponse mTripResponse;
        boolean isSuccess;
        String mAction;

        public FinishedEvent(boolean isSuccess, String action) {
            this.isSuccess=isSuccess;
            this.mAction=action;
        }

        public FinishedEvent(boolean isSuccess, String action, TripResponse student) {
            this.isSuccess=isSuccess;
            this.mAction=action;
            this.mTripResponse = student;
        }

        public boolean isSuccess() {
            return isSuccess;
        }

        public String getAction() {
            return mAction;
        }

        public TripResponse getTripData() {
            return mTripResponse;
        }
    }
}

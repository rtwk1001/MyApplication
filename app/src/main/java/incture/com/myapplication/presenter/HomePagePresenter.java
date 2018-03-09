package incture.com.myapplication.presenter;

import android.util.Log;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import incture.com.myapplication.model.TripRequest;
import incture.com.myapplication.net.TripJob;
import incture.com.myapplication.ui.MainView;
import incture.com.myapplication.utils.Constants;

/**
 * Created by Ritwik.Jain on 3/9/2018.
 */

public class HomePagePresenter extends BasePresenter{

    public static final String TAG = HomePagePresenter.class.getSimpleName();
    private MainView mView;

    public HomePagePresenter(MainView mainView) {
        this.mView = mainView;
    }

    public void getTripData(TripRequest tripRequest){
        TripJob tripJob = new TripJob(Constants.ACTION_GET_TRIP_DATA, tripRequest);
        tripJob.doApiCall();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onActionFinished(TripJob.FinishedEvent event) {
        if(!event.isSuccess()){
            mView.apiError();
        }else {
            switch (event.getAction()){
                case Constants.ACTION_GET_TRIP_DATA:
                    mView.tripData(event.getTripData());
                    break;
            }
        }
    }
}

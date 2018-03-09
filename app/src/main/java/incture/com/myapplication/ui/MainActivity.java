package incture.com.myapplication.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import incture.com.myapplication.R;
import incture.com.myapplication.model.TripRequest;
import incture.com.myapplication.model.TripResponse;
import incture.com.myapplication.presenter.BasePresenter;
import incture.com.myapplication.presenter.HomePagePresenter;
import incture.com.myapplication.ui.adapter.OrderAdapter;

public class MainActivity extends BaseActivity implements MainView{

    HomePagePresenter mHomePagePresenter;
    private RecyclerView mRvStudents;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUi();

        mHomePagePresenter = new HomePagePresenter(this);
        TripRequest tripRequest = new TripRequest();
        tripRequest.setTripId("TRIP00000002");
        mHomePagePresenter.getTripData(tripRequest);
    }

    private void initUi() {
        mProgressBar = findViewById(R.id.progressBar);
        mRvStudents = (RecyclerView) findViewById(R.id.rvTrip);
        mRvStudents.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRvStudents.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    protected BasePresenter getPresenter() {
        return mHomePagePresenter;
    }

    @Override
    public void tripData(TripResponse tripData) {
        mProgressBar.setVisibility(View.GONE);
        Log.d("LOG", "tripData: " + tripData);
        OrderAdapter orderAdapter = new OrderAdapter(this, tripData.getData().getDeliveryHeader());
        mRvStudents.setAdapter(orderAdapter);
    }

    @Override
    public void apiError() {
        Toast.makeText(this, "Api Failed", Toast.LENGTH_SHORT).show();
    }
}

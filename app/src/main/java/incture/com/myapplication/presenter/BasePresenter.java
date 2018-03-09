package incture.com.myapplication.presenter;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by Ritwik.Jain on 3/9/2018.
 */

public class BasePresenter {

    public BasePresenter() {
    }

    public void onStart() {
        EventBus.getDefault().register(this);
    }

    public void onResume() {
        if (!(EventBus.getDefault().isRegistered(this))) {
            EventBus.getDefault().register(this);
        }
    }

    public void onDestroy() {
        EventBus.getDefault().unregister(this);
    }
}

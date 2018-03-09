package incture.com.myapplication.ui;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import incture.com.myapplication.presenter.BasePresenter;

/**
 * Created by Ritwik.Jain on 3/9/2018.
 */
public abstract class BaseActivity extends AppCompatActivity {

    abstract protected BasePresenter getPresenter();

    @Override
    protected void onStart() {
        super.onStart();
        resumePresenter();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroyPresenter();
    }

    private void resumePresenter() {
        if (getPresenter() != null) {
            getPresenter().onResume();
        }
    }

    private void destroyPresenter() {
        if (getPresenter() != null) {
            getPresenter().onDestroy();
        }
    }
}


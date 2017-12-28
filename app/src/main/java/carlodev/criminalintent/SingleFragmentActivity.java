package carlodev.criminalintent;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import static android.R.attr.fragment;

/**
 * Created by John Carlo Adamos on 10/29/2017.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {
    protected abstract Fragment createFragment();

    @LayoutRes
    protected int getLayoutResId(){
        return R.layout.activity_fragment;
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
         * Deleted this line of code for the two fragment one activity layout
         * setContentView(R.layout.activity_fragment);
         */
        setContentView(getLayoutResId());
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        /**
         * Comment to try kung gagana padin kahit wala to since gumawa naman
         * tayo ng ganitong activity talaga.
         *
         * Ginawa ko na icomment, pero di na gumana, blank screen nalang.
         * Need pala talaga tong mga to.
         */
        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}

package carlodev.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by John Carlo Adamos on 10/29/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

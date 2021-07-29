package udacity.projectpractice1.hongkongjourney.adapter;

import android.content.ContentResolver;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import udacity.projectpractice1.hongkongjourney.fragment.AttractionFragment;
import udacity.projectpractice1.hongkongjourney.fragment.HotelFragment;
import udacity.projectpractice1.hongkongjourney.fragment.ShoppingMallFragment;
import udacity.projectpractice1.hongkongjourney.fragment.ThemePartFragment;

/**
 * {@link ExploreAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of objects.
 */

public class ExploreAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String exploreTabTitles[] = new String[] { "Attractions", "Shop", "Park", "Hotel" };
    private Context context;

    /**
     * Create a new {@link ExploreAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public ExploreAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionFragment();
        } else if (position == 1) {
            return new ShoppingMallFragment();
        } else if (position == 2) {
            return new ThemePartFragment();
        } else {
            return new HotelFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    /**
     * Return the page title here.
     * */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return exploreTabTitles[position];
    }
}

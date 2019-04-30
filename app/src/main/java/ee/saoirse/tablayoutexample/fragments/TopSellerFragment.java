/*
 * Created by Tareq Islam on 4/30/19 11:12 AM
 *
 *  Last modified 4/30/19 11:12 AM
 */

package ee.saoirse.tablayoutexample.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ee.saoirse.tablayoutexample.R;

/***
 * Created by mtita on 30,April,2019.
 */
public class TopSellerFragment extends Fragment {

    private TopSellerFragment() {
    }

    public static TopSellerFragment newInstance(){
        return new TopSellerFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main_top_seller_fragment, container, false);

        return view;
    }
}

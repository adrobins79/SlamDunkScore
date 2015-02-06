package com.nba.as.slamdunkscore;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_container);

        ChooseScoreFragment chooseScoreFragment = new ChooseScoreFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.main_container, chooseScoreFragment);
        transaction.commit();

    }

    /*
    public static class ChooseScoreFragment extends Fragment {
        private Button [] buttons;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            return inflater.inflate(R.layout.choose_score, container, false);
        }

        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            buttons = new Button[11];
            buttons[6] = (Button) getActivity().findViewById(R.id.button6);
            buttons[7] = (Button) getActivity().findViewById(R.id.button7);
            buttons[8] = (Button) getActivity().findViewById(R.id.button8);
            buttons[9] = (Button) getActivity().findViewById(R.id.button9);
            buttons[10] = (Button) getActivity().findViewById(R.id.button10);

            for(int i =0 ; i < buttons.length; i++){
                Button b = buttons[i];
                if(b != null){
                    b.setOnClickListener(new onScoreClick(getActivity(),i));
                }
            }
        }
        public class onScoreClick implements View.OnClickListener {
            private int show_score;
            private Activity activity;
            public onScoreClick(Activity activity, int show_score){
                this.show_score = show_score;
                this.activity = activity;
            }
            @Override
            public void onClick(View v) {
                ShowScoreFragment scoreFragment = new ShowScoreFragment();

                Bundle bundle = new Bundle();
                bundle.putInt("show_score", show_score);
                scoreFragment.setArguments(bundle);

                FragmentTransaction transaction = activity.getFragmentManager().beginTransaction();
                transaction.add(R.id.main_container, scoreFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        }
    }

    public static class ScoreFragment extends Fragment {
        private Drawable[] images;


        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            images  = new Drawable[11];
            images[6] = getResources().getDrawable(R.drawable.score_8);
            images[7] = getResources().getDrawable(R.drawable.score_8);
            images[8] = getResources().getDrawable(R.drawable.score_8);
            images[9] = getResources().getDrawable(R.drawable.score_9);
            images[10] = getResources().getDrawable(R.drawable.score_9);

            ImageView scoreImageView = (ImageView)getActivity().findViewById(R.id.scoreImageView);

            Drawable image = images[getArguments().getInt("show_score")];
            scoreImageView.setImageDrawable(image);

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


            return inflater.inflate(R.layout.show_score, container, false);
        }
    }

*/

}

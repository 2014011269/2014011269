package zimo.example.com.exercise12;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import zimo.example.com.exercise12.Word.WordContent;

public class MainActivity extends AppCompatActivity
        implements ItemFragment.OnListFragmentInteractionListener,
        DetailFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onListFragmentInteraction(WordContent.WordItem item) {
        Bundle argument = new Bundle();
        argument.putString("id",item.id);
        DetailFragment fragment = new DetailFragment();
        fragment.setArguments(argument);
        getFragmentManager().beginTransaction().replace(R.id.worddetail,fragment).commit();
    }

}

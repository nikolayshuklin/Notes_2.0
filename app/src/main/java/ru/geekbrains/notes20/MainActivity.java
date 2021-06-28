package ru.geekbrains.notes20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new FragmentOne(), "FragmentOne")
                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new FragmentTwo(), "FragmentTwo")
                .addToBackStack("FragmentTwo")
                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new FragmentInfo(), "FragmentThree")
                .addToBackStack(null)
                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new FragmentNote(), "FragmentFour")
                .addToBackStack(null)
                .commit();

        Fragment fragment = getSupportFragmentManager().findFragmentByTag("FragmentThree");

        if (fragment instanceof FragmentInfo) {
            ((FragmentInfo)fragment).doSomethingUseful();
        }

//        getSupportFragmentManager()
//                .beginTransaction()
//                .hide(fragment)
//                //.addToBackStack(null)
//                .commitNow();
//
//        getSupportFragmentManager()
//                .beginTransaction()
//                .show(fragment)
//                //.addToBackStack(null)
//                .commitNow();

        //getSupportFragmentManager().popBackStack("FragmentTwo", POP_BACK_STACK_INCLUSIVE);


    }
}
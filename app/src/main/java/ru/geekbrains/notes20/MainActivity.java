package ru.geekbrains.notes20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import static androidx.fragment.app.FragmentManager.POP_BACK_STACK_INCLUSIVE;

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
                .add(R.id.container, new FragmentThree(), "FragmentThree")
                .addToBackStack(null)
                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new FragmentFour(), "FragmentFour")
                .addToBackStack(null)
                .commit();

        Fragment fragment = getSupportFragmentManager().findFragmentByTag("FragmentThree");

        if (fragment instanceof FragmentThree) {
            ((FragmentThree)fragment).doSomethingUseful();
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
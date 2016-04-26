package com.example.souji.sample_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.common.SignInButton;

/**
 * Created by souji on 26/4/16.
 */
public class MainFrag extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_main, container, false);

        SignInButton signInButton = (SignInButton) rootView.findViewById(R.id.sign_in_button);
        signInButton.setSize(SignInButton.SIZE_STANDARD);

        final SignIn signIn = new SignIn();
        final SignUp signUp = new SignUp();

        Button sign_in = (Button) rootView.findViewById(R.id.sign_in);
        Button sign_up = (Button) rootView.findViewById(R.id.sign_up);

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =
                        fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frag_container, signIn).addToBackStack(null);
                    fragmentTransaction.commit();

            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =
                        fragmentManager.beginTransaction().addToBackStack(null);

                fragmentTransaction.replace(R.id.frag_container, signUp);
                fragmentTransaction.commit();

            }
        });

        return rootView;
    }
}

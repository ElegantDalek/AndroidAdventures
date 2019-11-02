package com.example.androidadventures

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class BottomBarActivity : AppCompatActivity(), RecyclerFragment.OnFragmentInteractionListener {

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_bar)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val newFragment: Fragment = RecyclerFragment()
        fragmentTransaction.add(R.id.fragment_container, newFragment).commit()


    }
}

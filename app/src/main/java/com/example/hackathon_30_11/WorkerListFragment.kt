package com.example.hackathon_30_11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val User_LOGIN = "userLogin"

/**
 * A simple [Fragment] subclass.
 * Use the [WorkerListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WorkerListFragment : Fragment() {
    private var userLogin: String = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            userLogin = it.getString(User_LOGIN)?.toString() ?: ""
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_worker_list, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(userLogin: String) =
            WorkerListFragment().apply {
                arguments = Bundle().apply {
                    putString(User_LOGIN, userLogin)
                }
            }
    }
}
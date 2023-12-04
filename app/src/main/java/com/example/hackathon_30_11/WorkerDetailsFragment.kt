package com.example.hackathon_30_11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_30_11.model.Worker

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val WORKER_PARAM = "worker"
class WorkerDetailsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var workerId: Int = -1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            workerId = it.getInt(WORKER_PARAM)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_worker_details, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(workerId: Int) =
            WorkerDetailsFragment().apply {
                arguments = Bundle().apply {
                    putInt(WORKER_PARAM, workerId)
                }
            }
    }
}
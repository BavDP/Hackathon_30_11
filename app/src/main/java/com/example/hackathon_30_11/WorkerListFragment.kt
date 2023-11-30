package com.example.hackathon_30_11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackathon_30_11.adapters.WorkerListAdapter
import com.example.hackathon_30_11.databinding.FragmentWorkerListBinding
import com.example.hackathon_30_11.model.Worker
import com.example.hackathon_30_11.mvp.workerList.WorkerListContract
import com.example.hackathon_30_11.mvp.workerList.WorkerListModel
import com.example.hackathon_30_11.mvp.workerList.WorkerListRepresent

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val User_LOGIN = "userLogin"

class WorkerListFragment : Fragment(), WorkerListContract.View {
    private var userLogin: String = "";
    private var represent: WorkerListContract.Represent = WorkerListRepresent(this, WorkerListModel())
    private lateinit var _binding: FragmentWorkerListBinding;
    private val binding: FragmentWorkerListBinding
        get() = _binding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            userLogin = it.getString(User_LOGIN)?.toString() ?: ""
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        represent.getWorkerList(userLogin)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWorkerListBinding.inflate(inflater)
        return binding.root
    }

    override fun showWorkerList(workerList: List<Worker>) {
        val recycleList = binding.workerListView
        recycleList.adapter = WorkerListAdapter(workerList)
        recycleList.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
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
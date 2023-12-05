package com.example.hackathon_30_11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import com.example.hackathon_30_11.databinding.FragmentWorkerDetailsBinding
import com.example.hackathon_30_11.helpers.AsyncPhotoLoader
import com.example.hackathon_30_11.model.TrustLevel
import com.example.hackathon_30_11.model.Worker
import com.example.hackathon_30_11.mvp.workerDetail.WorkerDetailContract
import com.example.hackathon_30_11.mvp.workerDetail.WorkerDetailModel
import com.example.hackathon_30_11.mvp.workerDetail.WorkerDetailRepresent

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val WORKER_PARAM = "worker"
class WorkerDetailsFragment : Fragment(), WorkerDetailContract.View {
    private lateinit var _binding: FragmentWorkerDetailsBinding
    private val binding
        get() = _binding
    private val represent: WorkerDetailContract.Represent = WorkerDetailRepresent(this, WorkerDetailModel)
    private var workerId: Int = -1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showDetailsOfWorker(represent.getWorkerById(workerId))
        setupButtonsClickListeners()
        setupTrustEditListeners()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            workerId = it.getInt(WORKER_PARAM)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        this._binding = FragmentWorkerDetailsBinding.inflate(inflater)
        return _binding.root
    }

    override fun showDetailsOfWorker(worker: Worker?) {
        worker?.let {
            binding.workerDetailsName.text = it.name
            binding.workerDetailsCompany.text = it.company
            binding.workerDetailsGender.text = it.gender
            binding.workerDetailsPhone.text = it.phone
            AsyncPhotoLoader().load(it.photoUrl, binding.workerDetailsPhoto)
            when (it.trustLevel) {
                TrustLevel.TRUST_GOOD -> {
                    binding.workerDetailsTrust.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.sentiment_satisfied, null))
                    binding.workerDetailsCard.setCardBackgroundColor(resources.getColor(R.color.trustLevelGood, null))
                }
                TrustLevel.TRUST_BAD -> {
                    binding.workerDetailsTrust.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.mood_bad, null))
                    binding.workerDetailsCard.setCardBackgroundColor(resources.getColor(R.color.trustLevelBad, null))
                }
                TrustLevel.TRUST_GREAT -> {
                    binding.workerDetailsTrust.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.sentiment_very_satisfied, null))
                    binding.workerDetailsCard.setCardBackgroundColor(resources.getColor(R.color.trustLevelGreat, null))
                }
                else -> {}
            }

        }
    }

    private fun setupButtonsClickListeners() {
        binding.workerDetailsCancelBtn.setOnClickListener{
            parentFragmentManager.popBackStack()
        }
        binding.workerDetailsSaveBtn.setOnClickListener {
            represent.saveWorker()
            parentFragmentManager.popBackStack()
        }
    }

    private fun setupTrustEditListeners() {
        binding.workerDetailsTrustEditImageBad.setOnClickListener{view ->
            view.tag = TrustLevel.TRUST_BAD
            trustEditIconClick(view)
        }
        binding.workerDetailsTrustEditImageGood.setOnClickListener{view ->
            view.tag = TrustLevel.TRUST_GOOD
            trustEditIconClick(view)
        }
        binding.workerDetailsTrustEditImageGreat.setOnClickListener{view ->
            view.tag = TrustLevel.TRUST_GREAT
            trustEditIconClick(view)
        }
    }

    private fun trustEditIconClick(icon: View) {
        represent.setWorkerTrustLevel(icon.tag as TrustLevel)
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
package com.example.hackathon_30_11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackathon_30_11.databinding.FragmentRegistrationBinding
import com.example.hackathon_30_11.mvp.register.RegisterRepresent
import com.example.hackathon_30_11.mvp.register.RegistrationFormContract

class RegistrationFragment : Fragment(), RegistrationFormContract.View {
    private lateinit var represent: RegistrationFormContract.Represent;
    private lateinit var _binding: FragmentRegistrationBinding
    private val binding: FragmentRegistrationBinding
        get() = _binding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.represent = RegisterRepresent(this)
    }

    override fun showRegistrationFormError(errorMessage: String) {
        if (!errorMessage.isEmpty()) {
            binding.regFragmentErrorMessageTextView.visibility = View.VISIBLE
            binding.regFragmentErrorMessageTextView.text = errorMessage
        } else {
            binding.regFragmentErrorMessageTextView.visibility = View.GONE
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.registrationBtn.setOnClickListener { view ->  doSubmitUserRegisterData()}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this._binding = FragmentRegistrationBinding.inflate(inflater)
        return _binding.root;
    }

    private fun doSubmitUserRegisterData() {
        val login = binding.regLoginTextInput.editText?.text.toString()
        val password = binding.regPasswordTextInput.editText?.text.toString()
        val password2 = binding.regPasswordVerifyTextInput.editText?.text.toString()
        if (represent.registerButtonClick(login, password, password2)) {
            // регистрационные данные верных - идем на список работниколв
            gotoWorkerListFragment(login)
        }
    }

    private fun gotoWorkerListFragment(userLogin: String) {
        parentFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            // считаю, что теоретически для разных пользователей может отображаться разный список
            // работников... поэтому на фрагмент со списком работников передаю логин пользователя
            .replace(R.id.fragmentContainerView, WorkerListFragment.newInstance(userLogin))
            .addToBackStack("")
            .commit()
    }

    companion object {
        @JvmStatic
        fun newInstance() = RegistrationFragment()
    }
}
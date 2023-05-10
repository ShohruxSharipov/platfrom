package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.myapplication.AppData.AppDatabase
import com.example.myapplication.AppData.Userr
import com.example.myapplication.databinding.FragmentRegistrationBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RegistrationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegistrationFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    val appDatabase: AppDatabase by lazy {
        AppDatabase.getInstanse(requireContext())
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        val list = mutableListOf("Select role", "Teacher", "Student")
        val adapter =
            ArrayAdapter<String>(requireContext(), android.R.layout.simple_spinner_item, list)
        binding.spinner.adapter = adapter

        binding.next2.setOnClickListener {
            val name = binding.userName.text.toString()
            val login = binding.userLog.text.toString()
            val password = binding.userPass.text.toString()
            val role = if (binding.spinner.selectedItem.toString() == "Teacher") {
                true
            } else false

            if (name.isEmpty() || login.isEmpty() || password.isEmpty()){
                Toast.makeText(requireContext(), "Please Fill All", Toast.LENGTH_SHORT).show()
            }else{
                appDatabase.getUserDao().addUser(Userr(user_name = name, user_login = login, user_password = password, role = role))
                parentFragmentManager.beginTransaction().replace(R.id.mainACtivity,LoginFragment()).commit()
            }
        }
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RegistrationFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
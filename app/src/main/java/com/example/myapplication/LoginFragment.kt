package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.myapplication.databinding.FragmentLoginBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

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
        val binding = FragmentLoginBinding.inflate(inflater,container,false)


//        binding.next.setOnClickListener {
//            var login = binding.userLogin.text.toString()
//            var password = binding.userPassword.text.toString()
////            val user = appDatabase.getPersonDao().User(login,password)
//
//            if (user == null){
//                Toast.makeText(requireContext(), "Register first", Toast.LENGTH_SHORT).show()
//            }else if (user.role == true){
//                Toast.makeText(requireContext(), "TEACHER", Toast.LENGTH_SHORT).show()
//            }else Toast.makeText(requireContext(), "STUDENT", Toast.LENGTH_SHORT).show()
//        }

//        binding.register.setOnClickListener {
//            parentFragmentManager.beginTransaction().replace(R.id.mainACtivity,RegistrationFragment())
//        }


        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LoginFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
package com.example.p11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.p11.databinding.FragmentListBinding


class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    lateinit var userAdapter: UserAdapter
    val myList: MutableList<User> = mutableListOf()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater)
        addToList()
        return binding.root
    }

    fun addToList() {
        myList.add(User("Joseph", 1, 1, "01118295474", "Mail1.com"))
        myList.add(User("Ahmed", 2, 2, "01234567890", "mail2.com"))
        myList.add(User("Mostafa", 3, 1, "01234567890", "mail3.com"))
        myList.add(User("Kiro", 4, 2, "01234567890", "mail4.com"))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.MyList.layoutManager =  LinearLayoutManager(requireContext()) //GridLayoutManager(requireContext(), 2)

        userAdapter = UserAdapter { adapterPair ->
            myList.remove(adapterPair.first)
            userAdapter.setUserList(myList)

        }
        binding.MyList.adapter = userAdapter
        userAdapter.setUserList(myList)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        myList.clear()
    }
}
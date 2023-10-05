package com.example.c4l3n1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.c4l3n1.databinding.RecyclerViewFragmentBinding

class RecyclerViewFragment : Fragment(R.layout.recycler_view_fragment) {
    private var _binding : RecyclerViewFragmentBinding? = null
    private val binding get() = _binding!!
    private val adapter = RecyclerAdapter()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = RecyclerViewFragmentBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = adapter
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)

    }
    fun createList(numItem: Int): ArrayList<RecyclerModel>? {
        val items: ArrayList<RecyclerModel> = ArrayList<RecyclerModel>()
        var lastContactId = 0
        for (i in 1..numItem) {
            items.add(RecyclerModel("Student " + ++lastContactId, i <= numItem / 2))
        }
        return items
    }
}
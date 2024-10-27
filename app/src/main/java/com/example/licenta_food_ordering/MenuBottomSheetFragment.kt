package com.example.licenta_food_ordering

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.licenta_food_ordering.adaptar.MenuAdapter
import com.example.licenta_food_ordering.databinding.FragmentMenuBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MenuBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentMenuBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBottomSheetBinding.inflate(inflater, container, false)

        binding.buttomBack.setOnClickListener {
            dismiss()
        }
        val menuFoodName = listOf( "burger", "sandwich", "momo", "item", "sanwich", "momo")
        val menuItemPrice = listOf("5$", "6$","2$","9$","4$","2$",)
        val menuImage = listOf(
            R.drawable.menu3,
            R.drawable.menu2,
            R.drawable.menu2,
            R.drawable.menu2,
            R.drawable.menu2,
            R.drawable.menu2
        )
        val adapter = MenuAdapter(ArrayList(menuFoodName), ArrayList(menuItemPrice), ArrayList(menuImage))
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }

}
package com.example.licenta_food_ordering.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.licenta_food_ordering.R
import com.example.licenta_food_ordering.adaptar.CartAdapter
import com.example.licenta_food_ordering.databinding.FragmentCartBinding

class CartFragment : Fragment() {
    private lateinit var binding:FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater, container, false)


        val cartFoodName = listOf( "burger", "sandwich", "momo", "item", "sanwich", "momo")
        val cartItemPrice = listOf("5$", "6$","2$","9$","4$","2$",)
        val cartImage = listOf(
            R.drawable.menu3,
            R.drawable.menu2,
            R.drawable.menu2,
            R.drawable.menu2,
            R.drawable.menu2,
            R.drawable.menu2
        )
        val adapter = CartAdapter(ArrayList(cartFoodName), ArrayList(cartItemPrice), ArrayList(cartImage))
        binding.cartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }
}
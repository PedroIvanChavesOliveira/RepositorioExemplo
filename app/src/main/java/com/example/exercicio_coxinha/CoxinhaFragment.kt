package com.example.exercicio_coxinha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CoxinhaFragment : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val foods: MutableList<Foods> = mutableListOf()

        val food1 = Foods("https://cdn.falauniversidades.com.br/wp-content/uploads/2020/05/18131036/Coxinha.png", "Coxinha", 10.0)
        val food2 = Foods("https://www.hojetemfrango.com.br/wp-content/uploads/2019/01/shutterstock_127449827.jpg", "Coxinha 2", 5.0)

        foods.addAll(listOf(food1, food2))

        activity?.findViewById<RecyclerView>(R.id.rvFoodsCoxinha)?.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MainAdapter(foods)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coxinha, container, false)
    }
}
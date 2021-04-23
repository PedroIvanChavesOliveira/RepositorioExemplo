package com.example.exercicio_coxinha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SnacksFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val foods: MutableList<Foods> = mutableListOf()

        val food1 = Foods("https://a-static.mlcdn.com.br/618x463/salgadinho-torcida-calabresa-80g-lucky/maniapingodemel/2521p/3345fed54c9747918230c5997bf3358e.jpg", "Salgadinho", 4.0)
        val food2 = Foods("https://www.receiteria.com.br/wp-content/uploads/enroladinho-frito-de-salsicha.jpg", "Salsichão", 2.0)

        foods.addAll(listOf(food1, food2))

        activity?.findViewById<RecyclerView>(R.id.rvFoodsSnacks)?.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MainAdapter(foods)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_snacks, container, false)
    }

}
package com.example.exercicio_coxinha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DrinksFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val foods: MutableList<Foods> = mutableListOf()

        val food1 = Foods("https://www.distribuidoracaue.com.br/media/catalog/product/cache/1/thumbnail/600x800/9df78eab33525d08d6e5fb8d27136e95/r/e/refrigerante-coca-cola-2-litros.jpg", "Coca-Cola", 8.0)
        val food2 = Foods("https://hiperideal.vteximg.com.br/arquivos/ids/173376-1000-1000/498807.jpg?v=636979271217000000", "Soda", 5.0)

        foods.addAll(listOf(food1, food2))

        activity?.findViewById<RecyclerView>(R.id.rvFoodsDrinks)?.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MainAdapter(foods)
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drinks, container, false)
    }
}
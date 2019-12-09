package com.kakaopay.navigationtest

import androidx.annotation.NavigationRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.fragment.findNavController

fun NavController.setStackMainTainGraph(graph: NavGraph) {
//    graph.addAll()

}

fun Fragment.navInfalter(@NavigationRes graph: Int): NavGraph {
    return findNavController().navInflater.inflate(graph)
}
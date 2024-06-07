package com.ihsanarslan.sayfalararasigecis.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.ihsanarslan.sayfalararasigecis.views.ScreenA
import com.ihsanarslan.sayfalararasigecis.views.ScreenB

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Router.ScreenA) {

        composable<Router.ScreenA> {
            ScreenA(navController=navController)
        }

        composable<Router.ScreenB> {
            val args = it.toRoute<Router.ScreenB>()
            ScreenB(navController = navController, name = args.name, surname = args.surname)
        }

    }
}
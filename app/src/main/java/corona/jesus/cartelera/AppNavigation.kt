package corona.jesus.cartelera

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login",
        modifier = modifier
    ) {
        composable("login") {
            LoginScreen(
                onLoginOk = {
                    navController.navigate("peliculas") {
                        popUpTo("login") { inclusive = true }
                    }
                }
            )
        }
        composable("peliculas") {
            PeliculasScreen(
                onPeliculaClick = { peliculaId ->
                    navController.navigate("detalle/$peliculaId")
                }
            )
        }
        composable(
            route = "detalle/{peliculaId}",
            arguments = listOf(
                navArgument("peliculaId") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val peliculaId = backStackEntry.arguments?.getInt("peliculaId") ?: 1
            DetalleScreen(
                peliculaId = peliculaId,
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}

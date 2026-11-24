package Navigation

import Views.ScreenView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class NavHostBuilder (val navigationController: NavHostController,
                      val navScreens : Map<String, ScreenView>,
                      val modifier: Modifier
){

    @Composable
    fun BuildHost(){
        NavHost(
            navController = this.navigationController,
            startDestination = this.navScreens.entries.first().key,
            modifier
        ){
            navScreens.forEach { (name, screen) ->
                composable (name) {
                    screen.Display()
                }
            }
        }
    }
}
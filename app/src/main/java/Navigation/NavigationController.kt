package Navigation

import Views.ScreenView
import Views.Screens.HomePage
import Views.Screens.SettingsPage
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class NavigationController {

    fun ConstructScreens() : Map<String, ScreenView>{
        return  mapOf(
            "HomePage" to HomePage(),
            "SettingsPage" to SettingsPage()
        )
    }

    @Composable
    fun BuildController(modifier: Modifier, controller: NavHostController){
        val hostBuilder = NavHostBuilder( controller
            ,ConstructScreens(),
            modifier)

        hostBuilder.BuildHost()
    }
}
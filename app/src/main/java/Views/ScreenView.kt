package Views

import androidx.compose.runtime.Composable

interface ScreenView {
    @Composable
    open fun Display()
}

interface ScreenViewParam<T>{
    @Composable
    open fun Display(param : T)
}
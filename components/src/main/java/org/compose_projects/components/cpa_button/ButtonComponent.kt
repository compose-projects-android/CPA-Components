import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ButtonComponent(text: String, onCLick: () -> Unit) {
    Button(onClick = { onCLick() }) {
        Text(text = text)
    }
}
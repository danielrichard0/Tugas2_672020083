package edu.uksw.fti.pam.acitivityintent

import android.content.Intent
import android.graphics.Paint.Align
import android.graphics.drawable.InsetDrawable
import android.icu.text.ListFormatter.Width
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Canvas
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PAMAcitivityIntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val username = getIntent().getStringExtra("username") ?: ""
                    Homepage(username)
                }
            }
        }
    }
}


@Composable
fun Homepage(name: String) {


    Box() {

        Image(
            painter = painterResource(id = R.drawable.pasar_gede),
            contentDescription = "Andy Rubin",
            modifier = Modifier.fillMaxWidth()
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(text = "Hello $name!",
            textAlign = TextAlign.Left,
            color = Color.LightGray,
        )

        Text(text = "Surakarta",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            color = Color.White,
        )
        Text(text = "20°",
            fontSize = 50.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
        )
        Text(text = "Mostly Clear",
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            color = Color.LightGray
        )

    }
    Box(
        modifier = Modifier
            .size(500.dp, 350.dp)
            .offset(x = 0.dp, y = 500.dp)

    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawRect(
                color = Color(40, 40, 50),
            )
        }

        Row(
            Modifier
                .padding(start = 25.dp, top = 20.dp, end = 25.dp)
        ) {

            Text(
                text = "Today",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )


            Text(
                text = "5-day forecast",
                Modifier.fillMaxWidth(),
                textAlign = TextAlign.End,
                fontSize = 20.sp,
                color = Color.Gray,

                )
        }
        Row(Modifier.padding(top = 70.dp, start = 25.dp, end =25.dp)) {
            Divider(color = Color.White, thickness = 1.dp)
        }
        Row(

            Modifier
                .padding(top = 80.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_4),
                contentDescription = "Andy Rubin",
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .offset(y = 20.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.img_5),
                contentDescription = "Andy Rubin",
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .offset(y = 20.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.img_6),
                contentDescription = "Andy Rubin",
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .offset(y = 20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.img_7),
                contentDescription = "Andy Rubin",
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .offset(y = 20.dp)
            )
        }
        // jam waktu
        Row() {
            TextGenerator("12AM", 90.dp)
            TextGenerator("Now", 90.dp)
            TextGenerator("1PM", 90.dp)
            TextGenerator("2PM", 90.dp)
        }
        Row() {
            TextGenerator(textInput = "34°", offsetInput = 165.dp)
            TextGenerator(textInput = "32°", offsetInput = 165.dp)
            TextGenerator(textInput = "31°", offsetInput = 165.dp)
            TextGenerator(textInput = "28°", offsetInput = 165.dp)
        }
        Image(
            painter = painterResource(id = R.drawable.img_10),
            contentDescription = "Andy Rubin",
            Modifier
                .padding(top = 100.dp)
                .align(Alignment.Center)
        )

        
        Image(
            painter = painterResource(id = R.drawable.img_14),
            contentDescription = "Andy Rubin",
            Modifier
                .padding(bottom = 20.dp)
                .scale(scale = 1.5f)
                .align(Alignment.BottomCenter)

        )
        Image(
            painter = painterResource(id = R.drawable.img_12),
            contentDescription = "Andy Rubin",
            Modifier
                .padding(top = 40.dp)
                .scale(scale = 1.5f)
                .align(Alignment.BottomStart)
                .padding(30.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.img_13),
            contentDescription = "Andy Rubin",
            Modifier
                .padding(top = 40.dp)
                .scale(scale = 1.5f)
                .align(alignment = Alignment.BottomEnd)
                .padding(30.dp)
        )



//    Box(modifier = Modifier.background(Color(40,40,50))
//        .size(300.dp, 150.dp)
//    ) {
//
     }

}
//R.drawable.img_8

//fun ImageGenerator(height: Dp, width: Dp , contDesc: String, drawableRes: DrawableRes) {
//    Image(
//        painter = painterResource(id = drawableRes),
//        contentDescription = contDesc,
//        Modifier.height(height)
//            .width(width)
//    )
//
//}

@Composable
fun TextGenerator(textInput: String, offsetInput: Dp ) {
    Text(
        text = textInput,
        Modifier
            .width(100.dp)
            .fillMaxHeight()
            .offset(y = offsetInput),
        fontWeight = FontWeight.Bold,
        color = Color.White,
        textAlign = TextAlign.Center
    )

}

@Composable
fun Greeting(name: String) {
    Box() {
        Text(text = "Hello $name!",
            textAlign = TextAlign.Left,
            color = Color.White,
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAMAcitivityIntentTheme {
        Homepage("Android")
    }
}
package com.example.remindmeapp
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNote = findViewById<EditText>(R.id.editTextNote)
        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val timePicker = findViewById<TimePicker>(R.id.timePicker)
        val buttonSave = findViewById<Button>(R.id.buttonSave)

        buttonSave.setOnClickListener {
            val noteText = editTextNote.text.toString()
            val day = datePicker.dayOfMonth
            val month = datePicker.month
            val year = datePicker.year
            val calendar = Calendar.getInstance()

            // Configuramos el calendario con la fecha seleccionada
            calendar.set(year, month, day, timePicker.currentHour, timePicker.currentMinute)

            // Convertimos la fecha del calendario a un objeto Date
            val date = calendar.time

            // Aquí puedes guardar la nota y la fecha del recordatorio
            // Puedes usar SharedPreferences, SQLite, o cualquier otro método de almacenamiento

            // Para este ejemplo, simplemente imprimimos la nota y la fecha en la consola
            println("Nota guardada: $noteText")
            println("Fecha del recordatorio: $date")
        }
    }
}

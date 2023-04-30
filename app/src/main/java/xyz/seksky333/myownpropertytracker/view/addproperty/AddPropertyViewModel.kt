package xyz.seksky333.myownpropertytracker.view.addproperty

import android.app.DatePickerDialog
import android.content.Context
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.Calendar

class AddPropertyViewModel : ViewModel() {


    var selectedDate: String = ""

    fun openDatePicker(context: Context) {
        val calendar = Calendar.getInstance()
        DatePickerDialog(
            context, { _, year, month, day ->
                selectedDate = getPickedDateAsString(year, month, day)
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
            .show()

    }


    private fun getPickedDateAsString(year: Int, month: Int, day: Int): String {
        val dateFormat = "yyyy-MM-dd"
        val calendar = Calendar.getInstance()
        calendar.set(year, month, day)
        return SimpleDateFormat(dateFormat).format(calendar.time)
    }
}
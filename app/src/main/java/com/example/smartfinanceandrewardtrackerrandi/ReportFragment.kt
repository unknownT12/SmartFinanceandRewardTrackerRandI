package com.example.smartfinanceandrewardtrackerrandi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// ReportFragment.kt
class ReportFragment : Fragment() {
    private lateinit var binding: FragmentReportBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentReportBinding.inflate(inflater, container, false)
        setupReportTable()
        return binding.root
    }

    private fun setupReportTable() {
        // Add table rows programmatically
        addTableRow("Income", "P10,000", "P9,800", "(P200)")
        addTableRow("Expenses", "P9,500", "P9,400", "(P100)")
        addTableRow("Balance (Inc - Exp)", "P500", "P400", "(P100)")
    }

    private fun addTableRow(vararg items: String) {
        val row = TableRow(context)
        items.forEach { text ->
            val tv = TextView(context).apply {
                this.text = text
                setPadding(8.dpToPx(), 8.dpToPx(), 8.dpToPx(), 8.dpToPx())
            }
            row.addView(tv)
        }
        binding.reportTable.addView(row)
    }

    private fun Int.dpToPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()
}}
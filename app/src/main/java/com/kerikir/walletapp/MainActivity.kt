package com.kerikir.walletapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kerikir.walletapp.Adapter.TransactionAdapter
import com.kerikir.walletapp.Model.Transaction
import com.kerikir.walletapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        setupBottomMenu()
    }

    private fun setupRecyclerView() {
        val list = listOf(
            Transaction("Add to Wallet", "12 Oct 2026", 923.20),
            Transaction("Transaction to Tina", "11 Oct 2026", -576.20),
            Transaction("Spotify Subscription", "10 Oct 2026", -14.99),
            Transaction("Salary Deposit", "01 Oct 2026", 3500.00),
            Transaction("Grocery Market", "28 Sep 2026", -128.45),
            Transaction("Refund from Store", "25 Sep 2026", 45.00)
        )

        binding.transactionView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.transactionView.adapter = TransactionAdapter(list)
    }

    private fun setupBottomMenu() {
        binding.bottomMenu.setItemSelected(R.id.home, true)
    }
}

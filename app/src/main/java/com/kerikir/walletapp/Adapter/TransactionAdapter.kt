package com.kerikir.walletapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.kerikir.walletapp.Model.Transaction
import com.kerikir.walletapp.R
import com.kerikir.walletapp.databinding.TransectionViewholderBinding
import java.util.Locale

class TransactionAdapter(
    private val items: List<Transaction>
) : RecyclerView.Adapter<TransactionAdapter.ViewHolder>() {

    class ViewHolder(val binding: TransectionViewholderBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = TransectionViewholderBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        val context = holder.itemView.context

        holder.binding.titleTxt.text = item.title
        holder.binding.dateTxt.text = item.date

        if (item.price >= 0.0) {
            holder.binding.priceTxt.text = String.format(Locale.US, "$%.2f", item.price)
            holder.binding.priceTxt.setTextColor(
                ContextCompat.getColor(context, R.color.darkGreen)
            )
            holder.binding.img.setImageResource(R.drawable.arrow_green)
            holder.binding.img.setBackgroundResource(R.drawable.light_green_bg)
        } else {
            holder.binding.priceTxt.text = String.format(Locale.US, "-$%.2f", kotlin.math.abs(item.price))
            holder.binding.priceTxt.setTextColor(
                ContextCompat.getColor(context, R.color.red)
            )
            holder.binding.img.setImageResource(R.drawable.arrow_ref)
            holder.binding.img.setBackgroundResource(R.drawable.light_red_bg)
        }
    }

    override fun getItemCount(): Int = items.size
}

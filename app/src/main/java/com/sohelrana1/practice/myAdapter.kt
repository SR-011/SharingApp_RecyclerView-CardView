package com.sohelrana1.practice

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sohelrana1.practice.databinding.ListItemsBinding

class myAdapter(val context:Context, val hobbies:List<Hobby>): RecyclerView.Adapter<myAdapter.MyViewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
        val binding=ListItemsBinding.inflate(LayoutInflater.from(context))//.inflate(R.layout.list_items,parent, false)
        return MyViewholder(binding)
    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
        val hobby=hobbies[position]
        holder.setData(hobby,position)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }
    inner class MyViewholder(binding:ListItemsBinding):RecyclerView.ViewHolder(binding.root){
            val itemsBinding=binding
        var currentHobby:Hobby?=null
        var currentPosition:Int=0
        init {
            binding.txvTitle.setOnClickListener {
                Toast.makeText(context, currentHobby!!.title+"Clicked!!", Toast.LENGTH_SHORT).show()
            }
            binding.imgShare.setOnClickListener {
                val msg:String="My hobby is: "+ currentHobby!!.title
                val intent= Intent()
                intent.action= Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,msg)
                intent.type="text/plain"
                context.startActivity(Intent.createChooser(intent,"Share to"))
            }
        }
        fun setData(hobby: Hobby?, position: Int){
            itemsBinding.txvTitle.text=hobby!!.title
            this.currentHobby=hobby
            this.currentPosition=position
        }
    }

}